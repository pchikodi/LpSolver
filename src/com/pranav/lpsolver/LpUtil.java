/**
 * 
 */
package com.pranav.lpsolver;

import java.util.List;

import com.pranav.pojo.Constraint;

import lpsolve.LpSolve;
import lpsolve.LpSolveException;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class LpUtil {
	private LpUtil() {

	}

	/**
	 * Function to solve linear equation
	 * @param constraints
	 * @param objective
	 * @param unknownVariables
	 * @return
	 */
	public static double[] solveLp(List<Constraint> constraints, String objective, int unknownVariables) {
		try {
			LpSolve solver = LpSolve.makeLp(0, unknownVariables);
			for (Constraint constraint : constraints) {
				solver.strAddConstraint(constraint.getCoefficient(), constraint.getEquality(),
						constraint.getConstraintValue());
			}
			// set objective function
			solver.strSetObjFn(objective);
			solver.setMaxim();
			solver.printLp();
			/* I only want to see important messages on screen while solving */
			solver.setVerbose(LpSolve.IMPORTANT);
			// solve the problem
			solver.solve();
			// print solution
			System.out.println("Value of objective function: " + solver.getObjective());
			double[] var = solver.getPtrVariables();
			for (int i = 0; i < var.length; i++) {
				System.out.println("Value of var[" + i + "] = " + var[i]);
			}

			// delete the problem and free memory
			solver.deleteLp();
			return var;
		} catch (LpSolveException e) {
			e.printStackTrace();
		}
		return null;
	}
}

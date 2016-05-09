/**
 * 
 */
package com.pranav.lpsolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.pranav.pojo.Constraint;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class LpSolverApp {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		try {
			acceptUserInput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void acceptUserInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput, noOfConstraints, objectiveFunction;
		int unknownVariables;
		List<Constraint> constraints = new ArrayList<Constraint>(0);
		List<String> coefficients = new ArrayList<String>(0);
		System.out.println("Enter 'q' to quit.");
		do {
			System.out.println("Enter number of unknown variabls");
			userInput = br.readLine();
			unknownVariables = Integer.parseInt(userInput);
			System.out.println("Enter number of constraints");
			userInput = br.readLine();
			noOfConstraints = userInput;
			for (int i = 0; i < Integer.parseInt(noOfConstraints); i++) {
				System.out.println("Enter your " + (i+1) + " constraint");
				Constraint constraint = new Constraint();
				int k = 0;
				coefficients = new ArrayList<String>(0);
				for (int j = 0; j < unknownVariables; j++) {
					System.out.println("Enter coefficient value for unknown variable : " + ++k);
					userInput = br.readLine();
					coefficients.add(userInput);
				}
				System.out.println("Enter constraint equality");
				System.out.println("1 for Less than eqaul to");
				System.out.println("2 for Greater than equal to");
				System.out.println("3 for equal to");
				userInput = br.readLine();
				constraint.setEquality(Integer.parseInt(userInput));
				System.out.println("Enter constraint value :");
				userInput = br.readLine();
				constraint.setConstraintValue(Double.parseDouble(userInput));
				constraint.setCoefficient(getString(coefficients));
				constraints.add(constraint);
			}
			System.out.println("Enter Objective function");
			int k = 0;
			coefficients = new ArrayList<String>(0);
			for (int j = 0; j < unknownVariables; j++) {
				System.out.println("Enter coefficient value for unknown variable : " + ++k);
				userInput = br.readLine();
				coefficients.add(userInput);
			}
			objectiveFunction = getString(coefficients);
			LpUtil.solveLp(constraints, objectiveFunction, unknownVariables);
		} while (!userInput.equals("q"));
	}

	/**
	 * Function to convert list of strings to a single string
	 * 
	 * @param coefficients
	 * @return
	 */
	private static String getString(List<String> coefficients) {
		StringBuilder coefficient = new StringBuilder("");
		int size = coefficients.size();
		int k = 0;
		for (String coeff : coefficients) {
			coefficient.append(coeff);
			if (k != size && size != 1) {
				coefficient.append(" ");
				k++;
			}
		}
		return coefficient.toString();
	}
}

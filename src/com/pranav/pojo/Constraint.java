/**
 * 
 */
package com.pranav.pojo;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class Constraint {

	private String coefficient;
	private int equality;
	private double constraintValue;

	public Constraint() {

	}

	public Constraint(String coefficient, int equality, double constraintValue) {
		this.coefficient = coefficient;
		this.equality = equality;
		this.constraintValue = constraintValue;
	}

	public String getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(String coefficient) {
		this.coefficient = coefficient;
	}

	public int getEquality() {
		return equality;
	}

	public void setEquality(int equality) {
		this.equality = equality;
	}

	public double getConstraintValue() {
		return constraintValue;
	}

	public void setConstraintValue(double constraintValue) {
		this.constraintValue = constraintValue;
	}
}

package com.greatlearning.groupassignment.departments;

/**
 * SuperDepartment is a parent class for all the departments and exhibits
 * hierarchical inheritance.
 **/

public class SuperDepartment {

	public String departmentName() {
		return (" Super Department ");
	}

	public String getTodaysWork() {
		return (" No Work as of now");
	}

	public String getWorkDeadline() {
		return (" Nil ");

	}

	public String isTodayAHoliday() {
		return (" Today is not a holiday");
	}
}

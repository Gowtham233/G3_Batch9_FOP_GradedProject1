package com.greatlearning.groupassignment.mainapplication;

import com.greatlearning.groupassignment.departments.AdminDepartment;
import com.greatlearning.groupassignment.departments.HrDepartment;
import com.greatlearning.groupassignment.departments.TechDepartment;
import com.greatlearning.groupassignment.service.StringManupulation;

/**
 * Driver/ Main class to create a object of the departments and calling the
 * methods of the different departments
 **/

public class MainApplication {
	public static void main(String[] args) {

		// Creation of child class object and service class object
		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		StringManupulation strManuplation = new StringManupulation();

		// Admin Department print statements
		System.out.println(" Welcome to" + adminDept.departmentName());
		System.out.println(strManuplation.charToLowerCase(adminDept.getTodaysWork(), 24));
		System.out.println(adminDept.getWorkDeadline().trim());
		System.out.println(strManuplation.charToUpperCase(adminDept.isTodayAHoliday().trim(), 15) + "\n");

		// HR Department print statements
		System.out.println(" Welcome to" + strManuplation.charToUpperCase(hrDept.departmentName(), 2));
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork().trim());
		System.out.println(hrDept.getWorkDeadline().trim());
		System.out.println(strManuplation.charToUpperCase(hrDept.isTodayAHoliday().trim(), 15) + "\n");

		// Technical Department print statements
		System.out.println(" Welcome to" + techDept.departmentName());
		System.out.println(strManuplation.charToUpperCase(techDept.getTodaysWork().trim(), 19));
		System.out.println(techDept.getWorkDeadline().trim());
		System.out.println(" " + strManuplation.charToUpperCase(techDept.getTechStackInformation(), 0));
		System.out.println(strManuplation.charToUpperCase(techDept.isTodayAHoliday().trim(), 15) + "\n");
	}
}

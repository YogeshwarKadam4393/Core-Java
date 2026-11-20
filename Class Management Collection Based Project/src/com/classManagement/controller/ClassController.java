package com.classManagement.controller;

import java.util.Scanner;

import com.classManagement.exceptionHandler.BatchDoesNotExistException;
import com.classManagement.exceptionHandler.CourseDoesNotExistException;
import com.classManagement.exceptionHandler.FacultyDoesNotExistException;
import com.classManagement.exceptionHandler.PredefinedExceptionHandlers;
import com.classManagement.serviceIMPL.Class_Service_Impl;

public class ClassController {

	public static void main(String[] args) {
		

        System.out.println();
        System.out.println("+------------------------------------------------------+");
        System.out.println("|                                                      |");
        System.out.println("|   WELCOME TO EduNexus - Academic Management System   |");
        System.out.println("|                                                      |");
        System.out.println("+------------------------------------------------------+");

		Scanner sc = new Scanner(System.in);
		Class_Service_Impl csi = new Class_Service_Impl();
		boolean flag = true;

		while (flag) {
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("|              EduNexus - MAIN MENU             |");
			System.out.println("=================================================");
			System.out.println("| Option | Description                          |");
			System.out.println("-------------------------------------------------");
			System.out.println("|   1    | Register New Course                  |");
			System.out.println("|   2    | View All Courses                     |");
			System.out.println("-------------------------------------------------");
			System.out.println("|   3    | Add Faculty                          |");
			System.out.println("|   4    | View Faculty Details                 |");
			System.out.println("-------------------------------------------------");
			System.out.println("|   5    | Add Batch                            |");
			System.out.println("|   6    | View Batch Details                   |");
			System.out.println("-------------------------------------------------");
			System.out.println("|   7    | Enroll Student                       |");
			System.out.println("|   8    | View Student Details                 |");
			System.out.println("-------------------------------------------------");
			System.out.println("|   9    | Update Details                       |");
			System.out.println("|  10    | Delete Details                       |");
			System.out.println("-------------------------------------------------");
			System.out.println("|  11    | Exit Application                     |");
			System.out.println("=================================================");
			System.out.print("Enter your preferred option: ");
			int option = PredefinedExceptionHandlers.getVerifiedOption();
			System.out.println("");

			switch (option) {
			case 1:
				try {
					csi.addCourses();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 2:
				csi.getAllCourses();
				break;
			case 3:
				try {
					csi.addFacultyMember();
				} catch (CourseDoesNotExistException ce) {
					System.out.println(ce);
					System.out.println("");
				} catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 4:
				csi.getAllFaculty();
				break;
			case 5:
				try {
					csi.addBatches();
				} catch (FacultyDoesNotExistException fe) {
					System.out.println(fe);
					System.out.println("");
				}catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 6:
				csi.getAllBatches();
				break;
			case 7:
				try {
					csi.addStudents();
				} catch(BatchDoesNotExistException be) {
					System.out.println(be);
					System.out.println("");
				}catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 8:
				csi.getAllStudents();
				break;
			case 9:
				try {
					csi.updateClassDetails();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 10:
				try {
					csi.deleteClassDetails();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					System.out.println("");
				}
				break;
			case 11:
				System.out.println("Are you sure you want to exit? (true/false): ");
				boolean exit = sc.nextBoolean();
				if (exit) {
					System.out.println("");
					System.out.println("[SUCCESS] Application closed successfully. Thank you.");
					System.out.println("");
					flag = false;
				} else {
					System.out.println("");
					System.out.println("[INFO] Exit operation cancelled. Returning to the main menu.");
					System.out.println("");
				}
				break;
			default:
				System.out.println("--> [ERROR] Invalid Imput, Try Again.. ");
				System.out.println("");
				break;
			}
		}
		
		csi.closeScanner();
	}
	
	


}

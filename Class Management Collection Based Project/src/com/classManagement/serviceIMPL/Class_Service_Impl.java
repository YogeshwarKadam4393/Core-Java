package com.classManagement.serviceIMPL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.classManagement.exceptionHandler.BatchDoesNotExistException;
import com.classManagement.exceptionHandler.CourseDoesNotExistException;
import com.classManagement.exceptionHandler.FacultyDoesNotExistException;
import com.classManagement.exceptionHandler.PredefinedExceptionHandlers;
import com.classManagement.model.Batch;
import com.classManagement.model.Course;
import com.classManagement.model.Faculty;
import com.classManagement.model.Student;
import com.classManagement.service.Class_Service;

public class Class_Service_Impl implements Class_Service {

	List<Course> courseList = new ArrayList<Course>();
	List<Faculty> facultyList = new ArrayList<Faculty>();
	List<Batch> batchList = new ArrayList<Batch>();
	List<Student> studentList = new ArrayList<Student>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourses() {
		System.out.print("--> Enter The Number Of Courses To Add :- ");
		int n = PredefinedExceptionHandlers.getVerifiedInputValue();
		System.out.println("");
//		sc.nextLine();
		for (int i = 1, j = 1; i <= n; ++i, ++j) {
			Course course = new Course();
			System.out.println("-->  Course " + j + " Details  <--");
			System.out.println("");
			System.out.print("--> Enter Course ID       :- ");
			int cid = PredefinedExceptionHandlers.getVerifiedInputValue();
//			sc.nextLine();
			course.setCid(cid);
			System.out.print("--> Enter Course Name     :- ");
			String cname = sc.nextLine();
			course.setCname(cname);
			courseList.add(course);
			System.out.println("");
		}
		System.out.println("=========================================================");
		System.out.println("|   [SUCCESS] Courses have been added successfully.     |");
		System.out.println("=========================================================");
	}

	@Override
	public void getAllCourses() {
		System.out.println("===========================================");
		System.out.println("|    [INFO] Retrieving all courses...     |");
		System.out.println("===========================================");
		System.out.println("");
		for (Course course : courseList) {
			if (course != null) {
				System.out.println("| Course ID   : " + course.getCid());
				System.out.println("| Course Name : " + course.getCname());
				System.out.println("-------------------------------------------------");
			}
		}
	}

	@Override
	public void addFacultyMember() {
		System.out.print("--> Enter The Number Of Faculty To Add :- ");
		int n = PredefinedExceptionHandlers.getVerifiedInputValue();
//		sc.nextLine();
		System.out.println("");
		boolean courseAvailable = false;
		for (int i = 1, j = 1; i <= n; ++i, ++j) {
			Faculty faculty = new Faculty();
			System.out.println("-->  Faculty " + j + " Details  <--");
			System.out.println("");
			System.out.print("--> Enter Faculty Id :- ");
			int fid = PredefinedExceptionHandlers.getVerifiedInputValue();
//			sc.nextLine();
			faculty.setFid(fid);
			System.out.print("--> Enter Faculty Name :-");
			String fname = sc.nextLine();
			faculty.setFname(fname);
			System.out.println("");
			getAllCourses();
			System.out.print(
					"--> Enter the Course ID From Above Mentioned Course List You want to Allocate to the Faculty :-  ");
			int cid = PredefinedExceptionHandlers.getVerifiedInputValue();
			for (Course course : courseList) {
				if (course != null && cid == course.getCid()) {
					faculty.setCourse(course);
					courseAvailable = true;
					break;
				}
			}
			facultyList.add(faculty);
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("|  [SUCCESS] Faculty added successfully.  |");
			System.out.println("===========================================");
			System.out.println("");
		}
		if (!courseAvailable) {
			throw new CourseDoesNotExistException("Course Not Available");
		}
	}

	@Override
	public void getAllFaculty() {
		System.out.println("===========================================");
		System.out.println("|  [INFO] Retrieving faculty details...   |");
		System.out.println("===========================================");
		System.out.println("");
		for (Faculty faculty : facultyList) {
			if (faculty != null) {

				System.out.println("| Faculty ID   : " + faculty.getFid());
				System.out.println("| Faculty Name : " + faculty.getFname());

				if (faculty.getCourse() != null) {
					System.out.println("| Course ID    : " + faculty.getCourse().getCid());
					System.out.println("| Course Name  : " + faculty.getCourse().getCname());
				} else {
					System.out.println("| Course       : Not Assigned");
				}

				System.out.println("-------------------------------------------------");
			}
		}
	}

	@Override
	public void addBatches() {
		System.out.print("--> Enter the Number of Batches To Add :- ");
		int n = sc.nextInt();
//		sc.nextLine();
		boolean faculty1Available = false;
		boolean faculty2Available = false;
		System.out.println("");
		for (int i = 1, j = 1; i <= n; ++i, ++j) {
			Batch batch = new Batch();
			System.out.println("-->  Batch " + j + " Details  <--");
			System.out.println("");
			System.out.print("--> Enter Batch Id :- ");
			int bid = PredefinedExceptionHandlers.getVerifiedInputValue();
			sc.nextLine();
			batch.setBid(bid);
			System.out.print("--> Enter Batch Name :- ");
			String bname = sc.nextLine();
			batch.setBname(bname);
			System.out.println("");
			getAllFaculty();
			System.out.print(
					"--> Enter the Faculty 1 Id From Above Mentioned Faculty List You Want to Allocate to Batch :- ");
			int fid1 = PredefinedExceptionHandlers.getVerifiedInputValue();
			for (Faculty faculty : facultyList) {
				if (faculty != null && fid1 == faculty.getFid()) {
					batch.setFaculty1(faculty);
					System.out.println("");
					System.out.println("--> Allocated Faculty 1 :- " + batch.getFaculty1().getFname() + " for Batch "
							+ batch.getBname());
					faculty1Available = true;
					break;
				}
			}
			System.out.println("");
			getAllFaculty();
			System.out.print(
					"--> Enter the Faculty 2 Id From Above Mentioned Faculty List You Want to Allocate to Batch :- ");
			int fid2 = PredefinedExceptionHandlers.getVerifiedInputValue();
			if (fid1 != fid2) {
				for (Faculty faculty : facultyList) {
					if (faculty != null && fid2 == faculty.getFid()) {
						batch.setFaculty2(faculty);
						System.out.println("");
						System.out.println("--> Allocated Faculty 2 :- " + batch.getFaculty2().getFname()
								+ " for Batch " + batch.getBname());
						faculty2Available = true;
						break;
					}
				}
			} else {
				System.out.println("--> Faculty Already Added !!");
			}
			batchList.add(batch);
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("|  [SUCCESS] Batch added successfully.    |");
			System.out.println("===========================================");
			System.out.println("");
		}
		if (!faculty1Available) {
			throw new FacultyDoesNotExistException("Faculty Not Available");
		}
		if (!faculty2Available) {
			throw new FacultyDoesNotExistException("Faculty Not Available");
		}
	}

	@Override
	public void getAllBatches() {
		System.out.println("===========================================");
		System.out.println("|  [INFO] Retrieving batch details...     |");
		System.out.println("===========================================");
		System.out.println("");
		for (Batch batch : batchList) {
			if (batch != null) {

				System.out.println("| Batch ID     : " + batch.getBid());
				System.out.println("| Batch Name   : " + batch.getBname());

				if (batch.getFaculty1() != null) {
					System.out.println("| Faculty 1 Name    : " + batch.getFaculty1().getFname());
					System.out.println("| Faculty 1 Course  : " + batch.getFaculty1().getCourse());
				} else {
					System.out.println("| Faculty 1    : Not Assigned");
				}

				if (batch.getFaculty2() != null) {
					System.out.println("| Faculty 2 Name   : " + batch.getFaculty2().getFname());
					System.out.println("| Faculty 2 Course : " + batch.getFaculty2().getCourse());
				} else {
					System.out.println("| Faculty 2    : Not Assigned");
				}

				System.out.println("-------------------------------------------------");
			}
		}
	}

	@Override
	public void addStudents() {
		System.out.print("--> Enter the Number Of Students To Add :- ");
		int n = PredefinedExceptionHandlers.getVerifiedInputValue();
//		sc.nextLine();
		boolean batchFound = false;
		System.out.println();
		for (int i = 1, j = 1; i <= n; ++i, ++j) {
			Student student = new Student();
			System.out.println("-->  Student " + j + " Details  <--");
			System.out.println("");
			System.out.print("--> Enter Student ID :- ");
			int sid = PredefinedExceptionHandlers.getVerifiedInputValue();
//			sc.nextLine();
			student.setSid(sid);
			System.out.print("--> Enter Student name :- ");
			String sname = sc.nextLine();
			student.setSname(sname);
			System.out.println("");
			getAllBatches();
			System.out.print(
					"--> Enter the Batch ID from below Mentioned Batch Lists You Want To Allocate to Faculty :- ");
			int bid = PredefinedExceptionHandlers.getVerifiedInputValue();
			for (Batch batch : batchList) {
				if (batch != null && bid == batch.getBid()) {
					student.setBatch(batch);
					System.out.println("");
					System.out.println("--> Allocated Batch :- " + student.getBatch().getBname() + " for Student "
							+ student.getSname());
					batchFound = true;
					break;
				}
			}
			studentList.add(student);
			System.out.println("");
			System.out.println("===========================================");
			System.out.println("|  [SUCCESS] Students added successfully. |");
			System.out.println("===========================================");
			System.out.println("");
		}

		if (!batchFound) {
			throw new BatchDoesNotExistException("Batch Not Found");
		}
	}

	@Override
	public void getAllStudents() {
		System.out.println("===========================================");
		System.out.println("|  [INFO] Retrieving all student details. |");
		System.out.println("===========================================");
		System.out.println("");
		for (Student student : studentList) {
			if (student != null) {

				System.out.println("| Student ID   : " + student.getSid());
				System.out.println("| Student Name : " + student.getSname());

				if (student.getBatch() != null) {
					System.out.println("| Batch Name   : " + student.getBatch().getBname());

					if (student.getBatch().getFaculty1() != null) {
						System.out.println("| Faculty 1    : " + student.getBatch().getFaculty1().getFname());
						System.out.println("| Course       : " + student.getBatch().getFaculty1().getCourse().getCname());
					}

					if (student.getBatch().getFaculty2() != null) {
						System.out.println("| Faculty 2    : " + student.getBatch().getFaculty2().getFname());
						System.out.println("| Course       : " + student.getBatch().getFaculty2().getCourse());
					}
				} else {
					System.out.println("| Batch        : Not Assigned");
				}
				System.out.println("-------------------------------------------------");
			}
		}
	}

	@Override
	public void updateClassDetails() {
		System.out.print("--> Enter the ID of Student You want to Update Details of :- ");
		int sid = getValidStudentId();
		boolean flag = true;
		for (Student student : studentList) {
			if (student != null && sid == student.getSid()) {
				while (flag) {
					System.out.println();
					System.out.println("╔══════════════════════════════════════════════════════╗");
					System.out.println("║                  STUDENT UPDATE MENU               ║");
					System.out.println("╠════╦═════════════════════════════════════════════════╣");
					System.out.println("║ No ║ Update Option                                 ║");
					System.out.println("╠════╬═════════════════════════════════════════════════╣");
					System.out.println("║  1 ║ Update Student Name                           ║");
					System.out.println("║  2 ║ Update Batch Name                             ║");
					System.out.println("╠════╬═════════════════════════════════════════════════╣");
					System.out.println("║  3 ║ Update Faculty 1 Name                         ║");
					System.out.println("║  4 ║ Update Faculty 2 Name                         ║");
					System.out.println("╠════╬═════════════════════════════════════════════════╣");
					System.out.println("║  5 ║ Update Faculty 1 Course Name                  ║");
					System.out.println("║  6 ║ Update Faculty 2 Course Name                  ║");
					System.out.println("╠════╬═════════════════════════════════════════════════╣");
					System.out.println("║  7 ║ Confirm and Save Updates                      ║");
					System.out.println("║  0 ║ Return to Main Menu                           ║");
					System.out.println("╚════╩═════════════════════════════════════════════════╝");
					System.out.print("► Enter Your Choice : ");
					int op = PredefinedExceptionHandlers.getVerifiedOption();
					sc.nextLine();
					System.out.println("");
					switch (op) {
					case 1:
						System.out.println("--> Current Student Name   :- " + student.getSname());
						System.out.print("--> Enter New Student name :- ");
						String sname = sc.nextLine();
//						sc.nextLine();
						student.setSname(sname);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Updated Student Name: " + student.getSname());
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 2:
						System.out.println("--> Current Batch Name   :- " + student.getBatch().getBname());
						System.out.print("--> Enter New Batch Name :- ");
						String bname = sc.nextLine();
//						sc.nextLine();
						student.getBatch().setBname(bname);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Updated Batch Name: " + student.getBatch().getBname() + " |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 3:
						System.out.println("--> Current Faculty 1 Name   :- " + student.getBatch().getFaculty1().getFname());
						System.out.print("--> Enter New Faculty 1 Name :- ");
						String f1name = sc.nextLine();
//						sc.nextLine();
						student.getBatch().getFaculty1().setFname(f1name);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Faculty 1 Updated: " + student.getBatch().getFaculty1().getFname() + " |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 4:
						System.out.println("--> Current Faculty 2 Name       :- " + student.getBatch().getFaculty2().getFname());
						System.out.print("--> Enter New Name For Faculty 2 :- ");
						String f2name = sc.nextLine();
//						sc.nextLine();
						student.getBatch().getFaculty2().setFname(f2name);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Faculty 2 Updated: " + student.getBatch().getFaculty2().getFname() + " |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 5:
						System.out.println("--> Current Faculty 1 Course Name       :- "
								+ student.getBatch().getFaculty1().getCourse().getCname());
						System.out.print("--> Enter New Name for Faculty 1 Course :- ");
						String f1cname = sc.nextLine();
//						sc.nextLine();
						student.getBatch().getFaculty1().getCourse().setCname(f1cname);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Faculty 1 Course: "
								+ student.getBatch().getFaculty1().getCourse().getCname() + " |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 6:
						System.out.println("--> Current Faculty 2 Course Name       :- "
								+ student.getBatch().getFaculty2().getCourse().getCname());
						System.out.print("--> Enter New Name for Faculty 2 Course :-");
						String f2cname = sc.nextLine();
//						sc.nextLine();
						student.getBatch().getFaculty2().getCourse().setCname(f2cname);
						System.out.println("");
						System.out.println("===========================================");
						System.out.println("|  Faculty 2 Course: "
								+ student.getBatch().getFaculty2().getCourse().getCname() + " |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					case 7:
						System.out.print("--> Save Changes (Yes/No) :- ");
						String change = sc.next();
						if (change.equalsIgnoreCase("yes")) {
							System.out.println("");
							System.out.println("===========================================");
							System.out.println("|  [SUCCESS] Changes applied successfully.|");
							System.out.println("===========================================");
							System.out.println("");
							flag = false;
						} else if(change.equalsIgnoreCase("no")) {
							System.out.println("");
							System.out.println("===========================================");
							System.out.println("|  [INFO] Update operation cancelled.     |");
							System.out.println("===========================================");
						}
						break;
					default:
						System.out.println("===========================================");
						System.out.println("|  [ERROR] Invalid input. Try again.      |");
						System.out.println("===========================================");
						System.out.println("");
						break;
					}
				}
			}
		}
	}

	@Override
	public void deleteClassDetails() {
		boolean flag = true;
		while (flag) {
			System.out.println("");

			System.out.println("=========================================================");
			System.out.println("|                DELETE MANAGEMENT PANEL                |");
			System.out.println("=========================================================");
			System.out.println("|                 1. Delete Course                      |");
			System.out.println("|                 2. Delete Faculty                     |");
			System.out.println("|                 3. Delete Batch                       |");
			System.out.println("|                 4. Delete Student                     |");
			System.out.println("|                 5. Confirm Deletion                   |");
			System.out.println("=========================================================");

			System.out.println("");

			System.out.print("--> Enter Your Preferred Option: ");
			int op = PredefinedExceptionHandlers.getVerifiedOption();
			System.out.println("");
			switch (op) {
			case 1:
				getAllCourses();
				System.out.print("--> Enter Course ID from Above mentioned batch List You want to Delete :-");
				int cid = getValidCourseID();
				for (Course course : courseList) {
					if (course != null && cid == course.getCid()) {
						courseList.remove(course);
					}
				}
				System.out.println("");
				System.out.println("===========================================");
				System.out.println("|  [SUCCESS] Courses deleted successfully.|");
				System.out.println("===========================================");
				System.out.println("");
				break;
			case 2:
				getAllFaculty();
				System.out.print("--> Enter Faculty ID from Above mentioned batch List You want to Delete :-");
				int fid = getValidFacultyID();
				for (Faculty faculty : facultyList) {
					if (faculty != null && fid == faculty.getFid()) {
						facultyList.remove(faculty);
					}
				}
				System.out.println("");
				System.out.println("===========================================");
				System.out.println("|  [SUCCESS] Faculty deleted successfully.|");
				System.out.println("===========================================");
				System.out.println("");
				break;
			case 3:
				getAllBatches();
				System.out.print("--> Enter Batch ID from above mentioned batch List You want to Delete :-");
				int bid = getValidBatchId();
				for (Batch batch : batchList) {
					if (batch != null && bid == batch.getBid()) {
						batchList.remove(batch);
					}
				}
				System.out.println("");
				System.out.println("===========================================");
				System.out.println("|  [SUCCESS] Batch deleted successfully.  |");
				System.out.println("===========================================");
				System.out.println("");
				break;
			case 4:
				getAllStudents();
				System.out.print("--> Enter Student ID Of The Student from the Above List You Want To Delete :- ");
				int sid = getValidStudentId();
				for (Student student : studentList) {
					if (student != null && sid == student.getSid()) {
						studentList.remove(student);
					}
				}
				System.out.println("");
				System.out.println("===========================================");
				System.out.println("|  [SUCCESS] Student deleted successfully.|");
				System.out.println("===========================================");
				System.out.println("");
				break;
			case 5:
				System.out.print("Confirm Changes (true/false) :- ");
				boolean change = sc.nextBoolean();
				if (change) {
					System.out.println("");
					System.out.println("|-----------------------------------------|");
					System.out.println("| [SUCCESS] Changes applied successfully. |");
					System.out.println("|-----------------------------------------|");
					System.out.println("");
					flag = false;
				} else {
					System.out.println("");
					System.out.println("===========================================");
					System.out.println("|  [INFO] Delete operation cancelled.     |");
					System.out.println("===========================================");
				}
				break;
			default:
				System.out.println("===========================================");
				System.out.println("|  [ERROR] Invalid input. Try again.      |");
				System.out.println("===========================================");
				System.out.println("");
				break;
			}
		}
	}

	public int getValidStudentId() {
		int sid = sc.nextInt();
		boolean found = false;
		for (Student student : studentList) {
			if (student != null && sid == student.getSid()) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.print("--> [ERROR] Student not found, "
					+ "\n Please Enter a Valid Student ID from below mentioned Students :- ");
			getAllStudents();
			return getValidStudentId();
		}
		return sid;
	}

	public int getValidBatchId() {
		int bid = sc.nextInt();
		boolean found = false;
		System.out.println("");
		for (Batch batch : batchList) {
			if (batch != null && bid == batch.getBid()) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.print("--> [ERROR] Batch not found, "
					+ "\n Please Enter a Valid Batch ID from below mentioned Batches :- ");
			getAllBatches();
			return getValidBatchId();
		}
		return bid;
	}

	public int getValidFacultyID() {
		int fid = sc.nextInt();
		boolean found = false;
		for (Faculty faculty : facultyList) {
			if (faculty != null && fid == faculty.getFid()) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.print("--> [ERROR] Faculty not found, "
					+ "\n Please Enter a Valid Faculty ID from below mentioned Batches :- ");
			getAllFaculty();
			return getValidFacultyID();
		}
		return fid;
	}

	public int getValidCourseID() {
		int cid = sc.nextInt();
		boolean found = false;
		for (Course course : courseList) {
			if (course != null && cid == course.getCid()) {
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.print("--> [ERROR] Faculty not found, "
					+ "\n Please Enter a Valid Faculty ID from below mentioned Batches :- ");
			getAllCourses();
			return getValidCourseID();
		}
		return cid;
	}

	public void closeScanner() {
		sc.close();
	}
}

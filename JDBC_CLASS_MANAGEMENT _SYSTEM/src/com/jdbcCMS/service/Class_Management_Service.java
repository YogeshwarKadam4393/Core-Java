package com.jdbcCMS.service;

import java.sql.Connection;

public interface Class_Management_Service {
	
	void addCourse(Connection connection);
	void fetchAllCourses(Connection connection);
	void addFacultyMember(Connection connection);
	void fetchAllFacultyMembers(Connection connection);
	void addBatch(Connection connection);
	void fetchAllBatches(Connection connection);
	void registerStudent(Connection connection);
	void fetchAllStudents(Connection connection);
	void updateClassDetails(Connection connection);
	void fetchStudentByID(Connection connection);
	void deleteClassById(Connection connection);
	void exitApplication();
	
}

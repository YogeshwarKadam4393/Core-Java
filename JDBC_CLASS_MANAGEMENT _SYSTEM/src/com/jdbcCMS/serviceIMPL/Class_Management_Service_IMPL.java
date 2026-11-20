package com.jdbcCMS.serviceIMPL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

import com.jdbcCMS.connection.My_Connection;
import com.jdbcCMS.service.Class_Management_Service;

public class Class_Management_Service_IMPL implements Class_Management_Service {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void addCourse(Connection connection) {
		System.out.print("--> Enter Course Count :- ");
		int n = sc.nextInt();
		System.out.println("");
		try  {
			for(int i = 1,j = 1;i<=n;++i,++j) {
				String query1 = "INSERT INTO course(cname) VALUES (?)";
				PreparedStatement pst = connection.prepareStatement(query1);
				System.out.print("--> Enter Course " + j + " Name :- ");
				pst.setString(1, sc.next());
				pst.executeUpdate();
				System.out.println("--> Course Added Successfully !!");
				System.out.println("");
			}
			System.out.println("");
			System.out.println("===============================================");
			System.out.println("|       All Courses Added Successfully        |");
			System.out.println("===============================================");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println(e);
			System.out.println("");
		}
		
	}

	@Override
	public void fetchAllCourses(Connection connection) {
		System.out.println("=================================================");
		System.out.println("|        Retrieving Course Records...           |");
		System.out.println("=================================================");
		System.out.println("");
		String sql1 = "Select * From Course";
		try (PreparedStatement pst = connection.prepareStatement(sql1);){
			ResultSet rs = pst.executeQuery();
			System.out.println("============================================");
			System.out.println("|            Course Details                |");
			System.out.println("============================================");
			while(rs.next()) {
				System.out.println("--> Course ID    :- " + rs.getInt(1));
				System.out.println("--> Course Name  :- " + rs.getString(2));
				System.out.println("--------------------------------------------");
			}
			System.out.println("");
			System.out.println("===============================================");
			System.out.println("|      All Courses Fetched Successfully       |");
			System.out.println("===============================================");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println(e);
			System.out.println("");
		}
		
	}

	@Override
	public void addFacultyMember(Connection connection) {
		System.out.print("--> Enter Faculty Count :- ");
		int n = sc.nextInt();
		System.out.println("");
		String sql1 = "INSERT INTO faculty(fname,cid) VALUES (?,?)";
		try (PreparedStatement pst = connection.prepareStatement(sql1)) {
			for(int i = 1,j = 1; i <= n; ++i,++j) {
				System.out.print("--> Enter Faculty " + j + " Name :- ");
				pst.setString(1, sc.next());
				System.out.println("");
				fetchAllCourses(connection);
				System.out.print("--> Enter the Course ID From Above List You Want to Assign to this Faculty :- ");
				pst.setInt(2, sc.nextInt());
				pst.executeUpdate();
				System.out.println("--> Faculty Added Successfully !!");
				System.out.println("");
			}
			System.out.println("");
			System.out.println("=================================================");
			System.out.println("|       All Faculties Added Successfully        |");
			System.out.println("=================================================");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void fetchAllFacultyMembers(Connection connection) {
		System.out.println("=================================================");
		System.out.println("|        Retrieving Faculty Records...          |");
		System.out.println("=================================================");
		System.out.println("");
		String query1 = "SELECT f.fid,f.fname,c.cid,c.cname FROM faculty f LEFT JOIN course c ON c.cid = f.cid";
		try (PreparedStatement pst = connection.prepareStatement(query1)) {
			ResultSet rs = pst.executeQuery();
			System.out.println("============================================");
			System.out.println("|            Faculty Details               |");
			System.out.println("============================================");
			while(rs.next()) {
				System.out.println("--> Faculty ID    :- " + rs.getInt(1));
				System.out.println("--> Faculty Name  :- " + rs.getString(2));
				System.out.println("--> Course ID     :- " + rs.getInt(3));
				System.out.println("--> Course Name   :- " + rs.getString(4));
				System.out.println("--------------------------------------------");
			}
			System.out.println("");
			System.out.println("=======================================================");
			System.out.println("|      All Faculty Records Fetched Successfully       |");
			System.out.println("=======================================================");
			System.out.println("");
		} catch (Exception e) {
			System.out.println("");
			System.out.println(e);
			System.out.println("");
		}
	}

	@Override
	public void addBatch(Connection connection) {
		System.out.print("--> Enter Batch Count :- ");
		int n = sc.nextInt();
		System.out.println("");
		String query1 = "INSERT INTO batch(bname) VALUES (?)";
		try (PreparedStatement pst = connection.prepareStatement(query1)) {
			System.out.print("--> Enter ");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void fetchAllBatches(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerStudent(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchAllStudents(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClassDetails(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchStudentByID(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClassById(Connection connection) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitApplication() {
		// TODO Auto-generated method stub
		
	}
	
	
}

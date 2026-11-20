package com.jdbcCMS.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbcCMS.connection.My_Connection;

public class Batch_Table {
	
	private static void createBatchTable() {
		
		try (Connection connection = My_Connection.getConnection();
				Statement smt = connection.createStatement();) {
			String sql1 = "CREATE TABLE batch (bid INT PRIMARY KEY AUTO_INCREMENT, bname VARCHAR(50) NOT NULL UNIQUE"
					+ ", fid INT, FOREIGN KEY (fid) REFERENCES faculty (fid))";
			String sql2 ="ALTER TABLE batch AUTO_INCREMENT=101";
			smt.executeUpdate(sql1);
			smt.executeUpdate(sql2);
			System.out.println("");
			System.out.println("==============================================");
			System.out.println("--> Batch Table Created");
		} catch (ClassNotFoundException ce) {
			System.out.println(ce);
		} catch (SQLException se) {
			System.out.println(se);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		createBatchTable();
	}
}

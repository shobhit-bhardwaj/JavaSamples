package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUDOperations {
	private void insertRecord(Employ employ) {
		System.out.println("Inserting Record Start");

		try {
			Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();
			String query = "insert into employ (name, designation, salary) values ('"+employ.getName()+"', '"+employ.getDesignation()+"', "+employ.getSalary()+");";
			statement.executeUpdate(query);
			DBUtils.closeResources(connection, statement);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Inserting Record End");
	}

	private void updateRecord(Employ employ) {
		System.out.println("Updating Record Start");

		try {
			Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();
			String query = "update employ set name='"+employ.getName()+"', designation='"+employ.getDesignation()+"', salary="+employ.getSalary()+" where id="+employ.getId()+";";
			statement.executeUpdate(query);
			DBUtils.closeResources(connection, statement);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Updating Record End");
	}

	private void fetchRecords(int id) {
		System.out.println("Fetching Records Start");

		try {
			Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();
			String appender = (id == -1) ? "" : " where id="+id;
			String query = "select * from employ"+appender+";";
			ResultSet resultSet = statement.executeQuery(query);
			Employ employ = null;
			while(resultSet.next()) {
				employ = new Employ(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("designation"), resultSet.getInt("salary"));
				System.out.println(employ);
			}
			DBUtils.closeResources(connection, statement, resultSet);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Fetching Records End");
	}

	private void deleteRecord(int id) {
		System.out.println("Deleting Record Start");

		try {
			Connection connection = DBUtils.getConnection();
			Statement statement = connection.createStatement();
			String query = "delete from employ where id="+id+";";
			statement.executeUpdate(query);
			DBUtils.closeResources(connection, statement);
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Deleting Record End");
	}

	public static void main(String[] args) {
		CRUDOperations operations = new CRUDOperations();

		Employ employ = new Employ("Shobhit", "Java Trainee", 17000);
		operations.insertRecord(employ);

		employ = new Employ(1, "Shobhit Bhardwaj", "Java Developer", 22000);
		operations.updateRecord(employ);

		operations.fetchRecords(1);
		//operations.fetchRecords(-1);

		operations.deleteRecord(3);
	}
}
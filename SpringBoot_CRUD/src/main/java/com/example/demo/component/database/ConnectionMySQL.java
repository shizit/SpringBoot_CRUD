package com.example.demo.component.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

import com.example.demo.component.propertyutil.GetDBProperty;


@Component
public class ConnectionMySQL {
	
	public String     serverName   = GetDBProperty.getProperty("serverName");
	public String     databaseName = GetDBProperty.getProperty("databaseName");
	public String     user         = GetDBProperty.getProperty("user");
	public String     password     = GetDBProperty.getProperty("password");
	public String     url          = "jdbc:mysql://" + serverName + "/" + databaseName + "?characterEncoding=UTF-8&serverTimezone=JST";
	public Connection conn;
	
	public ConnectionMySQL() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
		
		}catch( Exception e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {			
			return this.conn;
	}
}

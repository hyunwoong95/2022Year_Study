package kr.human.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class JDBCUtil {
	// DBCP에서 컨넥션 얻기
	public static Connection getDBCP() {
		Connection conn = null;
		try {
			Context initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/mariaDB");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	// Connection 얻기
	public static Connection getConnection() {
		Connection conn = null;
		String driverName="org.mariadb.jdbc.Driver";
		// jdbc:mariadb://서버아이피:포트번호/DB이름
		String url="jdbc:mariadb://localhost:3306/jspdb";
		String user="jspuser";
		String password="123456";
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static Connection getConnection(String filename) {
		Connection conn = null;
		String driverName="org.sqlite.JDBC";
		// jdbc:mariadb://서버아이피:포트번호/DB이름
		String url="jdbc:sqlite:" + filename;
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	// 닫기
	public static void close(Connection conn) {
		try {
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			if(stmt!=null) stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			if(rs!=null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void rollback(Connection conn) {
		try {
			if(conn!=null) conn.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

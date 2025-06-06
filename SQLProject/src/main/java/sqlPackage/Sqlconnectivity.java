package sqlPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sqlconnectivity {

	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbURL = "jdbc:sqlserver://localhost:1433;databasename=college_details;encrypt=true;trustServerCertificate=true;"; 
			//add the database name that we created in sql.
			//String dbURL ="jdbc:sqlserver://localhost:1433;databasename=college_details;integratedSecurity=true";
			String user = "mintu"; // username
			// String user = "sa";
			String pass = "sql@2025"; // password
			// String pass = "";

			conn = DriverManager.getConnection(dbURL, user, pass);// Establishing Connection

			if (conn != null) {
				Statement st;
				st = conn.createStatement();// Creating Statement
				String query = "update Student set Name = 'Sanu' where Name = 'Anju'";
				String query1 = "select * from Student";

				int res = st.executeUpdate(query);// Execute statement--when using update,insert commands.. output comes
													// as integer(1)row affected.. so have to store in integer
				if (res > 0) {
					System.out.println("Updated");
				} else {
					System.out.println("update unsuccessful");
				}
				ResultSet rs = st.executeQuery(query1);// Execute statement gets data from the table
				while (rs.next()) {
					int Roll_id = rs.getInt(1);
					String Name = rs.getString(2);
					String Dept = rs.getString(3);
					System.out.println(Roll_id + " " + Name + " " + Dept);

				}

			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

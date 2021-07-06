package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionDemo02 {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBURL = "jdbc:mysql://118.25.68.57:3306/hotel";
	public static final String DBUSER = "root";
	public static final String DBPASS = "940803";

	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(connection);
		PreparedStatement preparedStatement = connection.prepareStatement("select count(1) from hotel.boolroom");
		boolean execute = preparedStatement.execute();
		System.out.println(execute);
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

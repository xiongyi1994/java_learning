package jdbc;

import keywords.StaticFunction;

public class ConnectionDemo01 {
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	public static void main(String[] args) {
		try {
			Class.forName(DBDRIVER);
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

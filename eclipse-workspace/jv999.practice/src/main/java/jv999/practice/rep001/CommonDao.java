package jv999.practice.rep001;

public class CommonDao {
	protected static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	protected static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	protected static final String JDBC_USER = "jv250";
	protected static final String JDBC_PASSWORED = "jv250";
	
	CommonDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package Com.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBconnections {
	
	

	public static Connection getconnection() throws ClassNotFoundException, SQLException

	{
		// String prefix

		String drivername = "com.mysql.cj.jdbc.Driver";
		String urlname = "jdbc:mysql://localhost:3306/emp";
		String username = "root";
		String psd = "root";
		return getconnection(drivername, urlname, username, psd);

	}

	public static Connection getconnection(String driver, String url, String un, String pwd)
			throws SQLException, ClassNotFoundException {
		Connection con = null;
		Class.forName(driver);

		con = DriverManager.getConnection(url, un, pwd);
		return con;

	}

	public static List<Map<String, Object>> getrecordsasmap(String query) throws ClassNotFoundException, SQLException {

		ArrayList<Map<String, Object>> arrylist = new ArrayList<Map<String, Object>>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		
			con = DBconnections.getconnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {

				HashMap<String, Object> map = new HashMap<String, Object>();

				int colcount = rs.getMetaData().getColumnCount();

				for (int i = 1; i <= colcount; colcount++) {

					map.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));

				}

				arrylist.add(map);

			}
		
		

		return arrylist;

	}
	
	
	
	
	
	
	
	
	
	
	

}

package com.bashpole.promotermotor.landingpage;


import java.sql.*;
import java.util.*;

// A data access object class that is used to retrieve 
// needed data from the database from a given ad ID and 
// list of variable names. 

public class LandingPageDAO {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  

	//TODO: replace with your own credentials
	static final String USER = "root";
	static final String PASS = "kelly5638"; 
	// Local dburl
	static final String DB_URL = "jdbc:mysql://localhost:3306/landingPage_N4G";
	static final String DB_NAME = "landingPage_N4G";
	static final String ORG_TABLE_NAME = "intakeclientinfo";
	static final String WEBPAGE_TABLE_NAME = "intakeclientwebpage";
	Connection conn = null;
	
	
	// Take username, password and database url as input to 
	// make the connection to mysql database
	public LandingPageDAO(String user, String password, String dburl) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.conn = DriverManager.getConnection(dburl, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Return a map between keywords and their corresponding values
	 * @param adID query with given adID will find specific webpage row in webpage table
	 * @return
	 */
	public Map<String, String> getConcreteAd(int adID) {
		// execute the corresponding sql command
		Map<String, String> result = new HashMap<>();
		
    	try {
			//String sqlFormat = "SELECT * from intakeclientinfo, intakeclientwebpage where intakeclientwebpage.id = ? and intakeclientinfo.orgein = intakeclientwebpage.orgein;";	
    		String sqlFormat = "SELECT * from intakeclientinfo where intakeclientinfo.id = ?;";
    		
    		PreparedStatement stmt = this.conn.prepareStatement(sqlFormat);
			stmt.setInt(1, adID);
			
			
			// query the database
			ResultSet rs = stmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();

			int columnCount = rsmd.getColumnCount();
			
			// get column names
			List<String> names = new ArrayList<String>();
			for (int i = 1; i <= columnCount; i++ ) {
				String name = rsmd.getColumnName(i);
				names.add(name);
			}
			
			// add query result to the result map
			while(rs.next()) {
				for(String varName : names) {
					String varValue = rs.getString(varName);
					if(varValue != null )
						result.put(varName, varValue.trim());
					else {
						result.put(varName, "Null");
						System.out.println(varName + " shouldn't be null");
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
	    return result;
	}
	
	
}

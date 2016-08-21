package com.QuABaseBD.staticClasses;

import java.sql.*;


/**
 * Created by andrewdickens on 7/2/16.
 */
public class Database {

		public static final String DATABASE_USERNAME = "root";
		public static final String DATABASE_PASSWORD = "andrew";
		public static final String DATABASE_URL = "jdbc:mysql://localhost/DATABASE_TECH_AND_FEATURES";

		String Name;
		String Description;

		public String getName() {
				return Name;
		}

		public void setName(String name) {
				Name = name;
		}

		public String getDescription() {
				return Description;
		}

		public void setDescription(String description) {
				Description = description;
		}

		/**
		 *
		 * @param databaseName
		 * @param featureType
		 * @return
		 */
		public static String retrieveDescription(String databaseName, String featureType) {

				// JDBC driver name and database URL
				String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				String DB_URL = DATABASE_URL;

				//  SQLDatabase credentials
				String USER = DATABASE_USERNAME;
				String PASS = DATABASE_PASSWORD;

				String returnValue = null;

				Connection conn = null;
				Statement stmt = null;
				try {
						Class.forName(JDBC_DRIVER);
						conn = DriverManager.getConnection(DB_URL, USER, PASS);

						stmt = conn.createStatement();

						StringBuilder sqlString = new StringBuilder();
						sqlString.append(
								"SELECT d.featureCategoryName FROM FEATURE_CATEGORY d WHERE d.featureCategoryName like '%{" + featureType + "%' and d.featureCategoryName like '%")
								.append(databaseName).append("%'");

						String sql = sqlString.toString();
						ResultSet rs = stmt.executeQuery(sql);
						rs.next();
						returnValue = rs.getString(1);

				} catch (SQLException se) {
						se.printStackTrace();
				} catch (Exception e) {
						e.printStackTrace();
				} finally {
						try {
								if (stmt != null)
										stmt.close();
						} catch (SQLException se2) {
						}
						try {
								if (conn != null)
										conn.close();
						} catch (SQLException se) {
								se.printStackTrace();
						}
				}

				return returnValue;

		}
}

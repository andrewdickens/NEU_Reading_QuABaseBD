package com.mkyong;

import javax.xml.crypto.Data;
import java.sql.*;


/**
 * Created by andrewdickens on 7/2/16.
 */
public class Database {

		String Name;
		String Description;
		DatabaseDescription databaseDescription;

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

		public DatabaseDescription getDatabaseDescription() {
				return databaseDescription;
		}

		public void setDatabaseDescription(DatabaseDescription databaseDescription) {
				this.databaseDescription = databaseDescription;
		}


//		public void setDatabaseDescription(String[][] descriptionMatrix){
//				databaseDescription returnValue = new databaseDescription();
//				returnValue.setFeatureType(descriptionMatrix[0][0]);
//				returnValue.setDatabaseName(descriptionMatrix[1][1]);
//				returnValue.setConfigurationFiles(descriptionMatrix[2][1]);
//				returnValue.setAdminConfigFileURL(descriptionMatrix[3][1]);
//				returnValue.setNodeCommandLineAccess(descriptionMatrix[4][1]);
//				returnValue.setAdminCommandLineURL(descriptionMatrix[5][1]);
//				returnValue.setNodeAddRemove(descriptionMatrix[6][1]);
//				returnValue.setAdminNodeAddURL(descriptionMatrix[7][1]);
//				returnValue.setClusterMonitoring(descriptionMatrix[8][1]);
//				returnValue.setAdminClusterMonitoringURL(descriptionMatrix[9][1]);
//				returnValue.setDumpDatabaseConfiguration(descriptionMatrix[10][1]);
//				returnValue.setAdminDumpConfigURL(descriptionMatrix[11][1]);
//				returnValue.setDatabaseObjectCount(descriptionMatrix[12][0]);
//				returnValue.setAdminObjectCountURL(descriptionMatrix[13][1]);
//				returnValue.setPhysicalStorageUsage(descriptionMatrix[14][1]);
//				returnValue.setAdminStorageSizeURL(descriptionMatrix[15][1]);
//		}

		@Override public String toString() {
				return "Database{" +
						"Name='" + Name + '\'' +
						", Description='" + Description + '\'' +
						'}';
		}

		public String retrieveNameFromDatabase(String databaseName) {

				// JDBC driver name and database URL
				String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				String DB_URL = "jdbc:mysql://localhost/DATABASE_TECH_AND_FEATURES";

				//  SQLDatabase credentials
				String USER = "root";
				String PASS = "andrew";

				String returnValue = null;

				Connection conn = null;
				Statement stmt = null;
				try {
						//STEP 2: Register JDBC driver
						Class.forName(JDBC_DRIVER);

						//STEP 3: Open a connection
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);

						//STEP 4: Execute a query
						System.out.println("Querying database...");
						stmt = conn.createStatement();

						StringBuilder sqlString = new StringBuilder();
						sqlString.append("SELECT d.databaseName FROM DATABASE_TYPE d WHERE d.databaseName = \"")
								.append(databaseName).append("\"");

						System.out.println("SELECT statement complete");

						String sql = sqlString.toString();
						ResultSet rs = stmt.executeQuery(sql);
						System.out.println("Statement executed");
						rs.next();
						returnValue = rs.getString(1);
						System.out.println(returnValue);

						System.out.println("SQLDatabase created successfully...");
				} catch (SQLException se) {
						//Handle errors for JDBC
						se.printStackTrace();
				} catch (Exception e) {
						//Handle errors for Class.forName
						e.printStackTrace();
				} finally {
						//finally block used to close resources
						try {
								if (stmt != null)
										stmt.close();
						} catch (SQLException se2) {
						}// nothing we can do
						try {
								if (conn != null)
										conn.close();
						} catch (SQLException se) {
								se.printStackTrace();
						}//end finally try
				}//end try
				System.out.println("Goodbye!");

				return returnValue;

		}//end ParserMain


		public String retrieveDescriptionFromDatabase(String databaseName) {

				// JDBC driver name and database URL
				String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				String DB_URL = "jdbc:mysql://localhost/DATABASE_TECH_AND_FEATURES";

				//  SQLDatabase credentials
				String USER = "root";
				String PASS = "andrew";

				String returnValue = null;

				Connection conn = null;
				Statement stmt = null;
				try {
						//STEP 2: Register JDBC driver
						Class.forName(JDBC_DRIVER);

						//STEP 3: Open a connection
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);

						//STEP 4: Execute a query
						System.out.println("Querying database...");
						stmt = conn.createStatement();

						StringBuilder sqlString = new StringBuilder();
						sqlString.append(
								"SELECT d.DatabaseDescription FROM DATABASE_TYPE d WHERE d.databaseName = \"")
								.append(databaseName).append("\"");

						System.out.println("SELECT statement complete");

						String sql = sqlString.toString();
						ResultSet rs = stmt.executeQuery(sql);
						System.out.println("Statement executed");
						rs.next();
						returnValue = rs.getString(1);
						System.out.println(returnValue);

						System.out.println("SQLDatabase created successfully...");
				} catch (SQLException se) {
						//Handle errors for JDBC
						se.printStackTrace();
				} catch (Exception e) {
						//Handle errors for Class.forName
						e.printStackTrace();
				} finally {
						//finally block used to close resources
						try {
								if (stmt != null)
										stmt.close();
						} catch (SQLException se2) {
						}// nothing we can do
						try {
								if (conn != null)
										conn.close();
						} catch (SQLException se) {
								se.printStackTrace();
						}//end finally try
				}//end try
				System.out.println("Goodbye!");

				return returnValue;

		}//end ParserMain

		public static String retrieveDescription(String databaseName, String featureType) {

				// JDBC driver name and database URL
				String JDBC_DRIVER = "com.mysql.jdbc.Driver";
				String DB_URL = "jdbc:mysql://localhost/DATABASE_TECH_AND_FEATURES";

				//  SQLDatabase credentials
				String USER = "root";
				String PASS = "andrew";

				String returnValue = null;

				Connection conn = null;
				Statement stmt = null;
				try {
						//STEP 2: Register JDBC driver
						Class.forName(JDBC_DRIVER);

						//STEP 3: Open a connection
						System.out.println("Connecting to database...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);

						//STEP 4: Execute a query
						System.out.println("Querying database...");
						stmt = conn.createStatement();

						StringBuilder sqlString = new StringBuilder();
						sqlString.append(
								"SELECT d.featureCategoryName FROM FEATURE_CATEGORY d WHERE d.featureCategoryName like '%{" + featureType + "%' and d.featureCategoryName like '%")
								.append(databaseName).append("%'");

						System.out.println("SELECT statement complete");

						String sql = sqlString.toString();
						ResultSet rs = stmt.executeQuery(sql);
						System.out.println("Statement executed");
						rs.next();
						returnValue = rs.getString(1);
						System.out.println(returnValue);

						System.out.println("SQLDatabase created successfully...");
				} catch (SQLException se) {
						//Handle errors for JDBC
						se.printStackTrace();
				} catch (Exception e) {
						//Handle errors for Class.forName
						e.printStackTrace();
				} finally {
						//finally block used to close resources
						try {
								if (stmt != null)
										stmt.close();
						} catch (SQLException se2) {
						}// nothing we can do
						try {
								if (conn != null)
										conn.close();
						} catch (SQLException se) {
								se.printStackTrace();
						}//end finally try
				}//end try
				System.out.println("Goodbye!");

				return returnValue;

		}//end ParserMain

//		public static ChartLabels retrieveChartLabels() {
//
//				ChartLabels returnLabels = new ChartLabels();
//				returnLabels.setLabel1("ghj,ghjklghkjlhk");
//				returnLabels.setLabel2("chartTest2");
//				returnLabels.setLabel3("chartTest3");
//				returnLabels.setLabel4("chartTest4");
//				returnLabels.setLabel5("chartTest5");
//				returnLabels.setLabel6("chartTest6");
//
//				return returnLabels;
//		}

//		public static ChartData retrieveChartData(String databaseName) {
//
//				ChartData returnData = new ChartData();
//
//				if(databaseName.equals("accumulo")) {
//						returnData.setData1(20);
//						returnData.setData2(30);
//						returnData.setData3(40);
//						returnData.setData4(50);
//						returnData.setData5(60);
//						returnData.setData6(70);
//				}else if(databaseName.equals("cassandra")){
//						returnData.setData1(40);
//						returnData.setData2(70);
//						returnData.setData3(15);
//						returnData.setData4(23);
//						returnData.setData5(30);
//						returnData.setData6(15);
//				}
//
//				return returnData;
//		}

		public static void main(String[] args) {
		System.out.println(Database.retrieveDescription("cassandra", "consistency"));
		}
}

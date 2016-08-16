package com.mkyong;

/**
 * Created by andrewdickens on 7/17/16.
 */
public class DatabaseDescription {

		DescriptionType descriptionType;

		public DescriptionType getDescriptionType() {
				return descriptionType;
		}

		public void setDescriptionType(DescriptionType descriptionType) {
				this.descriptionType = descriptionType;
		}

		public static DescriptionType setFeatureDescription(String[][] descriptionMatrix, String feature, String databaseName) {

				if (feature.equals("admin")) {
						Admin returnValue = new Admin();
						returnValue.setAdminDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("data_distribution")) {
						Distribution returnValue = new Distribution();
						returnValue.setDistributionDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("consistency")) {
						Consistency returnValue = new Consistency();
						returnValue.setConsistencyDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("data_model")) {
						DataModel returnValue = new DataModel();
						returnValue.setDataModelDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("query")) {
						QueryLanguage returnValue = new QueryLanguage();
						returnValue.setQueryLanguageDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("data_replication")) {
						Replication returnValue = new Replication();
						returnValue.setReplicationDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("security")) {
						Security returnValue = new Security();
						returnValue.setSecurityDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				} else if (feature.equals("scalability")) {
						Scalability returnValue = new Scalability();
						returnValue.setScalabilityDescription(ArrayParser
								.parseStringToArray(Database.retrieveDescription(databaseName, feature)));
						return returnValue;
				}
				return null;
		}

		public static void main(String[] args) {
				Distribution distribution = new Distribution();

				System.out.println(distribution.getQueryArchitecture() + "**************************");
				distribution.setDistributionDescription(ArrayParser.parseStringToArray(Database.retrieveDescription("oracle", "admin")));
//				System.out.println(DatabaseDescription.setFeatureDescription(ArrayParser.parseStringToArray(Database.retrieveDescription("cassandra", "consistency")),
//						"cassandra", "consistency"));
				System.out.println(distribution.getQueryArchitecture()+"***********************");
		}
}

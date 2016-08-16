package com.mkyong;

/**
 * Created by andrewdickens on 7/17/16.
 */
public class Admin extends DescriptionType{

		String featureType;
		String databaseName;
		String configurationFiles;
		String adminConfigFileURL;
		String NodeCommandLineAccess;
		String AdminCommandLineURL;
		String NodeAddRemove;
		String AdminNodeAddURL;
		String ClusterMonitoring;
		String AdminClusterMonitoringURL;
		String DumpDatabaseConfiguration;
		String AdminDumpConfigURL;
		String DatabaseObjectCount;
		String AdminObjectCountURL;
		String PhysicalStorageUsage;
		String AdminStorageSizeURL;



		public void setAdminDescription(String[][] descriptionMatrix) {

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Admin Features")) {
								this.setFeatureType(value[1]);
						} else if (value[0].equals("Database")) {
								this.setDatabaseName(value[1]);
						} else if (value[0].equals("Configuration Files")) {
								this.setConfigurationFiles(value[1]);
						} else if (value[0].equals("Node command line access")) {
								this.setNodeCommandLineAccess(value[1]);
						} else if (value[0].equals("Node add/remove")) {
								this.setNodeAddRemove(value[1]);
						} else if (value[0].equals("Cluster monitoring")) {
								this.setClusterMonitoring(value[1]);
						} else if (value[0].equals("Dump database configuration")) {
								this.setDumpDatabaseConfiguration(value[1]);
						} else if (value[0].equals("Database object count")) {
								this.setDatabaseObjectCount(value[1]);
						} else if (value[0].equals("Physical storage usage")) {
								this.setPhysicalStorageUsage(value[1]);
						}
				}
		}

		public Admin() {
				this.featureType = "noValue";
				this.databaseName = "noValue";
				this.configurationFiles = "noValue";
				this.adminConfigFileURL = "noValue";
				NodeCommandLineAccess = "noValue";
				AdminCommandLineURL = "noValue";
				NodeAddRemove = "noValue";
				AdminNodeAddURL = "noValue";
				ClusterMonitoring = "noValue";
				AdminClusterMonitoringURL = "noValue";
				DumpDatabaseConfiguration = "noValue";
				AdminDumpConfigURL = "noValue";
				DatabaseObjectCount = "noValue";
				AdminObjectCountURL = "noValue";
				PhysicalStorageUsage = "noValue";
				AdminStorageSizeURL = "noValue";
		}

		public String getFeatureType() {
				return featureType;
		}

		public void setFeatureType(String featureType) {
				this.featureType = featureType;
		}

		public String getDatabaseName() {
				return databaseName;
		}

		public void setDatabaseName(String databaseName) {
				this.databaseName = databaseName;
		}

		public String getConfigurationFiles() {
				return configurationFiles;
		}

		public void setConfigurationFiles(String configurationFiles) {
				this.configurationFiles = configurationFiles;
		}

		public String getAdminConfigFileURL() {
				return adminConfigFileURL;
		}

		public void setAdminConfigFileURL(String adminConfigFileURL) {
				this.adminConfigFileURL = adminConfigFileURL;
		}

		public String getNodeCommandLineAccess() {
				return NodeCommandLineAccess;
		}

		public String getAdminDumpConfigURL() {
				return AdminDumpConfigURL;
		}

		public void setAdminDumpConfigURL(String adminDumpConfigURL) {
				AdminDumpConfigURL = adminDumpConfigURL;
		}

		public String getAdminObjectCountURL() {
				return AdminObjectCountURL;
		}

		public void setAdminObjectCountURL(String adminObjectCountURL) {
				AdminObjectCountURL = adminObjectCountURL;
		}

		public void setNodeCommandLineAccess(String nodeCommandLineAccess) {
				NodeCommandLineAccess = nodeCommandLineAccess;
		}

		public String getAdminCommandLineURL() {
				return AdminCommandLineURL;
		}

		public void setAdminCommandLineURL(String adminCommandLineURL) {
				AdminCommandLineURL = adminCommandLineURL;
		}

		public String getNodeAddRemove() {
				return NodeAddRemove;
		}

		public void setNodeAddRemove(String nodeAddRemove) {
				NodeAddRemove = nodeAddRemove;
		}

		public String getAdminNodeAddURL() {
				return AdminNodeAddURL;
		}

		public void setAdminNodeAddURL(String adminNodeAddURL) {
				AdminNodeAddURL = adminNodeAddURL;
		}

		public String getClusterMonitoring() {
				return ClusterMonitoring;
		}

		public void setClusterMonitoring(String clusterMonitoring) {
				ClusterMonitoring = clusterMonitoring;
		}

		public String getAdminClusterMonitoringURL() {
				return AdminClusterMonitoringURL;
		}

		public void setAdminClusterMonitoringURL(String adminClusterMonitoringURL) {
				AdminClusterMonitoringURL = adminClusterMonitoringURL;
		}

		public String getDumpDatabaseConfiguration() {
				return DumpDatabaseConfiguration;
		}

		public void setDumpDatabaseConfiguration(String dumpDatabaseConfiguration) {
				DumpDatabaseConfiguration = dumpDatabaseConfiguration;
		}

		public String getDatabaseObjectCount() {
				return DatabaseObjectCount;
		}

		public void setDatabaseObjectCount(String databaseObjectCount) {
				DatabaseObjectCount = databaseObjectCount;
		}

		public String getPhysicalStorageUsage() {
				return PhysicalStorageUsage;
		}

		public void setPhysicalStorageUsage(String physicalStorageUsage) {
				PhysicalStorageUsage = physicalStorageUsage;
		}

		public String getAdminStorageSizeURL() {
				return AdminStorageSizeURL;
		}

		public void setAdminStorageSizeURL(String adminStorageSizeURL) {
				AdminStorageSizeURL = adminStorageSizeURL;
		}
}

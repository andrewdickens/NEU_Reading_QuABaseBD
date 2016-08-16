package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Distribution extends DescriptionType {

		String featureType;
		String databaseName;
		String architecture;
		String architectureURL;
		String distributionMethod;
		String distributionMethodURL;
		String rebalancing;
		String rebalanceURL;
		String physicalDistribution;
		String physicalURL;
		String queryArchitecture;
		String queryURL;
		String nonShardKey;
		String mergingResults;
		String mergeURL;

		public void setDistributionDescription(String[][] descriptionMatrix){
//				this.setFeatureType(descriptionMatrix[0][0]);
//				this.setDatabaseName(descriptionMatrix[1][1]);
//				this.setArchitecture(descriptionMatrix[2][1]);
//				this.setArchitectureURL(descriptionMatrix[3][1]);
//				this.setDistributionMethod(descriptionMatrix[4][1]);
//				this.setDistributionMethodURL(descriptionMatrix[5][1]);
//				this.setRebalancing(descriptionMatrix[6][1]);
//				this.setRebalanceURL(descriptionMatrix[7][1]);
//				this.setPhysicalDistribution(descriptionMatrix[8][1]);
//				this.setPhysicalURL(descriptionMatrix[9][1]);
//				this.setQueryArchitecture(descriptionMatrix[10][1]);
//				this.setQueryURL(descriptionMatrix[11][1]);
//				this.setNonShardKey(descriptionMatrix[12][1]);
//				this.setMergingResults(descriptionMatrix[13][1]);
//				this.setMergeURL(descriptionMatrix[14][1]);

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Data Distribution Architecture")) {
								this.setArchitecture(value[1]);
						} else if (value[0].equals("Data Distribution Method")) {
								this.setDistributionMethod(value[1]);
						} else if (value[0].equals("Automatic Data Rebalancing")) {
								this.setRebalancing(value[1]);
						} else if (value[0].equals("Physical Data Distribution")) {
								this.setPhysicalDistribution(value[1]);
						} else if (value[0].equals("Query Architecture")) {
								this.setQueryArchitecture(value[1]);
						} else if (value[0].equals("Queries using Non-Shard Key Value")) {
								this.setNonShardKey(value[1]);
						} else if (value[0].equals("Merging Query Results from Multiple Shards")) {
								this.setMergingResults(value[1]);
						}
				}

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

		public String getArchitecture() {
				return architecture;
		}

		public void setArchitecture(String architecture) {
				this.architecture = architecture;
		}

		public String getArchitectureURL() {
				return architectureURL;
		}

		public void setArchitectureURL(String architectureURL) {
				this.architectureURL = architectureURL;
		}

		public String getDistributionMethod() {
				return distributionMethod;
		}

		public void setDistributionMethod(String distributionMethod) {
				this.distributionMethod = distributionMethod;
		}

		public String getDistributionMethodURL() {
				return distributionMethodURL;
		}

		public void setDistributionMethodURL(String distributionMethodURL) {
				this.distributionMethodURL = distributionMethodURL;
		}

		public String getRebalancing() {
				return rebalancing;
		}

		public void setRebalancing(String rebalancing) {
				this.rebalancing = rebalancing;
		}

		public String getRebalanceURL() {
				return rebalanceURL;
		}

		public void setRebalanceURL(String rebalanceURL) {
				this.rebalanceURL = rebalanceURL;
		}

		public String getPhysicalDistribution() {
				return physicalDistribution;
		}

		public void setPhysicalDistribution(String physicalDistribution) {
				this.physicalDistribution = physicalDistribution;
		}

		public String getPhysicalURL() {
				return physicalURL;
		}

		public void setPhysicalURL(String physicalURL) {
				this.physicalURL = physicalURL;
		}

		public String getQueryArchitecture() {
				return queryArchitecture;
		}

		public void setQueryArchitecture(String queryArchitecture) {
				this.queryArchitecture = queryArchitecture;
		}

		public String getQueryURL() {
				return queryURL;
		}

		public void setQueryURL(String queryURL) {
				this.queryURL = queryURL;
		}

		public String getNonShardKey() {
				return nonShardKey;
		}

		public void setNonShardKey(String nonShardKey) {
				this.nonShardKey = nonShardKey;
		}

		public String getMergingResults() {
				return mergingResults;
		}

		public void setMergingResults(String mergingResults) {
				this.mergingResults = mergingResults;
		}

		public String getMergeURL() {
				return mergeURL;
		}

		public void setMergeURL(String mergeURL) {
				this.mergeURL = mergeURL;
		}
}

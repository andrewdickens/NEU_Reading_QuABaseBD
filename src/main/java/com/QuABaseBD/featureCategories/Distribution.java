package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Distribution {

		String featureType;
		String databaseName;
		String architecture;
		String distributionMethod;
		String rebalancing;
		String physicalDistribution;
		String queryArchitecture;
		String nonShardKey;
		String mergingResults;

		public void setDistributionDescription(String[][] descriptionMatrix){

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

		public String getDistributionMethod() {
				return distributionMethod;
		}

		public void setDistributionMethod(String distributionMethod) {
				this.distributionMethod = distributionMethod;
		}

		public String getRebalancing() {
				return rebalancing;
		}

		public void setRebalancing(String rebalancing) {
				this.rebalancing = rebalancing;
		}

		public String getPhysicalDistribution() {
				return physicalDistribution;
		}

		public void setPhysicalDistribution(String physicalDistribution) {
				this.physicalDistribution = physicalDistribution;
		}

		public String getQueryArchitecture() {
				return queryArchitecture;
		}

		public void setQueryArchitecture(String queryArchitecture) {
				this.queryArchitecture = queryArchitecture;
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

}

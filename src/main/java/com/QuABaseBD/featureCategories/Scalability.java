package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Scalability {

		String featureType;
		String databaseName;
		String scaleOutArchitecture;
		String clientRequestLoadBalancing;
		String scaleDataCapacity;
		String dataObjectsBasedOnLocks;
		String scalableRequestProcessingArchitecture;

		public void setScalabilityDescription(String[][] descriptionMatrix){

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Scale Out Architecture")) {
								this.setScaleOutArchitecture(value[1]);
						} else if (value[0].equals("Client Request Load Balancing")) {
								this.setClientRequestLoadBalancing(value[1]);
						} else if (value[0].equals("Scale Data Capacity")) {
								this.setScaleDataCapacity(value[1]);
						} else if (value[0].equals("Data Object Based Locks on Writes")) {
								this.setDataObjectsBasedOnLocks(value[1]);
						} else if (value[0].equals("Scalable Request Processing Architecture")) {
								this.setScalableRequestProcessingArchitecture(value[1]);
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

		public String getScaleOutArchitecture() {
				return scaleOutArchitecture;
		}

		public void setScaleOutArchitecture(String scaleOutArchitecture) {
				this.scaleOutArchitecture = scaleOutArchitecture;
		}

		public String getClientRequestLoadBalancing() {
				return clientRequestLoadBalancing;
		}

		public void setClientRequestLoadBalancing(String clientRequestLoadBalancing) {
				this.clientRequestLoadBalancing = clientRequestLoadBalancing;
		}

		public String getScaleDataCapacity() {
				return scaleDataCapacity;
		}

		public void setScaleDataCapacity(String scaleDataCapacity) {
				this.scaleDataCapacity = scaleDataCapacity;
		}

		public String getDataObjectsBasedOnLocks() {
				return dataObjectsBasedOnLocks;
		}

		public void setDataObjectsBasedOnLocks(String dataObjectsBasedOnLocks) {
				this.dataObjectsBasedOnLocks = dataObjectsBasedOnLocks;
		}

		public String getScalableRequestProcessingArchitecture() {
				return scalableRequestProcessingArchitecture;
		}

		public void setScalableRequestProcessingArchitecture(
				String scalableRequestProcessingArchitecture) {
				this.scalableRequestProcessingArchitecture = scalableRequestProcessingArchitecture;
		}

}

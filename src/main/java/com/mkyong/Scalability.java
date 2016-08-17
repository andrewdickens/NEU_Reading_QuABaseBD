package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Scalability extends DescriptionType {

		String featureType;
		String databaseName;
		String scaleOutArchitecture;
		String scaleOutURL;
		String clientRequestLoadBalancing;
		String loadBalancingURL;
		String scaleDataCapacity;
		String scaleDataURL;
		String dataObjectsBasedOnLocks;
		String writeLocksURL;
		String scalableRequestProcessingArchitecture;
		String scaleArchitectureURL;

		public void setScalabilityDescription(String[][] descriptionMatrix){
//				this.setFeatureType(descriptionMatrix[0][0]);
//				this.setDatabaseName(descriptionMatrix[3][1]);
//				this.setScaleOutArchitecture(descriptionMatrix[1][1]);
//				this.setScaleOutURL(descriptionMatrix[2][1]);
//				this.setClientRequestLoadBalancing(descriptionMatrix[4][1]);
//				this.setLoadBalancingURL(descriptionMatrix[5][1]);
//				this.setScaleDataCapacity(descriptionMatrix[6][1]);
//				this.setScaleDataURL(descriptionMatrix[7][1]);
//				this.setDataObjectsBasedOnLocks(descriptionMatrix[8][1]);
//				this.setWriteLocksURL(descriptionMatrix[9][1]);
//				this.setScalableRequestProcessingArchitecture(descriptionMatrix[10][1]);
//				this.setScaleArchitectureURL(descriptionMatrix[11][0]);
//
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

		public String getScaleOutURL() {
				return scaleOutURL;
		}

		public void setScaleOutURL(String scaleOutURL) {
				this.scaleOutURL = scaleOutURL;
		}

		public String getClientRequestLoadBalancing() {
				return clientRequestLoadBalancing;
		}

		public void setClientRequestLoadBalancing(String clientRequestLoadBalancing) {
				this.clientRequestLoadBalancing = clientRequestLoadBalancing;
		}

		public String getLoadBalancingURL() {
				return loadBalancingURL;
		}

		public void setLoadBalancingURL(String loadBalancingURL) {
				this.loadBalancingURL = loadBalancingURL;
		}

		public String getScaleDataCapacity() {
				return scaleDataCapacity;
		}

		public void setScaleDataCapacity(String scaleDataCapacity) {
				this.scaleDataCapacity = scaleDataCapacity;
		}

		public String getScaleDataURL() {
				return scaleDataURL;
		}

		public void setScaleDataURL(String scaleDataURL) {
				this.scaleDataURL = scaleDataURL;
		}

		public String getDataObjectsBasedOnLocks() {
				return dataObjectsBasedOnLocks;
		}

		public void setDataObjectsBasedOnLocks(String dataObjectsBasedOnLocks) {
				this.dataObjectsBasedOnLocks = dataObjectsBasedOnLocks;
		}

		public String getWriteLocksURL() {
				return writeLocksURL;
		}

		public void setWriteLocksURL(String writeLocksURL) {
				this.writeLocksURL = writeLocksURL;
		}

		public String getScalableRequestProcessingArchitecture() {
				return scalableRequestProcessingArchitecture;
		}

		public void setScalableRequestProcessingArchitecture(
				String scalableRequestProcessingArchitecture) {
				this.scalableRequestProcessingArchitecture = scalableRequestProcessingArchitecture;
		}

		public String getScaleArchitectureURL() {
				return scaleArchitectureURL;
		}

		public void setScaleArchitectureURL(String scaleArchitectureURL) {
				this.scaleArchitectureURL = scaleArchitectureURL;
		}
}

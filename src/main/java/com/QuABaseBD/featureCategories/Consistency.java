package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Consistency {

		String featureType;
		String databaseName;
		String ObjectLevelIsolation;
		String ACIDtransactions;
		String DistributedACIDTrans;
		String UpdatesAppliedBeforeWrite;
		String SpecifyQuorumReadWrite;
		String SpecifyNumberToWrite;
		String BehaviorFailedReplica;
		String WritesConfigNoFail;
		String SpecifyNumberToRead;
		String ReadFromMaster;
		String ObjectLevelTimestamps;
		String EfficientProtocalPropogation;

		public Consistency() {
				this.featureType = "NoValue";
				this.databaseName = "NoValue";
				ObjectLevelIsolation = "NoValue";
				this.ACIDtransactions = "NoValue";
				DistributedACIDTrans = "NoValue";
				UpdatesAppliedBeforeWrite = "NoValue";
				SpecifyQuorumReadWrite = "NoValue";
				SpecifyNumberToWrite = "NoValue";
				BehaviorFailedReplica = "NoValue";
				WritesConfigNoFail = "NoValue";
				SpecifyNumberToRead = "NoValue";
				ReadFromMaster = "NoValue";
				ObjectLevelTimestamps = "NoValue";
				EfficientProtocalPropogation = "NoValue";
		}

		public void setConsistencyDescription(String[][] descriptionMatrix) {
				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Consistency Features")) {
								this.setFeatureType(value[1]);
						} else if (value[0].equals("Database")) {
								this.setDatabaseName(value[1]);
						} else if (value[0].equals("Object-Level isolation on updates")) {
								this.setObjectLevelIsolation(value[1]);
						}else if (value[0].equals("ACID transactions in single database")) {
								this.setACIDtransactions(value[1]);
						}else if (value[0].equals("Updates applied to transaction log before returning from write")) {
								this.setUpdatesAppliedBeforeWrite(value[1]);
						} else if (value[0].equals("Specify Quorum Reads/Writes")) {
								this.setSpecifyQuorumReadWrite(value[1]);
						}else if (value[0].equals("Behaviour when write cannot complete on specified number of replicas")) {
								this.setBehaviorFailedReplica(value[1]);
						}else if (value[0].equals("Specify number of replicas to read from")) {
								this.setSpecifyNumberToRead(value[1]);
						}else if (value[0].equals("Read from replica master only")) {
								this.setReadFromMaster(value[1]);
						} else if (value[0].equals("Object level timestamps to detect conflicts")) {
								this.setObjectLevelTimestamps(value[1]);
						}
				}
		}

		public String getSpecifyQuorumReadWrite() {
				return SpecifyQuorumReadWrite;
		}

		public void setSpecifyQuorumReadWrite(String specifyQuorumReadWrite) {
				SpecifyQuorumReadWrite = specifyQuorumReadWrite;
		}

		public String getDistributedACIDTrans() {
				return DistributedACIDTrans;
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

		public String getObjectLevelIsolation() {
				return ObjectLevelIsolation;
		}

		public void setObjectLevelIsolation(String objectLevelIsolation) {
				ObjectLevelIsolation = objectLevelIsolation;
		}

		public String getACIDtransactions() {
				return ACIDtransactions;
		}

		public void setACIDtransactions(String ACIDtransactions) {
				this.ACIDtransactions = ACIDtransactions;
		}

		public String getUpdatesAppliedBeforeWrite() {
				return UpdatesAppliedBeforeWrite;
		}

		public void setUpdatesAppliedBeforeWrite(String updatesAppliedBeforeWrite) {
				UpdatesAppliedBeforeWrite = updatesAppliedBeforeWrite;
		}

		public String getBehaviorFailedReplica() {
				return BehaviorFailedReplica;
		}

		public void setBehaviorFailedReplica(String behaviorFailedReplica) {
				BehaviorFailedReplica = behaviorFailedReplica;
		}

		public String getSpecifyNumberToRead() {
				return SpecifyNumberToRead;
		}

		public void setSpecifyNumberToRead(String specifyNumberToRead) {
				SpecifyNumberToRead = specifyNumberToRead;
		}

		public String getReadFromMaster() {
				return ReadFromMaster;
		}

		public void setReadFromMaster(String readFromMaster) {
				ReadFromMaster = readFromMaster;
		}

		public String getObjectLevelTimestamps() {
				return ObjectLevelTimestamps;
		}

		public void setObjectLevelTimestamps(String objectLevelTimestamps) {
				ObjectLevelTimestamps = objectLevelTimestamps;
		}
}

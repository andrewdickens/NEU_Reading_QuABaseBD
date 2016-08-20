package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Consistency{

		String featureType;
		String databaseName;
		String ObjectLevelIsolation;
		String ObjectIsolationURL;
		String ACIDtransactions;
		String ACIDTransURL;
		String DistributedACIDTrans;
		String ConstDistributedURL;
		String UpdatesAppliedBeforeWrite;
		String ConstLogWritesURL;
		String SpecifyQuorumReadWrite;
		String QuorumURL;
		String SpecifyNumberToWrite;
		String ReplicaURL;
		String BehaviorFailedReplica;
		String FailedReplicaURL;
		String WritesConfigNoFail;
		String NoFailURL;
		String SpecifyNumberToRead;
		String ReplicaReadURL;
		String ReadFromMaster;
		String MasterReadURL;
		String ObjectLevelTimestamps;
		String ConstTimestampURL;
		String EfficientProtocalPropogation;
		String ProtocalURL;

		public Consistency() {
				this.featureType = "NoValue";
				this.databaseName = "NoValue";
				ObjectLevelIsolation = "NoValue";
				ObjectIsolationURL = "NoValue";
				this.ACIDtransactions = "NoValue";
				this.ACIDTransURL = "NoValue";
				DistributedACIDTrans = "NoValue";
				ConstDistributedURL = "NoValue";
				UpdatesAppliedBeforeWrite = "NoValue";
				ConstLogWritesURL = "NoValue";
				SpecifyQuorumReadWrite = "NoValue";
				QuorumURL = "NoValue";
				SpecifyNumberToWrite = "NoValue";
				ReplicaURL = "NoValue";
				BehaviorFailedReplica = "NoValue";
				FailedReplicaURL = "NoValue";
				WritesConfigNoFail = "NoValue";
				NoFailURL = "NoValue";
				SpecifyNumberToRead = "NoValue";
				ReplicaReadURL = "NoValue";
				ReadFromMaster = "NoValue";
				MasterReadURL = "NoValue";
				ObjectLevelTimestamps = "NoValue";
				ConstTimestampURL = "NoValue";
				EfficientProtocalPropogation = "NoValue";
				ProtocalURL = "NoValue";
		}

		public void setConsistencyDescription(String[][] descriptionMatrix) {
				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Consistency Features")) {
								this.setFeatureType(value[1]);
						} else if (value[0].equals("Database")) {
								this.setDatabaseName(value[1]);
						} else if (value[0].equals("Object-Level isolation on updates")) {
								this.setObjectLevelIsolation(value[1]);
						} else if (value[0].equals("Const Object Isolation URL")) {
								this.setObjectIsolationURL(value[1]);
						} else if (value[0].equals("ACID transactions in single database")) {
								this.setACIDtransactions(value[1]);
						} else if (value[0].equals("Const ACID Trans URL")) {
								this.setACIDTransURL(value[1]);
						} else if (value[0].equals("Const Distributed Trans URL")) {
								this.setConstDistributedURL(value[1]);
						} else if (value[0].equals("Updates applied to transaction log before returning from write")) {
								this.setUpdatesAppliedBeforeWrite(value[1]);
						} else if (value[0].equals("Const Log Writes URL")) {
								this.setConstLogWritesURL(value[1]);
						} else if (value[0].equals("Specify Quorum Reads/Writes")) {
								this.setSpecifyQuorumReadWrite(value[1]);
						} else if (value[0].equals("Const Quorum URL")) {
								this.setConstLogWritesURL(value[1]);
						}else if (value[0].equals("Specify number of replicas to write to")) {
								this.setSpecifyNumberToWrite(value[1]);
						} else if (value[0].equals("Const Replica Write URL")) {
								this.setReplicaURL(value[1]);
						}else if (value[0].equals("Behaviour when write cannot complete on specified number of replicas")) {
								this.setBehaviorFailedReplica(value[1]);
						} else if (value[0].equals("Const Write Replica Fail URL")) {
								this.setConstLogWritesURL(value[1]);
						}else if (value[0].equals("Writes configured to never fail")) {
								this.setWritesConfigNoFail(value[1]);
						} else if (value[0].equals("Const Write Never Fail URL")) {
								this.setNoFailURL(value[1]);
						}else if (value[0].equals("Specify number of replicas to read from")) {
								this.setSpecifyNumberToRead(value[1]);
						} else if (value[0].equals("Const Replica Read URL")) {
								this.setReplicaReadURL(value[1]);
						}else if (value[0].equals("Read from replica master only")) {
								this.setReadFromMaster(value[1]);
						} else if (value[0].equals("Object level timestamps to detect conflicts")) {
								this.setObjectLevelTimestamps(value[1]);
						}else if (value[0].equals("Const Timestamps URL")) {
								this.setConstTimestampURL(value[1]);
						}else if (value[0].equals("Efficient protocol to rapidly propagate updates across replicas (minimize inconsistency window)")) {
								this.setEfficientProtocalPropogation(value[1]);
						} else if (value[0].equals("Const Protocol URL")) {
								this.setProtocalURL(value[1]);
						}
				}
		}

		public String getConstLogWritesURL() {
				return ConstLogWritesURL;
		}

		public void setConstLogWritesURL(String constLogWritesURL) {
				ConstLogWritesURL = constLogWritesURL;
		}

		public String getSpecifyQuorumReadWrite() {
				return SpecifyQuorumReadWrite;
		}

		public void setSpecifyQuorumReadWrite(String specifyQuorumReadWrite) {
				SpecifyQuorumReadWrite = specifyQuorumReadWrite;
		}

		public void setDistributedACIDTrans(String distributedACIDTrans) {
				DistributedACIDTrans = distributedACIDTrans;
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

		public String getObjectIsolationURL() {
				return ObjectIsolationURL;
		}

		public void setObjectIsolationURL(String objectIsolationURL) {
				ObjectIsolationURL = objectIsolationURL;
		}

		public String getACIDtransactions() {
				return ACIDtransactions;
		}

		public void setACIDtransactions(String ACIDtransactions) {
				this.ACIDtransactions = ACIDtransactions;
		}

		public String getACIDTransURL() {
				return ACIDTransURL;
		}

		public void setACIDTransURL(String ACIDTransURL) {
				this.ACIDTransURL = ACIDTransURL;
		}

		public String getConstDistributedURL() {
				return ConstDistributedURL;
		}

		public void setConstDistributedURL(String constDistributedURL) {
				ConstDistributedURL = constDistributedURL;
		}

		public String getUpdatesAppliedBeforeWrite() {
				return UpdatesAppliedBeforeWrite;
		}

		public void setUpdatesAppliedBeforeWrite(String updatesAppliedBeforeWrite) {
				UpdatesAppliedBeforeWrite = updatesAppliedBeforeWrite;
		}

		public String getQuorumURL() {
				return QuorumURL;
		}

		public void setQuorumURL(String quorumURL) {
				QuorumURL = quorumURL;
		}

		public String getSpecifyNumberToWrite() {
				return SpecifyNumberToWrite;
		}

		public void setSpecifyNumberToWrite(String specifyNumberToWrite) {
				SpecifyNumberToWrite = specifyNumberToWrite;
		}

		public String getReplicaURL() {
				return ReplicaURL;
		}

		public void setReplicaURL(String replicaURL) {
				ReplicaURL = replicaURL;
		}

		public String getBehaviorFailedReplica() {
				return BehaviorFailedReplica;
		}

		public void setBehaviorFailedReplica(String behaviorFailedReplica) {
				BehaviorFailedReplica = behaviorFailedReplica;
		}

		public String getFailedReplicaURL() {
				return FailedReplicaURL;
		}

		public void setFailedReplicaURL(String failedReplicaURL) {
				FailedReplicaURL = failedReplicaURL;
		}

		public String getWritesConfigNoFail() {
				return WritesConfigNoFail;
		}

		public void setWritesConfigNoFail(String writesConfigNoFail) {
				WritesConfigNoFail = writesConfigNoFail;
		}

		public String getNoFailURL() {
				return NoFailURL;
		}

		public void setNoFailURL(String noFailURL) {
				NoFailURL = noFailURL;
		}

		public String getSpecifyNumberToRead() {
				return SpecifyNumberToRead;
		}

		public void setSpecifyNumberToRead(String specifyNumberToRead) {
				SpecifyNumberToRead = specifyNumberToRead;
		}

		public String getReplicaReadURL() {
				return ReplicaReadURL;
		}

		public void setReplicaReadURL(String replicaReadURL) {
				ReplicaReadURL = replicaReadURL;
		}

		public String getReadFromMaster() {
				return ReadFromMaster;
		}

		public void setReadFromMaster(String readFromMaster) {
				ReadFromMaster = readFromMaster;
		}

		public String getMasterReadURL() {
				return MasterReadURL;
		}

		public void setMasterReadURL(String masterReadURL) {
				MasterReadURL = masterReadURL;
		}

		public String getObjectLevelTimestamps() {
				return ObjectLevelTimestamps;
		}

		public void setObjectLevelTimestamps(String objectLevelTimestamps) {
				ObjectLevelTimestamps = objectLevelTimestamps;
		}

		public String getConstTimestampURL() {
				return ConstTimestampURL;
		}

		public void setConstTimestampURL(String constTimestampURL) {
				ConstTimestampURL = constTimestampURL;
		}

		public String getEfficientProtocalPropogation() {
				return EfficientProtocalPropogation;
		}

		public void setEfficientProtocalPropogation(String efficientProtocalPropogation) {
				EfficientProtocalPropogation = efficientProtocalPropogation;
		}

		public String getProtocalURL() {
				return ProtocalURL;
		}

		public void setProtocalURL(String protocalURL) {
				ProtocalURL = protocalURL;
		}
}

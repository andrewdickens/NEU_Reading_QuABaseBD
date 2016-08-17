package com.mkyong;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Replication extends DescriptionType {

		String featureType;
		String databaseName;
		String architecture;
		String archURL;
		String replicationForBackup;
		String replicationAcrossDataCenters;
		String dataCenterURL;
		String replicaWrites;
		String replicaReads;
		String readsURL;
		String readRepair;
		String automaticReplicaFailureDetection;
		String repFailDetectURL;
		String automaticFailover;
		String failoverURL;
		String automaticNewMasterElection;
		String masterElectionURL;
		String replicaRecoveryAndResync;
		String repRecoveryURL;

		public void setReplicationDescription(String[][] descriptionMatrix){
//				this.setFeatureType(descriptionMatrix[0][0]);
//				this.setDatabaseName(descriptionMatrix[1][1]);
//				this.setArchitecture(descriptionMatrix[2][1]);
//				this.setArchURL(descriptionMatrix[3][1]);
//				this.setReplicationForBackup(descriptionMatrix[4][1]);
//				this.setReplicationAcrossDataCenters(descriptionMatrix[5][1]);
//				this.setDataCenterURL(descriptionMatrix[6][1]);
//				this.setReplicaReads(descriptionMatrix[7][1]);
//				this.setReadsURL(descriptionMatrix[8][1]);
//				this.setReadRepair(descriptionMatrix[9][1]);
//				this.setAutomaticReplicaFailureDetection(descriptionMatrix[10][1]);
//				this.setRepFailDetectURL(descriptionMatrix[11][0]);
//				this.setAutomaticFailover(descriptionMatrix[12][1]);
//				this.setFailoverURL(descriptionMatrix[13][1]);
//				this.setAutomaticNewMasterElection(descriptionMatrix[14][1]);
//				this.setMasterElectionURL(descriptionMatrix[15][1]);
//				this.setReplicaRecoveryAndResync(descriptionMatrix[16][1]);
//				this.setRepRecoveryURL(descriptionMatrix[17][1]);

				for (String[] value : descriptionMatrix) {
						if (value[0].equals("Replication Architecture")) {
								this.setArchitecture(value[1]);
						} else if (value[0].equals("Replication for Backup")) {
								this.setReplicationForBackup(value[1]);
						} else if (value[0].equals("Replication across Data Centers")) {
								this.setReplicationAcrossDataCenters(value[1]);
						} else if (value[0].equals("Replicas Writes")) {
								this.setReplicaWrites(value[1]);
						} else if (value[0].equals("Replica Reads")) {
								this.setReplicaReads(value[1]);
						} else if (value[0].equals("Read Repair")) {
								this.setReadRepair(value[1]);
						} else if (value[0].equals("Automatic Replica Failure Detection")) {
								this.setAutomaticReplicaFailureDetection(value[1]);
						} else if (value[0].equals("Automatic Failover")) {
								this.setAutomaticFailover(value[1]);
						} else if (value[0].equals("Automatic New Master Election after Failure")) {
								this.setAutomaticNewMasterElection(value[1]);
						}else if (value[0].equals("Replica Recovery and Resynchronization")) {
								this.setReplicaRecoveryAndResync(value[1]);
						}
				}
		}

		public String getReplicaWrites() {
				return replicaWrites;
		}

		public void setReplicaWrites(String replicaWrites) {
				this.replicaWrites = replicaWrites;
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

		public String getArchURL() {
				return archURL;
		}

		public void setArchURL(String archURL) {
				this.archURL = archURL;
		}

		public String getReplicationForBackup() {
				return replicationForBackup;
		}

		public void setReplicationForBackup(String replicationForBackup) {
				this.replicationForBackup = replicationForBackup;
		}

		public String getReplicationAcrossDataCenters() {
				return replicationAcrossDataCenters;
		}

		public void setReplicationAcrossDataCenters(String replicationAcrossDataCenters) {
				this.replicationAcrossDataCenters = replicationAcrossDataCenters;
		}

		public String getDataCenterURL() {
				return dataCenterURL;
		}

		public void setDataCenterURL(String dataCenterURL) {
				this.dataCenterURL = dataCenterURL;
		}

		public String getReplicaReads() {
				return replicaReads;
		}

		public void setReplicaReads(String replicaReads) {
				this.replicaReads = replicaReads;
		}

		public String getReadsURL() {
				return readsURL;
		}

		public void setReadsURL(String readsURL) {
				this.readsURL = readsURL;
		}

		public String getReadRepair() {
				return readRepair;
		}

		public void setReadRepair(String readRepair) {
				this.readRepair = readRepair;
		}

		public String getAutomaticReplicaFailureDetection() {
				return automaticReplicaFailureDetection;
		}

		public void setAutomaticReplicaFailureDetection(String automaticReplicaFailureDetection) {
				this.automaticReplicaFailureDetection = automaticReplicaFailureDetection;
		}

		public String getRepFailDetectURL() {
				return repFailDetectURL;
		}

		public void setRepFailDetectURL(String repFailDetectURL) {
				this.repFailDetectURL = repFailDetectURL;
		}

		public String getAutomaticFailover() {
				return automaticFailover;
		}

		public void setAutomaticFailover(String automaticFailover) {
				this.automaticFailover = automaticFailover;
		}

		public String getFailoverURL() {
				return failoverURL;
		}

		public void setFailoverURL(String failoverURL) {
				this.failoverURL = failoverURL;
		}

		public String getAutomaticNewMasterElection() {
				return automaticNewMasterElection;
		}

		public void setAutomaticNewMasterElection(String automaticNewMasterElection) {
				this.automaticNewMasterElection = automaticNewMasterElection;
		}

		public String getMasterElectionURL() {
				return masterElectionURL;
		}

		public void setMasterElectionURL(String masterElectionURL) {
				this.masterElectionURL = masterElectionURL;
		}

		public String getReplicaRecoveryAndResync() {
				return replicaRecoveryAndResync;
		}

		public void setReplicaRecoveryAndResync(String replicaRecoveryAndResync) {
				this.replicaRecoveryAndResync = replicaRecoveryAndResync;
		}

		public String getRepRecoveryURL() {
				return repRecoveryURL;
		}

		public void setRepRecoveryURL(String repRecoveryURL) {
				this.repRecoveryURL = repRecoveryURL;
		}
}

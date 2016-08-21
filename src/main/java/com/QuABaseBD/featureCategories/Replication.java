package com.QuABaseBD.featureCategories;

/**
 * Created by andrewdickens on 8/6/16.
 */
public class Replication {

		String featureType;
		String databaseName;
		String architecture;
		String replicationForBackup;
		String replicationAcrossDataCenters;
		String replicaWrites;
		String replicaReads;
		String readRepair;
		String automaticReplicaFailureDetection;
		String automaticFailover;
		String automaticNewMasterElection;
		String replicaRecoveryAndResync;

		public void setReplicationDescription(String[][] descriptionMatrix){

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

		public String getReplicaReads() {
				return replicaReads;
		}

		public void setReplicaReads(String replicaReads) {
				this.replicaReads = replicaReads;
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

		public String getAutomaticFailover() {
				return automaticFailover;
		}

		public void setAutomaticFailover(String automaticFailover) {
				this.automaticFailover = automaticFailover;
		}

		public String getAutomaticNewMasterElection() {
				return automaticNewMasterElection;
		}

		public void setAutomaticNewMasterElection(String automaticNewMasterElection) {
				this.automaticNewMasterElection = automaticNewMasterElection;
		}

		public String getReplicaRecoveryAndResync() {
				return replicaRecoveryAndResync;
		}

		public void setReplicaRecoveryAndResync(String replicaRecoveryAndResync) {
				this.replicaRecoveryAndResync = replicaRecoveryAndResync;
		}
}

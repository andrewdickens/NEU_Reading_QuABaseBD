package com.mkyong.rest;

import com.mkyong.*;

/**
 * Created by andrewdickens on 8/7/16.
 */
public class FeatureRatings {

		public static Integer getFeatureRatingAll(String databaseName, String featureCategory,
				String feature) {
				if (featureCategory.equals("admin")) {
						return FeatureRatings.getAdminRatings2(databaseName, feature);
				} else if (featureCategory.equals("consistency")) {
						return FeatureRatings.getConsistencyRatings2(databaseName, feature);
				} else if (featureCategory.equals("data_distribution")) {
						return FeatureRatings.getDataDistributionRatings2(databaseName, feature);
				} else if (featureCategory.equals("data_model")) {
						return FeatureRatings.getDataModelRatings2(databaseName, feature);
				} else if (featureCategory.equals("query")) {
						return FeatureRatings.getQueryLanguagesRatings2(databaseName, feature);
				} else if (featureCategory.equals("data_replication")) {
						return FeatureRatings.getDataReplicationRatings2(databaseName, feature);
				} else if (featureCategory.equals("security")) {
						return FeatureRatings.getSecurityRatings2(databaseName, feature);
				} else if (featureCategory.equals("scalability")) {
						return FeatureRatings.getScalabilityRatings2(databaseName, feature);
				}
				return null;
		}

		public static Integer getAdminRatings2(String databaseName, String feature) {

				Admin returnValueAdmin = new Admin();
				returnValueAdmin.setAdminDescription(
						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "admin")));

				if (feature.equals("Configuration Files")) {
						if (returnValueAdmin.getConfigurationFiles().equals("multiple")) {
								return 4;
						}
						if (returnValueAdmin.getConfigurationFiles().equals("single")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Node command line access")) {

						if (returnValueAdmin.getNodeCommandLineAccess().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getNodeCommandLineAccess().equals("non-authenticated")) {
								return 3;
						} else if (returnValueAdmin.getNodeCommandLineAccess().equals("authenticated")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Node add remove")) {

						if (returnValueAdmin.getNodeAddRemove().equals("multiple files")) {
								return 1;
						} else if (returnValueAdmin.getNodeAddRemove().equals("single file")) {
								return 4;
						} else if (returnValueAdmin.getNodeAddRemove()
								.equals("centralized tool, multiple files")) {
								return 7;
						} else if (returnValueAdmin.getNodeAddRemove().equals("centralized tool")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Cluster monitoring")) {
						if (returnValueAdmin.getClusterMonitoring().contains("snapshot")) {
								return 3;
						} else if (returnValueAdmin.getClusterMonitoring().equals("enterprise version only")) {
								return 6;
						} else if (returnValueAdmin.getClusterMonitoring().equals("real-time")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Dump database configuration")) {

						if (returnValueAdmin.getDumpDatabaseConfiguration().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getDumpDatabaseConfiguration().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Database object count")) {

						if (returnValueAdmin.getDatabaseObjectCount().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getDatabaseObjectCount().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Physical storage usage")) {

						if (returnValueAdmin.getPhysicalStorageUsage().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getPhysicalStorageUsage().equals("supported")) {
								return 7;
						} else
								return 50;
				}
				return null;
		}

		public static Integer getConsistencyRatings2(String databaseName, String feature) {

				Consistency returnValueConsistency = new Consistency();
				returnValueConsistency.setConsistencyDescription(ArrayParser
						.parseStringToArray(Database.retrieveDescription(databaseName, "consistency")));

				if (feature.equals("Object-Level isolation on updates")) {
						if (returnValueConsistency.getObjectLevelIsolation().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getObjectLevelIsolation().equals("not supported")) {
								return 1;
						} else if (returnValueConsistency.getObjectLevelIsolation().equals("MVCC")) {
								return 4;
						} else
								return 7;
				} else if (feature.equals("ACID transactions in single database")) {

						if (returnValueConsistency.getACIDtransactions().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getACIDtransactions().equals("not supported")) {
								return 1;
						} else if (returnValueConsistency.getACIDtransactions()
								.equals("lightweight transactions (e.g. compare and set)")) {
								return 4;
						} else
								return 7;
				} else if (feature.equals("Distributed ACID transactions")) {

						if (returnValueConsistency.getDistributedACIDTrans().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getDistributedACIDTrans().equals("not supported")) {
								return 1;
						} else
								return 7;
				} else if (feature
						.equals("Updates applied to transaction log before returning from write")) {

						if (returnValueConsistency.getUpdatesAppliedBeforeWrite().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getUpdatesAppliedBeforeWrite()
								.equals("not supported")) {
								return 1;
						} else
								return 7;
				} else if (feature.equals("Specify Quorum reads and writes")) {
						if (returnValueConsistency.getSpecifyQuorumReadWrite().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getSpecifyQuorumReadWrite()
								.equals("not supported/not relevant")) {
								return 1;
						} else if (returnValueConsistency.getSpecifyQuorumReadWrite()
								.equals("in database configuration")) {
								return 5;
						} else if (returnValueConsistency.getSpecifyQuorumReadWrite()
								.equals("in the database and data center config")) {
								return 6;
						} else
								return 7;
				} else if (feature.equals("Specify number of replicas to write to")) {

						if (returnValueConsistency.getSpecifyQuorumReadWrite().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getSpecifyQuorumReadWrite()
								.equals("not supported/not relevant")) {
								return 1;
						} else if (returnValueConsistency.getSpecifyQuorumReadWrite()
								.equals("in database configuration")) {
								return 5;
						} else
								return 7;
				} else if (feature
						.equals("Behaviour when write cannot complete on specified number of replicas")) {

						if (returnValueConsistency.getBehaviorFailedReplica().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getBehaviorFailedReplica()
								.equals("no rollback: write returns replication error")) {
								return 1;
						} else if (returnValueConsistency.getBehaviorFailedReplica()
								.equals("rollback at all replicas")) {
								return 6;
						} else
								return 7;
				} else if (feature.equals("Specify number of replicas to read from")) {

						if (returnValueConsistency.getSpecifyNumberToRead().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getSpecifyNumberToRead()
								.equals("Not supported/not relevant")) {
								return 1;
						} else if (returnValueConsistency.getSpecifyNumberToRead()
								.equals("in database/application configuration")) {
								return 5;
						} else
								return 7;
				} else if (feature.equals("Read from replica master only")) {

						if (returnValueConsistency.getReadFromMaster().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getReadFromMaster()
								.equals("Not supported/not relevant")) {
								return 1;
						} else if (returnValueConsistency.getReadFromMaster()
								.equals("in database/application configuration")) {
								return 5;
						} else
								return 7;
				} else if (feature.equals("Object level timestamps to detect conflicts")) {

						if (returnValueConsistency.getObjectLevelTimestamps().equals("NoValue")) {
								return 0;
						} else if (returnValueConsistency.getObjectLevelTimestamps().equals("supported")) {
								return 7;
						} else
								return 1;
				}
				return null;
		}


		public static Integer getDataDistributionRatings2(String databaseName, String feature) {

				Distribution returnValueDistribution = new Distribution();
				returnValueDistribution.setDistributionDescription(ArrayParser
						.parseStringToArray(Database.retrieveDescription(databaseName, "data_distribution")));

				if (feature.equals("Data Distribution Architecture")) {
						if (returnValueDistribution.getArchitecture().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getArchitecture().equals("single database only")) {
								return 1;
						} else if (returnValueDistribution.getArchitecture().equals("master-single slave")) {
								return 3;
						} else if (returnValueDistribution.getArchitecture().equals("master-multiple slaves")) {
								return 5;
						} else
								return 7;
				} else if (feature.equals("Data Distribution Method")) {

						if (returnValueDistribution.getDistributionMethod().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getDistributionMethod()
								.equals("Not relevant (single server only)")) {
								return 1;
						} else if (returnValueDistribution.getDistributionMethod()
								.equals("assigned key ranges to nodes")) {
								return 3;
						} else if (returnValueDistribution.getDistributionMethod().equals("hash key")) {
								return 6;
						} else
								return 7;
				} else if (feature.equals("Automatic Data Rebalancing")) {

						if (returnValueDistribution.getRebalancing().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getRebalancing()
								.equals("no rebalancing (single server only)")) {
								return 1;
						} else if (returnValueDistribution.getRebalancing()
								.equals("administrative rebalancing tools")) {
								return 3;
						} else if (returnValueDistribution.getRebalancing().equals("schedulable rebalancing")) {
								return 4;
						} else if (returnValueDistribution.getRebalancing().equals("failure triggered")) {
								return 5;
						} else if (returnValueDistribution.getRebalancing().equals("new storage triggered")) {
								return 6;
						} else
								return 7;
				} else if (feature.equals("Physical Data Distribution")) {

						if (returnValueDistribution.getPhysicalDistribution().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getPhysicalDistribution().equals("single cluster")) {
								return 3;
						} else if (returnValueDistribution.getPhysicalDistribution()
								.equals("rack-aware on single cluster")) {
								return 4;
						} else
								return 7;
				} else if (feature.equals("Query Architecture")) {
						if (returnValueDistribution.getQueryArchitecture().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getQueryArchitecture()
								.equals("direct shard connection only (resolved in client)")) {
								return 2;
						} else if (returnValueDistribution.getQueryArchitecture()
								.equals("external load balancer required")) {
								return 4;
						} else if (returnValueDistribution.getQueryArchitecture()
								.equals("centralized coordinator for shard key lookup")) {
								return 5;
						} else
								return 7;
				} else if (feature.equals("Queries using Non-Shard Key Value")) {

						if (returnValueDistribution.getNonShardKey().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getNonShardKey().equals("not supported")) {
								return 1;
						} else if (returnValueDistribution.getNonShardKey().equals("non-indexed (scan)")) {
								return 3;
						} else
								return 7;
				} else if (feature.equals("Merging Query Results from Multiple Shards")) {

						if (returnValueDistribution.getMergingResults().equals("NoValue")) {
								return 0;
						} else if (returnValueDistribution.getMergingResults().equals("not supported")) {
								return 1;
						} else if (returnValueDistribution.getMergingResults().equals("random order")) {
								return 3;
						} else if (returnValueDistribution.getMergingResults().equals("paged from server")) {
								return 5;
						} else
								return 7;
				}

				return null;
		}

		public static Integer getDataModelRatings2(String databaseName, String feature) {

				DataModel returnValueDataModel = new DataModel();
				returnValueDataModel.setDataModelDescription(ArrayParser
						.parseStringToArray(Database.retrieveDescription(databaseName, "data_model")));

				if (feature.equals("Scalable Request Processing Architecture")) {
						if (returnValueDataModel.getEnforcedSchema().equals("required")) {
								return 2;
						} else if (returnValueDataModel.getEnforcedSchema().equals("optional")) {
								return 4;
						} else if (returnValueDataModel.getEnforcedSchema().equals("not required")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Opaque Data Objects (need application interpretation)")) {

						if (returnValueDataModel.getOpaqueDataObjects().equals("required")) {
								return 1;
						} else if (returnValueDataModel.getOpaqueDataObjects().equals("not required")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Hierarchical Data Objects (e.g. sub objects)")) {

						if (returnValueDataModel.getHierarchicalDataObjects().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getHierarchicalDataObjects().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Automatically Allocated Keys")) {
						if (returnValueDataModel.getAutoAllocatedKeys().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getAutoAllocatedKeys().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Composite Keys")) {

						if (returnValueDataModel.getCompositeKeys().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getCompositeKeys().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Secondary Indexes")) {

						if (returnValueDataModel.getSecondaryIndexes().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getSecondaryIndexes().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Query by Key Ranges")) {

						if (returnValueDataModel.getQueryByKeyRanges().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getQueryByKeyRanges().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Query by Partial Key")) {
						if (returnValueDataModel.getQueryByPartialKeys().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getQueryByPartialKeys().equals("supported")) {
								return 6;
						} else
								return 50;
				} else if (feature.equals("Query by Non-keyed Values")) {

						if (returnValueDataModel.getQueryByNonKeyValues().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getQueryByNonKeyValues().equals("supported")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Map Reduce API")) {

						if (returnValueDataModel.getMapReduceAPI().equals("not supported")) {
								return 1;
						} else if (returnValueDataModel.getMapReduceAPI()
								.equals("intergrated with an external framework")) {
								return 5;
						} else if (returnValueDataModel.getMapReduceAPI().equals("builtin")) {
								return 7;
						} else
								return 50;
				}
				//						else if (feature.equals("Indexed Text Search")) {
				//
				//								if (returnValueDataModel.getPhysicalStorageUsage().equals("not supported")) {
				//										return 1;
				//								} else if (returnValueDataModel.getPhysicalStorageUsage().equals("supported")) {
				//										return 7;
				//								}else
				//										return 50;
				//						}
				return null;
		}

		public static Integer getQueryLanguagesRatings2(String databaseName, String feature) {

				QueryLanguage returnValueQuery = new QueryLanguage();
				returnValueQuery.setQueryLanguageDescription(
						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "query")));

				if (feature.equals("API-based")) {
						if (returnValueQuery.getApiBased().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getApiBased().equals("not supported")) {
								return 4;
						} else if (returnValueQuery.getApiBased().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Declarative")) {

						if (returnValueQuery.getDeclaritive().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getDeclaritive().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getJoinStyleQuery().equals("not suppported")) {
								return 1;
						} else if (returnValueQuery.getDeclaritive().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("REST/HTTP-based")) {

						if (returnValueQuery.getRestHTTPBased().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getRestHTTPBased().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getRestHTTPBased().equals("not suppported")) {
								return 1;
						} else if (returnValueQuery.getRestHTTPBased().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Languages supported")) { //todo needs to count the languages

						if (returnValueQuery.getLanguagesSupported().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getLanguagesSupported().equals("2")) {
								return 1;
						} else if (returnValueQuery.getLanguagesSupported().equals("3")) {
								return 2;
						} else if (returnValueQuery.getLanguagesSupported().equals("4")) {
								return 3;
						} else if (returnValueQuery.getLanguagesSupported().equals("5")) {
								return 4;
						} else if (returnValueQuery.getLanguagesSupported().equals("6")) {
								return 5;
						} else if (returnValueQuery.getLanguagesSupported().equals("7")) {
								return 6;
						} else if (returnValueQuery.getLanguagesSupported().equals("8+")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Cursor-based queries")) {
						if (returnValueQuery.getCursorBasedQuery().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getCursorBasedQuery().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getCursorBasedQuery().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("JOIN-style queries")) {
						if (returnValueQuery.getJoinStyleQuery().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getJoinStyleQuery().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getJoinStyleQuery().equals("not suppported")) {
								return 1;
						} else if (returnValueQuery.getJoinStyleQuery().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Complex data types")) {

						if (returnValueQuery.getComplexDataTypes().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getComplexDataTypes().equals("none")) {
								return 1;
						} else if (returnValueQuery.getComplexDataTypes().equals("1")) {
								return 2;
						} else if (returnValueQuery.getComplexDataTypes().equals("2")) {
								return 3;
						} else if (returnValueQuery.getComplexDataTypes().equals("3")) {
								return 4;
						} else if (returnValueQuery.getComplexDataTypes().equals("4")) {
								return 5;
						} else if (returnValueQuery.getComplexDataTypes().equals("5")) {
								return 6;
						} else if (returnValueQuery.getComplexDataTypes().equals("6+")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Restrict number of objects returned by a query")) {

						if (returnValueQuery.getRestrictObjectsReturnByQuery().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getRestrictObjectsReturnByQuery().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getRestrictObjectsReturnByQuery().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Key matching options")) {

						if (returnValueQuery.getKeyMatchingOptions().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getKeyMatchingOptions().equals("exact")) {
								return 1;
						} else if (returnValueQuery.getKeyMatchingOptions().equals("2")) {
								return 3;
						} else if (returnValueQuery.getKeyMatchingOptions().equals("3")) {
								return 5;
						} else if (returnValueQuery.getKeyMatchingOptions().equals("4")) {
								return 7;
						} else
								return 50;

				} else if (feature
						.equals("Sorting of query results")) { //todo values don't match spreadsheet
						if (returnValueQuery.getSortingOfQueryResults().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getSortingOfQueryResults().equals("none")) {
								return 1;
						} else if (returnValueQuery.getSortingOfQueryResults().equals("1")) {
								return 4;
						} else if (returnValueQuery.getSortingOfQueryResults().equals("2")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Triggers")) {

						if (returnValueQuery.getTriggers().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getTriggers().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getTriggers().equals("1")) {
								return 4;
						} else if (returnValueQuery.getTriggers().equals("2")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Expire data values")) {

						if (returnValueQuery.getExpireDataValues().equals("NoValue")) {
								return 0;
						} else if (returnValueQuery.getExpireDataValues().equals("not supported")) {
								return 1;
						} else if (returnValueQuery.getExpireDataValues().equals("supported")) {
								return 7;
						} else
								return 50;
				}
				return null;
		}


		public static Integer getDataReplicationRatings2(String databaseName, String feature) {

				Replication returnValue = new Replication();
				returnValue.setReplicationDescription(ArrayParser
						.parseStringToArray(Database.retrieveDescription(databaseName, "data_replication")));

				if (feature.equals("Replication Architecture")) {
						if (returnValue.getArchitecture().equals("NoValue")) {
								return 0;
						} else if (returnValue.getArchitecture().equals("master-slave")) {
								return 4;
						} else if (returnValue.getArchitecture().equals("peer-to-peer")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Replication for Backup")) {

						if (returnValue.getReplicationForBackup().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReplicationForBackup().equals("not supported")) {
								return 1;
						} else if (returnValue.getReplicationForBackup().equals("not suppported")) {
								return 1;
						} else if (returnValue.getReplicationForBackup().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Replication across Data Centers")) {

						if (returnValue.getReplicationAcrossDataCenters().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReplicationAcrossDataCenters()
								.equals("supported by standard data replication mechanisms")) {
								return 3;
						} else if (returnValue.getReplicationAcrossDataCenters()
								.equals("supported by enterprise version only (data center aware)")) {
								return 6;
						} else if (returnValue.getReplicationAcrossDataCenters()
								.equals("supported by data center aware features")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Replicas Writes")) {

						if (returnValue.getReplicaWrites().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReplicaWrites().equals("to master replica only")) {
								return 1;
						} else if (returnValue.getReplicaWrites().equals("to any replica")) {
								return 3;
						} else if (returnValue.getReplicaWrites()
								.equals("to specified replica (configurable)")) {
								return 5;
						} else if (returnValue.getReplicaWrites().equals("to multiple replicas")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Replica Reads")) {
						if (returnValue.getReplicaReads().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReplicaReads().equals("from master replica only")) {
								return 2;
						} else if (returnValue.getReplicaReads()
								.equals("from specified replica (configurable)")) {
								return 3;
						} else if (returnValue.getReplicaReads().equals("from any replica")) {
								return 5;
						} else if (returnValue.getReplicaReads().equals("from multiple replicas")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Read Repair")) {
						if (returnValue.getReadRepair().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReadRepair().equals("not relevant")) {
								return 1;
						} else if (returnValue.getReadRepair().equals("not supported")) {
								return 1;
						} else if (returnValue.getReadRepair().equals("background")) {
								return 6;
						} else if (returnValue.getReadRepair().equals("per query")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Automatic Replica Failure Detection")) {

						if (returnValue.getAutomaticReplicaFailureDetection().equals("NoValue")) {
								return 0;
						} else if (returnValue.getAutomaticReplicaFailureDetection().equals("not supported")) {
								return 1;
						} else if (returnValue.getAutomaticReplicaFailureDetection().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Automatic Failover")) {

						if (returnValue.getAutomaticFailover().equals("NoValue")) {
								return 0;
						} else if (returnValue.getAutomaticFailover().equals("not supported")) {
								return 1;
						} else if (returnValue.getAutomaticFailover().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Automatic New Master Election after Failure")) {

						if (returnValue.getAutomaticNewMasterElection().equals("NoValue")) {
								return 0;
						} else if (returnValue.getAutomaticNewMasterElection()
								.equals("not supported/not relevant")) {
								return 1;
						} else if (returnValue.getAutomaticNewMasterElection().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Replica Recovery and Resynchronization")) {
						if (returnValue.getReplicaRecoveryAndResync().equals("NoValue")) {
								return 0;
						} else if (returnValue.getReplicaRecoveryAndResync().equals("not supported")) {
								return 1;
						} else if (returnValue.getReplicaRecoveryAndResync()
								.equals("performed by administrator")) {
								return 5;
						} else if (returnValue.getReplicaRecoveryAndResync().equals("supported- automatic")) {
								return 7;
						} else
								return 50;

				}
				return null;
		}

		public static Integer getSecurityRatings2(String databaseName, String feature) {

				Security returnValue = new Security();
				returnValue.setSecurityDescription(
						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "security")));

				if (feature.equals("Client Authentication")) {
						if (returnValue.getClientAuthentication().equals("NoValue")) {
								return 0;
						} else if (returnValue.getClientAuthentication().equals("custom user/password")) {
								return 1;
						} else if (returnValue.getClientAuthentication().equals("2")) {
								return 4;
						} else if (returnValue.getClientAuthentication().equals("3+")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Server authentication")) {//todo values don't map to excel

						if (returnValue.getServerAuthentication().equals("NoValue")) {
								return 0;
						} else if (returnValue.getServerAuthentication().equals("not secured")) {
								return 1;
						} else if (returnValue.getServerAuthentication().equals("1")) {
								return 4;
						} else if (returnValue.getServerAuthentication().equals("2+")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Credential Store")) {

						if (returnValue.getCredentialStore().equals("NoValue")) {
								return 0;
						} else if (returnValue.getCredentialStore().equals("certificates only")) {
								return 1;
						} else if (returnValue.getCredentialStore().equals("external file")) {
								return 4;
						} else if (returnValue.getCredentialStore().equals("in database")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Role Based Security")) {

						if (returnValue.getRoleBasedSecurity().equals("NoValue")) {
								return 0;
						} else if (returnValue.getRoleBasedSecurity().equals("not supported")) {
								return 1;
						} else if (returnValue.getRoleBasedSecurity()
								.equals("supported - enterprise version only")) {
								return 5;
						} else if (returnValue.getRoleBasedSecurity()
								.equals("supported - requires programmatic extension")) {
								return 6;
						} else if (returnValue.getRoleBasedSecurity().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Security Role Options")) {//todo values don't map to excel
						if (returnValue.getSecurityRoleOptions().equals("NoValue")) {
								return 0;
						} else if (returnValue.getSecurityRoleOptions().equals("not supported")) {
								return 1;
						} else if (returnValue.getSecurityRoleOptions().equals("default roles (only)")) {
								return 2;
						} else
								return 50;

				} else if (feature.equals("Scope of Roles")) {
						if (returnValue.getScopeOfRoles().equals("NoValue")) {//todo could be multiple values
								return 0;
						} else if (returnValue.getScopeOfRoles().equals("cluster")) {
								return 1;
						} else if (returnValue.getScopeOfRoles().equals("database")) {
								return 3;
						} else if (returnValue.getScopeOfRoles().contains("collection")) {
								return 4;
						} else if (returnValue.getScopeOfRoles().equals("object")) {
								return 6;
						} else if (returnValue.getScopeOfRoles().equals("field")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Database Encryption")) {

						if (returnValue.getDatabaseEncryption().equals("NoValue")) {
								return 0;
						} else if (returnValue.getDatabaseEncryption().equals("not supported")) {
								return 1;
						} else if (returnValue.getDatabaseEncryption().equals("supported")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Logging")) {

						if (returnValue.getLogging().equals("NoValue")) {
								return 0;
						} else if (returnValue.getLogging().equals("no logging")) {
								return 1;
						} else if (returnValue.getLogging()
								.equals("requires external components (eg Web Servers)")) {
								return 3;
						} else if (returnValue.getLogging().equals("Fixed event logging")) {
								return 5;
						} else if (returnValue.getLogging().equals("configurable event logging")) {
								return 7;
						} else
								return 50;

				}
				return null;

		}

		public static Integer getScalabilityRatings2(String databaseName, String feature) {

				Scalability returnValue = new Scalability();
				returnValue.setScalabilityDescription(ArrayParser
						.parseStringToArray(Database.retrieveDescription(databaseName, "scalability")));

				if (feature.equals("Scale Out Architecture")) {
						if (returnValue.getScaleOutArchitecture().equals("NoValue")) {
								return 0;
						} else if (returnValue.getScaleOutArchitecture().equals("Replicate Complete")) {
								return 1;
						} else if (returnValue.getScaleOutArchitecture().equals("horizontal")) {
								return 5;
						} else if (returnValue.getScaleOutArchitecture().equals("Horizontal and Replicate")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Client Request Load Balancing")) {

						if (returnValue.getClientRequestLoadBalancing().equals("NoValue")) {
								return 0;
						} else if (returnValue.getClientRequestLoadBalancing().equals("HTTP")) {
								return 1;
						} else if (returnValue.getClientRequestLoadBalancing().equals("Fixed")) {
								return 3;
						} else if (returnValue.getClientRequestLoadBalancing()
								.equals("Bal. across coordinators")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Scale Data Capacity")) {

						if (returnValue.getScaleDataCapacity().equals("NoValue")) {
								return 0;
						} else if (returnValue.getScaleDataCapacity().equals("Single")) {
								return 1;
						} else if (returnValue.getScaleDataCapacity().equals("Manual")) {
								return 3;
						} else if (returnValue.getScaleDataCapacity().equals("Auto")) {
								return 7;
						} else
								return 50;

				} else if (feature.equals("Data Object Based Locks on Writes")) {

						if (returnValue.getDataObjectsBasedOnLocks().equals("NoValue")) {
								return 0;
						} else if (returnValue.getDataObjectsBasedOnLocks().equals("whole database")) {
								return 1;
						} else if (returnValue.getDataObjectsBasedOnLocks()
								.equals("single threaded (partition lock)")) {
								return 4;
						} else if (returnValue.getDataObjectsBasedOnLocks().equals("object")) {
								return 6;
						} else
								return 7;

				} else if (feature.equals("Scalable Request Processing Architecture")) {
						if (returnValue.getScalableRequestProcessingArchitecture().equals("NoValue")) {
								return 0;
						} else if (returnValue.getScalableRequestProcessingArchitecture()
								.equals("Not scalable")) {
								return 1;
						} else if (returnValue.getScalableRequestProcessingArchitecture().equals("external")) {
								return 3;
						} else if (returnValue.getScalableRequestProcessingArchitecture()
								.equals("centralized")) {
								return 5;
						} else if (returnValue.getScalableRequestProcessingArchitecture()
								.equals("fully distributed")) {
								return 7;
						} else
								return 50;

				}
				return null;
		}

}


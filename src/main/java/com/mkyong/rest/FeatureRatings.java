package com.mkyong.rest;

import com.mkyong.*;

/**
 * Created by andrewdickens on 8/7/16.
 */
public class FeatureRatings {

//		public static int[] cassandraAdminRatings = new int[6];
//
//		int[] rankings;
//
//		public int[] getRankings() {
//				return rankings;
//		}

//		public void setRankings(int[] rankings) {
//				this.rankings = rankings;
//		}

//		public static FeatureRatings getFeatureRating(String featureType, String databaseName) {
//				if (featureType.equals("admin")) {
//						return FeatureRatings.getAdminRatings(databaseName);
//				} else if (featureType.equals("consistency")) {
//						return FeatureRatings.getConsistencyRatings(databaseName);
//				} else if (featureType.equals("data_distribution")) {
//						return FeatureRatings.getDataDistributionRatings(databaseName);
//				} else if (featureType.equals("data_model")) {
//						return FeatureRatings.getDataModelRatings(databaseName);
//				} else if (featureType.equals("query")) {
//						return FeatureRatings.getQueryLanguagesRatings(databaseName);
//				} else if (featureType.equals("data_replication")) {
//						return FeatureRatings.getDataReplicationRatings(databaseName);
//				} else if (featureType.equals("security")) {
//						return FeatureRatings.getSecurityRatings(databaseName);
//				} else if (featureType.equals("scalability")) {
//						return FeatureRatings.getScalabilityRatings(databaseName);
//				}
//				return null;
//		}
//
//		public static FeatureRatings getAdminRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 75;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 75;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 75;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 12;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 75;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getConsistencyRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 75;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 7;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 18;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 7;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 75;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getDataDistributionRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 75;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 7;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 75;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 75;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 75;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 12;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 75;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 7;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getDataModelRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 75;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 48;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 11;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 75;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 75;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 7;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getQueryLanguagesRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 75;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 48;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 7;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 75;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 12;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 7;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getDataReplicationRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 75;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 48;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 48;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 7;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getSecurityRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 6;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 8;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 12;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 7;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 12;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 12;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 48;
//						returnValueArray[5] = 7;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 7;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}
//
//		public static FeatureRatings getScalabilityRatings(String databaseName) {
//
//				FeatureRatings returnValue = new FeatureRatings();
//				int returnValueArray[] = new int[7];
//
//				if (databaseName.equals("accumulo")) {
//						returnValueArray[0] = 2;
//						returnValueArray[1] = 4;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 48;
//						returnValueArray[6] = 55;
//				} else if (databaseName.equals("cassandra")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 7;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("hbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("mongo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 12;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("couch")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 7;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 12;
//				} else if (databaseName.equals("couchbase")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 48;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("orient")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 7;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 48;
//				} else if (databaseName.equals("neo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 12;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("redis")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("riak")) {
//						returnValueArray[0] = 12;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 7;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("dynamo")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 48;
//						returnValueArray[3] = 12;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("oracle")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 48;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("foundation")) {
//						returnValueArray[0] = 5;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 7;
//						returnValueArray[6] = 60;
//				} else if (databaseName.equals("volt")) {
//						returnValueArray[0] = 48;
//						returnValueArray[1] = 10;
//						returnValueArray[2] = 76;
//						returnValueArray[3] = 4;
//						returnValueArray[4] = 24;
//						returnValueArray[5] = 8;
//						returnValueArray[6] = 12;
//				}
//
//				returnValue.setRankings(returnValueArray);
//
//				return returnValue;
//		}

		public static Integer getFeatureRatingAll(String databaseName, String featureCategory,
				String feature) {
				if (featureCategory.equals("admin")) {
						return FeatureRatings.getAdminRatings2(databaseName, feature);
				} else if (featureCategory.equals("consistency")) {
						return FeatureRatings.getConsistencyRatings2(databaseName, feature);
				} else if (featureCategory.equals("data_distribution")) {
						return FeatureRatings.getDataDistributionRatings2(databaseName, feature);
				}
				// else if (featureCategory.equals("data_model")) {
				//						return FeatureRatings.getDataModelRatings2(databaseName, feature);
				//				}
				// else if (featureCategory.equals("query")) {
				//						return FeatureRatings.getQueryLanguagesRatings2(databaseName, feature);
				//				}
				// else if (featureCategory.equals("data_replication")) {
				//						return FeatureRatings.getDataReplicationRatings2(databaseName, feature);
				//				}
				// else if (featureCategory.equals("security")) {
				//						return FeatureRatings.getSecurityRatings2(databaseName, feature);
				//				}
				// else if (featureCategory.equals("scalability")) {
				//						return FeatureRatings.getScalabilityRatings2(databaseName, feature);
				//				}
				return null;
		}

		public static Integer getAdminRatings2(String databaseName, String feature) {

				Admin returnValueAdmin = new Admin();
				returnValueAdmin.setAdminDescription(
						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "admin")));

				if (feature.equals("Configuration Files")) {
						if (returnValueAdmin.getConfigurationFiles().equals("multiple")) {
								return 4;
						}if (returnValueAdmin.getConfigurationFiles().equals("single")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Node command line access")) {

						if (returnValueAdmin.getNodeCommandLineAccess().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getNodeCommandLineAccess().equals("non-authenticated")) {
								return 3;
						}else if (returnValueAdmin.getNodeCommandLineAccess().equals("authenticated")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Node add remove")) {

						if (returnValueAdmin.getNodeAddRemove().equals("multiple files")) {
								return 1;
						} else if (returnValueAdmin.getNodeAddRemove().equals("single file")) {
								return 4;
						}else if (returnValueAdmin.getNodeAddRemove().equals("centralized tool, multiple files")) {
								return 7;
						} else if (returnValueAdmin.getNodeAddRemove().equals("centralized tool")) {
								return 7;
						}else
								return 50;
				} else if (feature.equals("Cluster monitoring")) {
						if (returnValueAdmin.getClusterMonitoring().equals("snapshot")) {
								return 3;
						} else if (returnValueAdmin.getClusterMonitoring().equals("enterprise version only")) {
								return 6;
						}else if (returnValueAdmin.getClusterMonitoring().equals("real time")) {
								return 7;
						} else
								return 50;
				} else if (feature.equals("Dump database configuration")) {

						if (returnValueAdmin.getDumpDatabaseConfiguration().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getDumpDatabaseConfiguration().equals("supported")) {
								return 7;
						}else
								return 50;
				} else if (feature.equals("Database object count")) {

						if (returnValueAdmin.getDatabaseObjectCount().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getDatabaseObjectCount().equals("supported")) {
								return 7;
						}else
								return 50;
				} else if (feature.equals("Physical storage usage")) {

						if (returnValueAdmin.getPhysicalStorageUsage().equals("not supported")) {
								return 1;
						} else if (returnValueAdmin.getPhysicalStorageUsage().equals("supported")) {
								return 7;
						}else
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
						}else
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
						returnValueDistribution.setDistributionDescription(
								ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "data_distribution")));

						if (feature.equals("Data Distribution Architecture")) {
								if (returnValueDistribution.getArchitecture().equals("NoValue")) {
										return 0;
								} else if (returnValueDistribution.getArchitecture().equals("single database only")) {
										return 1;
								} else if (returnValueDistribution.getArchitecture().equals("master-single slave")) {
										return 3;
								}else if (returnValueDistribution.getArchitecture().equals("master-multiple slaves")) {
										return 5;
								}else return 7;
						} else if (feature.equals("Data Distribution Method")) {

								if (returnValueDistribution.getDistributionMethod().equals("NoValue")) {
										return 0;
								} else if (returnValueDistribution.getDistributionMethod().equals("Not relevant (single server only)")) {
										return 1;
								} else if (returnValueDistribution.getDistributionMethod()
										.equals("assigned key ranges to nodes")) {
										return 3;
								}else if (returnValueDistribution.getDistributionMethod()
										.equals("hash key")) {
										return 6;
								} else
										return 7;
						} else if (feature.equals("Automatic Data Rebalancing")) {

								if (returnValueDistribution.getRebalancing().equals("NoValue")) {
										return 0;
								} else if (returnValueDistribution.getRebalancing().equals("no rebalancing (single server only)")) {
										return 1;
								}else if (returnValueDistribution.getRebalancing().equals("administrative rebalancing tools")) {
										return 3;
								}else if (returnValueDistribution.getRebalancing().equals("schedulable rebalancing")) {
										return 4;
								}else if (returnValueDistribution.getRebalancing().equals("failure triggered")) {
										return 5;
								} else if (returnValueDistribution.getRebalancing().equals("new storage triggered")) {
										return 6;
								}else
										return 7;
						} else if (feature
								.equals("Physical Data Distribution")) {

								if (returnValueDistribution.getPhysicalDistribution().equals("NoValue")) {
										return 0;
								} else if (returnValueDistribution.getPhysicalDistribution()
										.equals("single cluster")) {
										return 3;
								}else if (returnValueDistribution.getPhysicalDistribution()
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
								} else if (returnValueDistribution.getNonShardKey()
										.equals("not supported")) {
										return 1;
								} else if (returnValueDistribution.getNonShardKey()
										.equals("non-indexed (scan)")) {
										return 3;
								} else
										return 7;
						}else if (feature.equals("Merging Query Results from Multiple Shards")) {

								if (returnValueDistribution.getMergingResults().equals("NoValue")) {
										return 0;
								} else if (returnValueDistribution.getMergingResults()
										.equals("not supported")) {
										return 1;
								} else if (returnValueDistribution.getMergingResults()
										.equals("random order")) {
										return 3;
								} else if (returnValueDistribution.getMergingResults()
										.equals("paged from server")) {
										return 5;
								}else
										return 7;
						}

						return null;
				}
		//
		//		public static Integer getDataModelRatings2(String databaseName, String feature) {
		//
		//				DataModel returnValueAdmin = new DataModel();
		//				returnValueAdmin.setDataModelDescription(
		//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "data_model")));
		//
		//				if (databaseName.equals("accumulo")) {
		//						returnValueArray[0] = 2;
		//						returnValueArray[1] = 4;
		//						returnValueArray[2] = 6;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 12;
		//						returnValueArray[6] = 55;
		//				} else if (databaseName.equals("cassandra")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 75;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 7;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("hbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 48;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("mongo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 75;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couch")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 7;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couchbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 48;
		//				} else if (databaseName.equals("orient")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 7;
		//				} else if (databaseName.equals("neo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("redis")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 11;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("riak")) {
		//						returnValueArray[0] = 75;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 48;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("dynamo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("oracle")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 48;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 75;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("foundation")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 7;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("volt")) {
		//						returnValueArray[0] = 48;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				}
		//
		//				returnValue.setRankings(returnValueArray);
		//
		//				return returnValue;
		//		}
		//
		//		public static Integer getQueryLanguagesRatings2(String databaseName, String feature) {
		//
		//				QueryLanguage returnValueAdmin = new QueryLanguage();
		//				returnValueAdmin.setQueryLanguageDescription(
		//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "query_language")));
		//
		//				if (databaseName.equals("accumulo")) {
		//						returnValueArray[0] = 2;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 75;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 55;
		//				} else if (databaseName.equals("cassandra")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 7;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 48;
		//				} else if (databaseName.equals("hbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("mongo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couch")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 7;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couchbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("orient")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 12;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("neo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 48;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 75;
		//				} else if (databaseName.equals("redis")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 12;
		//				} else if (databaseName.equals("riak")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 7;
		//				} else if (databaseName.equals("dynamo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("oracle")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("foundation")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 7;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("volt")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				}
		//
		//				returnValue.setRankings(returnValueArray);
		//
		//				return returnValue;
		//		}
		//
		//		public static Integer getDataReplicationRatings2(String databaseName, String feature) {
		//
		//				Replication returnValueAdmin = new Replication();
		//				returnValueAdmin.setReplicationDescription(
		//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "data_replication")));
		//
		//				if (databaseName.equals("accumulo")) {
		//						returnValueArray[0] = 2;
		//						returnValueArray[1] = 4;
		//						returnValueArray[2] = 6;
		//						returnValueArray[3] = 7;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 55;
		//				} else if (databaseName.equals("cassandra")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 48;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("hbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("mongo")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 7;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couch")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 75;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 48;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couchbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 7;
		//				} else if (databaseName.equals("orient")) {
		//						returnValueArray[0] = 48;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("neo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 48;
		//				} else if (databaseName.equals("redis")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 7;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("riak")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 48;
		//				} else if (databaseName.equals("dynamo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 12;
		//						returnValueArray[6] = 7;
		//				} else if (databaseName.equals("oracle")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("foundation")) {
		//						returnValueArray[0] = 48;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 12;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("volt")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 7;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				}
		//
		//				returnValue.setRankings(returnValueArray);
		//
		//				return returnValue;
		//		}
		//
		//		public static Integer getSecurityRatings2(String databaseName, String feature) {
		//
		//				Security returnValueAdmin = new Security();
		//				returnValueAdmin.setSecurityDescription(
		//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "security")));
		//
		//				if (databaseName.equals("accumulo")) {
		//						returnValueArray[0] = 2;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 6;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 55;
		//				} else if (databaseName.equals("cassandra")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("hbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 7;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("mongo")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 8;
		//				} else if (databaseName.equals("couch")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 12;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couchbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("orient")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 7;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("neo")) {
		//						returnValueArray[0] = 48;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("redis")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 12;
		//				} else if (databaseName.equals("riak")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("dynamo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 12;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("oracle")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 48;
		//						returnValueArray[5] = 7;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("foundation")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("volt")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 7;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				}
		//
		//				returnValue.setRankings(returnValueArray);
		//
		//				return returnValue;
		//		}
		//
		//		public static Integer getScalabilityRatings2(String databaseName, String feature) {
		//
		//				Scalability returnValueAdmin = new Scalability();
		//				returnValueAdmin.setScalabilityDescription(
		//						ArrayParser.parseStringToArray(Database.retrieveDescription(databaseName, "scalability")));
		//
		//				if (databaseName.equals("accumulo")) {
		//						returnValueArray[0] = 2;
		//						returnValueArray[1] = 4;
		//						returnValueArray[2] = 12;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 48;
		//						returnValueArray[6] = 55;
		//				} else if (databaseName.equals("cassandra")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 7;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("hbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("mongo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 12;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("couch")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 7;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 12;
		//				} else if (databaseName.equals("couchbase")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 48;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("orient")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 7;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 48;
		//				} else if (databaseName.equals("neo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 12;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("redis")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 48;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("riak")) {
		//						returnValueArray[0] = 12;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 7;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("dynamo")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 48;
		//						returnValueArray[3] = 12;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("oracle")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 48;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("foundation")) {
		//						returnValueArray[0] = 5;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 7;
		//						returnValueArray[6] = 60;
		//				} else if (databaseName.equals("volt")) {
		//						returnValueArray[0] = 48;
		//						returnValueArray[1] = 10;
		//						returnValueArray[2] = 76;
		//						returnValueArray[3] = 4;
		//						returnValueArray[4] = 24;
		//						returnValueArray[5] = 8;
		//						returnValueArray[6] = 12;
		//				}
		//
		//				returnValue.setRankings(returnValueArray);
		//
		//				return returnValue;
		//		}

}


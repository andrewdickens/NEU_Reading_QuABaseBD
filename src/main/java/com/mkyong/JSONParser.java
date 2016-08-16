package com.mkyong;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by andrewdickens on 7/13/16.
 */
public class JSONParser {
		public static void main(String[] args) {
				//				int[] data = {5, 10, 20};
				//				System.out.println(denom2(20, data));
				//				System.out.println(denom(800000, data));

				String sValue = "{{Data Model\n" + "|Database=HBase\n" + "|Data Model=Column\n"
						+ "|Data Model URL=http://www-01.ibm.com/software/data/infosphere/hadoop/hbase/\n"
						+ "|Enforced Schema=not required\n"
						+ "|Data Schema URL=http://hbase.apache.org/book.html#schema\n"
						+ "|Opaque Data Objects (need application interpretation)=not required\n"
						+ "|Hierarchical Data Objects (e.g. sub objects)=not supported\n"
						+ "|Data Hierarchy URL=http://hbase.apache.org/book.html#supported.datatypes\n"
						+ "|Automatically Allocated Keys=not supported\n" + "|Composite Keys=supported\n"
						+ "|Data Composite Key URL=http://www.flurry.com/2012/06/12/137492485#.VNDkEGjF98E\n"
						+ "|Secondary Indexes=not supported\n"
						+ "|Data 2i URL=http://hbase.apache.org/book.html#secondary.indexes\n"
						+ "|Query by Key Ranges=supported\n"
						+ "|Data Key Range URL=http://www.cloudera.com/content/cloudera/en/documentation/core/v5-2-x/topics/admin_hbase_scanning.html\n"
						+ "|Query by Partial Keys=supported\n"
						+ "|Data Partial Key URL=http://www.cloudera.com/content/cloudera/en/documentation/core/v5-2-x/topics/admin_hbase_filtering.html?scroll=xd_583c10bfdbd326ba-7dae4aa6-147c30d0933--7c9e\n"
						+ "|Query by Non-keyed Values=supported\n"
						+ "|Data Query Scan URL=http://hbase.apache.org/book.html#secondary.indexes\n"
						+ "|Map Reduce API=builtin\n"
						+ "|Data Map Reduce URL=http://hbase.apache.org/book.html#mapreduce\n"
						+ "|Indexed Text Search=support in a plug-in (e.g. Solr)\n"
						+ "|Data Text Search URL=http://ngdata.github.io/hbase-indexer/\n" + "}}\n"
						+ "HBase is a column-oriented database management system that runs on top of HDFS.\n"
						+ "\n"
						+ "HBASE does not natively support secondary indexes, although they can be built in seperate tables using map-reduce jobs. \n"
						+ "\n"
						+ "Depending on the query use case, it may be appropriate to use client.filter. In this case, no secondary index is created - it is effectively a table scan.\n"
						+ "\n"
						+ "A Scan fetches zero or more rows of a table. By default, a Scan reads the entire table from start to end. You can limit your Scan results in several different ways, which affect the Scan's load in terms of IO, network, or both, as well as processing load on the client side. You can specify a key range using a startrow and stoprow. A PrefixFilter takes a single argument, a prefix of a row key. It returns only those key-values present in a row that start with the specified row prefix, thus supporting compoung and partial key queries.";


				String bValue = "{{Data Replication\n" + "|Database=CouchDB\n"
						+ "|Replication Architecture=master-slave\n"
						+ "|Repl Arch URL=http://wiki.apache.org/couchdb/Replication#Overview\n"
						+ "|Replication for Backup=supported\n"
						+ "|Repl Backup URL=http://wiki.apache.org/couchdb/Replication#Continuous_replication\n"
						+ "|Replication across Data Centers=supported only by standard replication mechanisms\n"
						+ "|Repl Data Centers URL=http://guide.couchdb.org/draft/replication.html\n"
						+ "|Replicas Writes=to specified replica (configurable)\n"
						+ "|Replica Reads=from specified replica (configurable)\n"
						+ "|Read Repair=not relevant\n" + "|Automatic Replica Failure Detection=not supported\n"
						+ "|Automatic Failover=not supported\n"
						+ "|Automatic New Master Election after Failure=not relevant\n"
						+ "|Replica Recovery and Resynchronization=supported- automatic\n"
						+ "|Repl Recovery URL=http://guide.couchdb.org/draft/conflicts.html\n" + "}}\n"
						+ "Native replication is one-way peer-to-peer using a direct connection, but you can implement Master/Slave, Master/Master, and other types of replication modalities by configuring the basic one way replication mechanism for multiple nodes.\n"
						+ "\n"
						+ "Replication is incremental. If a target node is down, when it recovers the replication mechanism will reconnect and resume replication.\n"
						+ "\n"
						+ "CouchDB’s operations take place within the context of a single document. As CouchDB achieves eventual consistency between multiple databases by using incremental replication you no longer have to worry about your database servers being able to stay in constant communication. Incremental replication is a process where document changes are periodically copied between servers. We are able to build what’s known as a shared nothing cluster of databases where each node is independent and self-sufficient, leaving no single point of contention across the system.\n"
						+ "\n"
						+ "BigCouch is an implementation of the aforementioned Dynamo paper by Amazon. Dynamo defines a cluster and data management system that allows any number of machines to behave as if it was one while handling magnitudes more data and requests than a single server could handle, and on top of that be very resilient against server faults. The features evaluated in this page do not include BigCouch capabilities.";


				String[] charactersRemoved = removeNewLine(toArray(bValue));

				//				for(int i=0; i<charactersRemoved.length; i++){
				//						System.out.println(charactersRemoved[i]);
				//				}
				//
				System.out.println(toJSON(charactersRemoved));

				String[][] keyValuesParsed = to2DArray(charactersRemoved);

				System.out.println(toJSON(keyValuesParsed));

		}

		public static String parseStringToJSON(String input){
				String[] charactersRemoved = removeNewLine(toArray(input));
				String[] keyValuesParsed = insertColons(charactersRemoved);

				return toJSON(keyValuesParsed);
		}

		public static String[] toArray(String input){
				String[] returnValue = input.split("\n");

				for(int i=0; i<returnValue.length; i++) {
						returnValue[i]=returnValue[i].replace("{{", "").replace("|", "").replace("}}", "");
						//						returnValue[i].replace("|", "");
						//						System.out.println(returnValue[i]);
				}


				return returnValue;
		}
		public static String[] removeNewLine(String[] input){
				int count=1;
				for(int i=0; i<input.length; i++){
						if(input[i].contains("=")){
								count++;
						}
				}

				String[] returnValue = new String[count];

				int x=1;
				returnValue[0] = input[0];
				for(int i=1; i<input.length; i++){
						if(input[i].contains("=")){
								returnValue[x] = input[i];
								x++;
						}
				}

				return returnValue;
		}

		public static String toJSON(String[] input){
				Gson gson = new GsonBuilder().disableHtmlEscaping().create();

				return gson.toJson(input);
		}

		public static String toJSON(String[][] input){
				Gson gson = new GsonBuilder().disableHtmlEscaping().create();

				return gson.toJson(input);
		}

		public static String[][] to2DArray(String[] input){

				int count=0;
				for(int i=0; i<input.length; i++){
						count = count+1;
				}

				String[][] returnMatrix = new String[count][2];

				returnMatrix[0][0] = input[0];
				returnMatrix[0][1] = "NO_VALUE";

				for(int i=1; i<count; i++){
						String[] parsedArray;
						parsedArray = input[i].split("=");

						returnMatrix[i][0] = parsedArray[0];
						returnMatrix[i][1] = parsedArray[1];
				}

				return returnMatrix;
		}

		public static String[] insertColons(String[] input){
				String[] returnValue = new String[input.length];
				returnValue[0] = input[0];

				for(int i=1; i<input.length; i++){
						returnValue[i] = input[i].replace("=", ":");
				}

				return returnValue;
		}

}

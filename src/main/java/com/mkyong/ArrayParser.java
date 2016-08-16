package com.mkyong;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by andrewdickens on 7/17/16.
 */
public class ArrayParser {

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

						String cValue  ="{{Admin\n" + "|Database=Accumulo\n" + "|Configuration Files=multiple\n"
								+ "|Admin Config Files URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_configuration_4\n"
								+ "|Node command line access=authenticated\n"
								+ "|Admin Command Line URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_accumulo_shell\n"
								+ "|Node add/remove=centralized tool\n"
								+ "|Admin Node Add URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_adding_a_node\n"
								+ "|Cluster monitoring=snapshot\n"
								+ "|Admin Cluster Monitoring URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_accumulo_monitor\n"
								+ "|Dump database configuration=supported\n"
								+ "|Admin Dump Config URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#metadata\n"
								+ "|Database object count=supported\n"
								+ "|Admin Object Count URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_tools\n"
								+ "|Physical storage usage=supported\n"
								+ "|Admin Storage Size URL=https://accumulo.apache.org/1.7/accumulo_user_manual.html#_tools\n"
								+ "}}\n" + "Accumulo 1.7 (27 May 2015)\n" + "\n"
								+ "Accumulo shows object count and storage use at each node in the cluster, but not for an entire table or cluster.";

						String dValue = "{{Scalability\n"
								+ "|Scale Out Architecture=horizontal partitioning of database, horizontal partitioning and replication\n"
								+ "|Scale Out URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html\n"
								+ "|Database=Accumulo\n"
								+ "|Client Request Load Balancing=fixed connections to a request coordinator\n"
								+ "|Load Balancing URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html\n"
								+ "|Scale Data Capacity=automatic data rebalancing\n"
								+ "|Scale Data URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html\n"
								+ "|Data Object Based Locks on Writes=locks on updated objects only\n"
								+ "|Write Locks URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html\n"
								+ "|Scalable Request Processing Architecture=centralized coordinator, but can be replicated\n"
								+ "|Scale Architecture URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html\n"
								+ "}}\n" + "==Notes==\n"
								+ "Accumulo stores data in tables, which are partitioned into tablets. Tablets are partitioned on row boundaries so that all of the columns and values for a particular row are found together within the same tablet. \n"
								+ "\n"
								+ "The Master assigns Tablets to one TabletServer at a time. This enables row-level transactions to take place without using distributed locking or some other complicated synchronization mechanism. As clients insert and query data, and as machines are added and removed from the cluster, the Master migrates tablets to ensure they remain available and that the ingest and query load is balanced across the cluster.\n"
								+ "\n" + "==Notes==";

						String eValue = "{{Consistency Features\n" + "|Database=Accumulo\n"
								+ "|Object-Level isolation on updates=supported\n"
								+ "|Const Object Isolation URL=https://accumulo.apache.org/1.6/accumulo_user_manual.html#_writing_data\n"
								+ "|ACID transactions in single database=lightweight transactions (e.g. compare and set)\n"
								+ "|Const ACID Trans URL=https://accumulo.apache.org/1.6/accumulo_user_manual.html#_conditionalwriter\n"
								+ "|Distributed ACID transactions=not supported\n"
								+ "|Const Distributed Trans URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Updates applied to transaction log before returning from write=supported\n"
								+ "|Const Log Writes URL=https://accumulo.apache.org/1.6/accumulo_user_manual.html\n"
								+ "|Specify Quorum Reads/Writes=not supported\n"
								+ "|Const Quorum URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Specify number of replicas to write to=not supported\n"
								+ "|Const Replica Write URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Behaviour when write cannot complete on specified number of replicas=no rollback: write returns replication error\n"
								+ "|Const Write Replica Fail URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Writes configured to never fail=not supported\n"
								+ "|Const Write Never Fail URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch03.html\n"
								+ "|Specify number of replicas to read from=not supported\n"
								+ "|Const Replica Read URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Read from replica master only=specified in the database configuration\n"
								+ "|Const Master Read URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Object level timestamps to detect conflicts=not applicable: master-slave\n"
								+ "|Const Timestamps URL=https://accumulo.apache.org/1.6/accumulo_user_manual.html#_versioning_iterators_and_timestamps\n"
								+ "|Efficient protocol to rapidly propagate updates across replicas (minimize inconsistency window)=fixed\n"
								+ "|Const Protocol URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "}}\n"
								+ "When a write arrives at a TabletServer it is written to a Write-Ahead Log and then inserted into a sorted data structure in memory called a MemTable. When the MemTable reaches a certain size the TabletServer writes out the sorted key-value pairs to a file in HDFS called Indexed Sequential Access Method (ISAM) file. This process is called a minor compaction. A new MemTable is then created and the fact of the compaction is recorded in the Write-Ahead Log.\n"
								+ "\n"
								+ "Accumulo tablets are assigned to exactly one Tablet Server at a time. This allows one server to manage all the reads and writes for a particular range of keys, allowing reads and write to be highly consistent, as no synchronization has to occur between Tablet Servers. When a client writes a piece of information to a row, clients reading that row immediately afterward will see the new information.\n"
								+ "\n"
								+ "Tablet Servers host a set of tablets and are responsible for all the writes and reads for those tablets. Clients connect directly to Tablet Servers to read and write data. Tablet Servers may host hundreds or even thousands of tablets, each consisting of about 1 GB of data or more. Tablet Servers store data written to these tablets in memory and in files in HDFS, and handle scanning data for clients, applying any additional filtering or processing the clients request.\n"
								+ "\n"
								+ "The only transactions allowed by Accumulo are inserts, deletes, or updates to multiple values within a single row. These transactions are atomic, consistent, isolated and durable. But a set of updates to multiple rows in the same table, or rows in different tables do not have these guarantees.\n"
								+ "\n"
								+ "Accumulo relies on HDFS to provide persistent storage, replication, and fault tolerance. The Accumulo client automatically handles errors related to the automatic failover from one TabletServer to another. This frees up the application designer to focus on the logic of the application rather than having to write the code to retry inserts.\n"
								+ "Unlike some NoSQL databases, Accumulo assumes you do care to know that your Mutations have been successfully applied. If for some reason a Mutation fails, the Accumulo client will throw a MutationsRejectedException.";

						String fValue= "{{Data Distribution\n" + "|Database=Accumulo\n"
								+ "|Data Distribution Architecture=master-single slave, master-multiple slaves\n"
								+ "|Dist Architecture URL=http://people.apache.org/~elserj/accumulo_user_manual.html#_replication\n"
								+ "|Data Distribution Method=assigned key ranges to nodes\n"
								+ "|Dist Distribution URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_splitting\n"
								+ "|Automatic Data Rebalancing=new storage triggered\n"
								+ "|Dist Rebalance URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_splitting\n"
								+ "|Physical Data Distribution=single cluster, rack-aware on single cluster\n"
								+ "|Dist Physical URL=http://www.accumulodata.com/ec2.html\n"
								+ "|Query Architecture=direct shard connection only (resolved in client)\n"
								+ "|Dist Query URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch04.html\n"
								+ "|Queries using Non-Shard Key Value=not supported\n"
								+ "|Merging Query Results from Multiple Shards=random order\n"
								+ "|Dist Merge URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_batchscanner\n"
								+ "}}\n"
								+ "When a table is created it has one tablet. As the table grows its initial tablet eventually splits into two tablets. Its likely that one of these tablets will migrate to another tablet server. As the table continues to grow, its tablets will continue to split and be migrated. The decision to automatically split a tablet is based on the size of a tablets files. The size threshold at which a tablet splits is configurable per table. In addition to automatic splitting, a user can manually add split points to a table to create new tablets. Manually splitting a new table can parallelize reads and writes giving better initial performance without waiting for automatic splitting.\n"
								+ "\n"
								+ "It is important to note that the keys returned by a BatchScanner are not in sorted order since the keys streamed are from multiple TabletServers in parallel.\n"
								+ "\n"
								+ "When the client obtains a connection to Accumulo, it reads the available tablet servers from Zookeeper and connects to a tablet server to authenticate. The Connector can then be used to retrieve various types of scanner or writer objects for reading from or writing to Accumulo. It can also be used to retrieve objects that can perform table operations, instance operations, and security operations.";

						String gValue = "{{Query Languages\n" + "|Database=Accumulo\n"
								+ "|API-based=supported\n" + "|QL API URL=http://sqrrl.com/product/accumulo/\n"
								+ "|Declarative=not suppported\n" + "|REST/HTTP-based=not suppported\n"
								+ "|Languages supported=Java, Python, PHP, Ruby\n"
								+ "|QL Languages URL=https://accumulo.apache.org/1.4/user_manual/Writing_Accumulo_Clients.html#Proxy\n"
								+ "|Cursor-based queries=supported\n"
								+ "|QL Cursors URL=http://accumulo.apache.org/1.5/apidocs/org/apache/accumulo/core/file/rfile/bcfile/TFile.Reader.Scanner.html\n"
								+ "|JOIN-style queries=not suppported\n" + "|Complex data types=none\n"
								+ "|QL Data Types URL=https://www.safaribooksonline.com/library/view/accumulo/9781491947098/ch01.html\n"
								+ "|Restrict number of objects returned by a query=supported\n"
								+ "|QL Restrict URL=http://accumulo.apache.org/1.4/apidocs/org/apache/accumulo/core/client/Scanner.html\n"
								+ "|Key matching options=exact\n" + "|Sorting of query results=ascending\n"
								+ "|QL Sort URL=http://accumulo.apache.org/user_manual_1.3-incubating/Accumulo_Design.html#Data_Model\n"
								+ "|Triggers=not supported\n" + "|Expire data values=supported\n"
								+ "|QL Expiry URL=http://accumulo.apache.org/user_manual_1.3-incubating/Table_Configuration.html#Iterators\n"
								+ "}}\n"
								+ "Accumulo has a native java API and supports Thrift, enabling clients including Python and C# and Ruby to be generated.\n"
								+ "\n"
								+ "Sqrrl Enterprise Sqrrl adds richer search and query capabilities, including full-text keyword search, document search (i.e., JSON document support), a SQL-like queries, and graph search. - See more at: http://sqrrl.com/product/accumulo/#sthash.O4LRpuo9.dpuf\n"
								+ "\n"
								+ "Accumulo sorts keys by element and lexicographically in ascending order.\n"
								+ "\n"
								+ "Values comprise the value part of the key-value pair. As such, they are not sorted. Values are byte arrays that can hold a wide variety of data. \n"
								+ "\n"
								+ "To configure the AgeOff filter to remove data older than a certain date or a fixed amount of time from the present.\n"
								+ "\n"
								+ "Accumulo allows aggregating iterators to be configured on tables and column families. When an aggregating iterator is set, the iterator is applied across the values associated with any keys that share rowID, column family, and column qualifier. This is similar to the reduce step in MapReduce, which applied some function to all the values associated with a particular key.";

						String hValue = "{{Security\n" + "|Database=Accumulo\n"
								+ "|Client Authentication=custom user/password\n"
								+ "|Sec Client Auth URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_pluggable_security\n"
								+ "|Server authentication=shared keyfile\n"
								+ "|Sec Server Auth URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_accumulo_settings\n"
								+ "|Credential Store=external file\n"
								+ "|Sec Credentials URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_pluggable_security\n"
								+ "|Role Based Security=supported\n"
								+ "|Sec Roles URL=http://www.pcworld.com/article/2060060/nsas-accumulo-nosql-store-offers-rolebased-data-access.html\n"
								+ "|Security Role Options=custom roles\n"
								+ "|Sec Role Options URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_security_label_expression_syntax\n"
								+ "|Scope of Roles=collection, field\n"
								+ "|Sec Role Scope URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_security\n"
								+ "|Database Encryption=supported\n"
								+ "|Sec Encrypt URL=https://accumulo.apache.org/notable_features.html\n"
								+ "|Logging=Fixed event logging\n"
								+ "|Sec Logging URL=http://accumulo.apache.org/1.6/accumulo_user_manual.html#_logging\n"
								+ "}}\n"
								+ "Accumulo extends the BigTable data model to implement a security mechanism known as cell-level security. Every key-value pair has its own security label, stored under the column visibility element of the key, which is used to determine whether a given user meets the security requirements to read the value. To prevent users from writing data they can not read, add the visibility constraint to a table. Use the -evc option in the createtable shell command to enable this constraint. \n"
								+ "\n"
								+ "New in 1.5 of Accumulo is a pluggable security mechanism. It can be broken into three actions?\u0097?authentication, authorization, and permission handling. By default all of these are handled in Zookeeper. This setup allows a variety of different mechanisms to be used for handling different aspects of Accumulo\u0092s security. A system like Kerberos can be used for authentication, then a system like LDAP could be used to determine if a user has a specific permission\n"
								+ "\n"
								+ "Still a work in progress, Accumulo 1.6.0 introduced encryption at rest (RFiles and WriteAheadLogs) and wire encryption (Thrift over SSL) to provide enhance the level of security that Accumulo provides. It is still a work in progress because the intermediate files created by Accumulo when recovering from a TabletServer failure are not encrypted.\n"
								+ "\n"
								+ "Sqrrl Enterprise supports both encryption of data-at-rest and data-in-motion. - See more at: http://sqrrl.com/sqrrl-enterprise-accumulo-and-encryption/#sthash.50wXabST.dpuf";

						String iValue = "{{Consistency Features\n" + "|Database=Cassandra\n"
								+ "|Object-Level isolation on updates=supported\n"
								+ "|Const Object Isolation URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_about_transactions_c.html\n"
								+ "|ACID transactions in single database=lightweight transactions (e.g. compare and set)\n"
								+ "|Const ACID Trans URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_ltwt_transaction_c.html\n"
								+ "|Distributed ACID transactions=not supported\n"
								+ "|Const Distributed Trans URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_about_transactions_c.html\n"
								+ "|Updates applied to transaction log before returning from write=supported\n"
								+ "|Const Log Writes URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_write_path_c.html\n"
								+ "|Specify Quorum Reads/Writes=in the client\n"
								+ "|Const Quorum URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_config_consistency_c.html\n"
								+ "|Specify number of replicas to write to=specified in the client\n"
								+ "|Const Replica Write URL=http://www.datastax.com/docs/1.1/dml/data_consistency\n"
								+ "|Behaviour when write cannot complete on specified number of replicas=hinted handoffs: writes are applied later when a replica recovers\n"
								+ "|Const Write Replica Fail URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_about_hh_c.html\n"
								+ "|Writes configured to never fail=supported\n"
								+ "|Const Write Never Fail URL=http://www.datastax.com/documentation/cassandra/2.1/cassandra/dml/dml_config_consistency_c.html\n"
								+ "|Specify number of replicas to read from=specified in the client\n"
								+ "|Const Replica Read URL=http://www.datastax.com/docs/1.1/dml/data_consistency\n"
								+ "|Read from replica master only=not applicable - peer to peer\n"
								+ "|Object level timestamps to detect conflicts=supported\n"
								+ "|Const Timestamps URL=http://www.datastax.com/dev/blog/why-cassandra-doesnt-need-vector-clocks\n"
								+ "|Efficient protocol to rapidly propagate updates across replicas (minimize inconsistency window)=fixed\n"
								+ "|Const Protocol URL=http://www.datastax.com/documentation/cassandra/2.0/cassandra/architecture/architectureGossipAbout_c.html\n"
								+ "}}\n"
								+ "Cassandra always writes to all replicas of the partition key, even replicas in other data centers. The consistency level determines only the number of replicas that need to acknowledge the write success to the client application. Typically, a client specifies a consistency level that is less than the replication factor specified by the keyspace. This practice ensures that the coordinating server node reports the write successful even if some replicas are down or otherwise not responsive to the write.\n"
								+ "\n"
								+ "Consistency levels in Cassandra can be configured to manage availability versus data accuracy. You can configure consistency on a cluster, data center, or individual I/O operation basis. Consistency among participating nodes can be set globally and also controlled on a per-operation basis (for example insert or update) using Cassandra’s drivers and client libraries.\n"
								+ "\n"
								+ "If it is an absolute requirement that a write never fail, you may also consider a write consistency level of ANY. Note that if all replica nodes are down at write time, an ANY write will not be readable until the replica nodes for that row key have recovered.\n"
								+ "\n"
								+ "Cassandra addresses the problem that vector clocks were designed to solve by breaking up documents/objects/rows into units of data that can be updated and merged independently. This allows Cassandra to offer improved performance and simpler application design.";


						parseStringToArray(iValue);

				}

		public static String[][] parseStringToArray(String input){
				String[] charactersRemoved = removeNewLine(toArray(input));

//				for(int i=0; i<charactersRemoved.length; i++){
//						System.out.println(charactersRemoved[i]);
//				}

				String[][] matrix = to2DArray(charactersRemoved);

				for(int i=0; i<charactersRemoved.length; i++){
						System.out.println("row " + i + " is " + matrix[i][0] + " | " + matrix[i][1]);
				}

				return matrix;
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

//		public static String[] insertColons(String[] input){
//				String[] returnValue = new String[input.length];
//				returnValue[0] = input[0];
//
//				for(int i=1; i<input.length; i++){
//						returnValue[i] = input[i].replace("=", ":");
//				}
//
//				return returnValue;
//		}

}

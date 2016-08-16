/**
 * Created by andrewdickens on 8/6/16.
 */

function loadAdminHeatMapData(){

    var AccumuloAdminRankings = loadHeatMapRankings('accumulo', 'admin');
    var CassandraAdminRankings = loadHeatMapRankings('cassandra', 'admin');
    var HBaseAdminRankings = loadHeatMapRankings('hbase', 'admin');
    var MongoAdminRankings = loadHeatMapRankings('mongo', 'admin');
    var CouchAdminRankings = loadHeatMapRankings('couch', 'admin');
    var CouchbaseAdminRankings = loadHeatMapRankings('couchbase', 'admin');
    var OrientAdminRankings = loadHeatMapRankings('orient', 'admin');
    var NeoAdminRankings = loadHeatMapRankings('orient', 'admin');
    var RedisAdminRankings = loadHeatMapRankings('redis', 'admin');
    var RiakAdminRankings = loadHeatMapRankings('riak', 'admin');
    var DynamoAdminRankings = loadHeatMapRankings('dynamo', 'admin');
    var OracleAdminRankings = loadHeatMapRankings('oracle', 'admin');
    var FoundationAdminRankings = loadHeatMapRankings('foundation', 'admin');
    var VoltAdminRankings = loadHeatMapRankings('volt', 'admin');



    var data = {
        labels: ['Configuration Files',
            'Node command line access',
            'Node add/remove',
            'Cluster monitoring',
            'Dump database configuration',
            'Database object count',
            'Physical storage usage'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloAdminRankings
            },
            {
                label: 'Cassandra',
                data: CassandraAdminRankings
            },
            {
                label: 'hBase',
                data: HBaseAdminRankings
            },
            {
                label: 'MongoDB',
                data: MongoAdminRankings
            },
            {
                label: 'CouchDB',
                data: CouchAdminRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseAdminRankings
            },
            {
                label: 'OrientDB',
                data: OrientAdminRankings
            },
            {
                label: 'Neo4j',
                data: NeoAdminRankings
            },
            {
                label: 'Redis',
                data: RedisAdminRankings
            },
            {
                label: 'Riak',
                data: RiakAdminRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoAdminRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleAdminRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationAdminRankings
            },
            {
                label: 'VoltDB',
                data: VoltAdminRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadConsistencyHeatMapData(){

    var AccumuloConsistencyRankings = loadHeatMapRankings('accumulo', 'consistency');
    var CassandraConsistencyRankings = loadHeatMapRankings('cassandra', 'consistency');
    var HBaseConsistencyRankings = loadHeatMapRankings('hbase', 'consistency');
    var MongoConsistencyRankings = loadHeatMapRankings('mongo', 'consistency');
    var CouchConsistencyRankings = loadHeatMapRankings('couch', 'consistency');
    var CouchbaseConsistencyRankings = loadHeatMapRankings('couchbase', 'consistency');
    var OrientConsistencyRankings = loadHeatMapRankings('orient', 'consistency');
    var NeoConsistencyRankings = loadHeatMapRankings('orient', 'consistency');
    var RedisConsistencyRankings = loadHeatMapRankings('redis', 'consistency');
    var RiakConsistencyRankings = loadHeatMapRankings('riak', 'consistency');
    var DynamoConsistencyRankings = loadHeatMapRankings('dynamo', 'consistency');
    var OracleConsistencyRankings = loadHeatMapRankings('oracle', 'consistency');
    var FoundationConsistencyRankings = loadHeatMapRankings('foundation', 'consistency');
    var VoltConsistencyRankings = loadHeatMapRankings('volt', 'consistency');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloConsistencyRankings
            },
            {
                label: 'Cassandra',
                data: CassandraConsistencyRankings
            },
            {
                label: 'hBase',
                data: HBaseConsistencyRankings
            },
            {
                label: 'MongoDB',
                data: MongoConsistencyRankings
            },
            {
                label: 'CouchDB',
                data: CouchConsistencyRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseConsistencyRankings
            },
            {
                label: 'OrientDB',
                data: OrientConsistencyRankings
            },
            {
                label: 'Neo4j',
                data: NeoConsistencyRankings
            },
            {
                label: 'Redis',
                data: RedisConsistencyRankings
            },
            {
                label: 'Riak',
                data: RiakConsistencyRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoConsistencyRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleConsistencyRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationConsistencyRankings
            },
            {
                label: 'VoltDB',
                data: VoltConsistencyRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadDistributionHeatMapData(){

    var AccumuloDistributionRankings = loadHeatMapRankings('accumulo', 'distribution');
    var CassandraDistributionRankings = loadHeatMapRankings('cassandra', 'distribution');
    var HBaseDistributionRankings = loadHeatMapRankings('hbase', 'distribution');
    var MongoDistributionRankings = loadHeatMapRankings('mongo', 'distribution');
    var CouchDistributionRankings = loadHeatMapRankings('couch', 'distribution');
    var CouchbaseDistributionRankings = loadHeatMapRankings('couchbase', 'distribution');
    var OrientDistributionRankings = loadHeatMapRankings('orient', 'distribution');
    var NeoDistributionRankings = loadHeatMapRankings('orient', 'distribution');
    var RedisDistributionRankings = loadHeatMapRankings('redis', 'distribution');
    var RiakDistributionRankings = loadHeatMapRankings('riak', 'distribution');
    var DynamoDistributionRankings = loadHeatMapRankings('dynamo', 'distribution');
    var OracleDistributionRankings = loadHeatMapRankings('oracle', 'distribution');
    var FoundationDistributionRankings = loadHeatMapRankings('foundation', 'distribution');
    var VoltDistributionRankings = loadHeatMapRankings('volt', 'distribution');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloDistributionRankings
            },
            {
                label: 'Cassandra',
                data: CassandraDistributionRankings
            },
            {
                label: 'hBase',
                data: HBaseDistributionRankings
            },
            {
                label: 'MongoDB',
                data: MongoDistributionRankings
            },
            {
                label: 'CouchDB',
                data: CouchDistributionRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseDistributionRankings
            },
            {
                label: 'OrientDB',
                data: OrientDistributionRankings
            },
            {
                label: 'Neo4j',
                data: NeoDistributionRankings
            },
            {
                label: 'Redis',
                data: RedisDistributionRankings
            },
            {
                label: 'Riak',
                data: RiakDistributionRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoDistributionRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleDistributionRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationDistributionRankings
            },
            {
                label: 'VoltDB',
                data: VoltDistributionRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadModelHeatMapData(){

    var AccumuloModelRankings = loadHeatMapRankings('accumulo', 'model');
    var CassandraModelRankings = loadHeatMapRankings('cassandra', 'model');
    var HBaseModelRankings = loadHeatMapRankings('hbase', 'model');
    var MongoModelRankings = loadHeatMapRankings('mongo', 'model');
    var CouchModelRankings = loadHeatMapRankings('couch', 'model');
    var CouchbaseModelRankings = loadHeatMapRankings('couchbase', 'model');
    var OrientModelRankings = loadHeatMapRankings('orient', 'model');
    var NeoModelRankings = loadHeatMapRankings('orient', 'model');
    var RedisModelRankings = loadHeatMapRankings('redis', 'model');
    var RiakModelRankings = loadHeatMapRankings('riak', 'model');
    var DynamoModelRankings = loadHeatMapRankings('dynamo', 'model');
    var OracleModelRankings = loadHeatMapRankings('oracle', 'model');
    var FoundationModelRankings = loadHeatMapRankings('foundation', 'model');
    var VoltModelRankings = loadHeatMapRankings('volt', 'model');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloModelRankings
            },
            {
                label: 'Cassandra',
                data: CassandraModelRankings
            },
            {
                label: 'hBase',
                data: HBaseModelRankings
            },
            {
                label: 'MongoDB',
                data: MongoModelRankings
            },
            {
                label: 'CouchDB',
                data: CouchModelRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseModelRankings
            },
            {
                label: 'OrientDB',
                data: OrientModelRankings
            },
            {
                label: 'Neo4j',
                data: NeoModelRankings
            },
            {
                label: 'Redis',
                data: RedisModelRankings
            },
            {
                label: 'Riak',
                data: RiakModelRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoModelRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleModelRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationModelRankings
            },
            {
                label: 'VoltDB',
                data: VoltModelRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadSecurityHeatMapData(){

    var AccumuloSecurityRankings = loadHeatMapRankings('accumulo', 'security');
    var CassandraSecurityRankings = loadHeatMapRankings('cassandra', 'security');
    var HBaseSecurityRankings = loadHeatMapRankings('hbase', 'security');
    var MongoSecurityRankings = loadHeatMapRankings('mongo', 'security');
    var CouchSecurityRankings = loadHeatMapRankings('couch', 'security');
    var CouchbaseSecurityRankings = loadHeatMapRankings('couchbase', 'security');
    var OrientSecurityRankings = loadHeatMapRankings('orient', 'security');
    var NeoSecurityRankings = loadHeatMapRankings('orient', 'security');
    var RedisSecurityRankings = loadHeatMapRankings('redis', 'security');
    var RiakSecurityRankings = loadHeatMapRankings('riak', 'security');
    var DynamoSecurityRankings = loadHeatMapRankings('dynamo', 'security');
    var OracleSecurityRankings = loadHeatMapRankings('oracle', 'security');
    var FoundationSecurityRankings = loadHeatMapRankings('foundation', 'security');
    var VoltSecurityRankings = loadHeatMapRankings('volt', 'security');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloSecurityRankings
            },
            {
                label: 'Cassandra',
                data: CassandraSecurityRankings
            },
            {
                label: 'hBase',
                data: HBaseSecurityRankings
            },
            {
                label: 'MongoDB',
                data: MongoSecurityRankings
            },
            {
                label: 'CouchDB',
                data: CouchSecurityRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseSecurityRankings
            },
            {
                label: 'OrientDB',
                data: OrientSecurityRankings
            },
            {
                label: 'Neo4j',
                data: NeoSecurityRankings
            },
            {
                label: 'Redis',
                data: RedisSecurityRankings
            },
            {
                label: 'Riak',
                data: RiakSecurityRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoSecurityRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleSecurityRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationSecurityRankings
            },
            {
                label: 'VoltDB',
                data: VoltSecurityRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadScalabilityHeatMapData(){

    var AccumuloScalabilityRankings = loadHeatMapRankings('accumulo', 'scalability');
    var CassandraScalabilityRankings = loadHeatMapRankings('cassandra', 'scalability');
    var HBaseScalabilityRankings = loadHeatMapRankings('hbase', 'scalability');
    var MongoScalabilityRankings = loadHeatMapRankings('mongo', 'scalability');
    var CouchScalabilityRankings = loadHeatMapRankings('couch', 'scalability');
    var CouchbaseScalabilityRankings = loadHeatMapRankings('couchbase', 'scalability');
    var OrientScalabilityRankings = loadHeatMapRankings('orient', 'scalability');
    var NeoScalabilityRankings = loadHeatMapRankings('orient', 'scalability');
    var RedisScalabilityRankings = loadHeatMapRankings('redis', 'scalability');
    var RiakScalabilityRankings = loadHeatMapRankings('riak', 'scalability');
    var DynamoScalabilityRankings = loadHeatMapRankings('dynamo', 'scalability');
    var OracleScalabilityRankings = loadHeatMapRankings('oracle', 'scalability');
    var FoundationScalabilityRankings = loadHeatMapRankings('foundation', 'scalability');
    var VoltScalabilityRankings = loadHeatMapRankings('volt', 'scalability');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloScalabilityRankings
            },
            {
                label: 'Cassandra',
                data: CassandraScalabilityRankings
            },
            {
                label: 'hBase',
                data: HBaseScalabilityRankings
            },
            {
                label: 'MongoDB',
                data: MongoScalabilityRankings
            },
            {
                label: 'CouchDB',
                data: CouchScalabilityRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseScalabilityRankings
            },
            {
                label: 'OrientDB',
                data: OrientScalabilityRankings
            },
            {
                label: 'Neo4j',
                data: NeoScalabilityRankings
            },
            {
                label: 'Redis',
                data: RedisScalabilityRankings
            },
            {
                label: 'Riak',
                data: RiakScalabilityRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoScalabilityRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleScalabilityRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationScalabilityRankings
            },
            {
                label: 'VoltDB',
                data: VoltScalabilityRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadReplicationHeatMapData(){

    var AccumuloReplicationRankings = loadHeatMapRankings('accumulo', 'replication');
    var CassandraReplicationRankings = loadHeatMapRankings('cassandra', 'replication');
    var HBaseReplicationRankings = loadHeatMapRankings('hbase', 'replication');
    var MongoReplicationRankings = loadHeatMapRankings('mongo', 'replication');
    var CouchReplicationRankings = loadHeatMapRankings('couch', 'replication');
    var CouchbaseReplicationRankings = loadHeatMapRankings('couchbase', 'replication');
    var OrientReplicationRankings = loadHeatMapRankings('orient', 'replication');
    var NeoReplicationRankings = loadHeatMapRankings('orient', 'replication');
    var RedisReplicationRankings = loadHeatMapRankings('redis', 'replication');
    var RiakReplicationRankings = loadHeatMapRankings('riak', 'replication');
    var DynamoReplicationRankings = loadHeatMapRankings('dynamo', 'replication');
    var OracleReplicationRankings = loadHeatMapRankings('oracle', 'replication');
    var FoundationReplicationRankings = loadHeatMapRankings('foundation', 'replication');
    var VoltReplicationRankings = loadHeatMapRankings('volt', 'replication');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloReplicationRankings
            },
            {
                label: 'Cassandra',
                data: CassandraReplicationRankings
            },
            {
                label: 'hBase',
                data: HBaseReplicationRankings
            },
            {
                label: 'MongoDB',
                data: MongoReplicationRankings
            },
            {
                label: 'CouchDB',
                data: CouchReplicationRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseReplicationRankings
            },
            {
                label: 'OrientDB',
                data: OrientReplicationRankings
            },
            {
                label: 'Neo4j',
                data: NeoReplicationRankings
            },
            {
                label: 'Redis',
                data: RedisReplicationRankings
            },
            {
                label: 'Riak',
                data: RiakReplicationRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoReplicationRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleReplicationRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationReplicationRankings
            },
            {
                label: 'VoltDB',
                data: VoltReplicationRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadLanguagesHeatMapData(){

    var AccumuloLanguagesRankings = loadHeatMapRankings('accumulo', 'language');
    var CassandraLanguagesRankings = loadHeatMapRankings('cassandra', 'language');
    var HBaseLanguagesRankings = loadHeatMapRankings('hbase', 'language');
    var MongoLanguagesRankings = loadHeatMapRankings('mongo', 'language');
    var CouchLanguagesRankings = loadHeatMapRankings('couch', 'language');
    var CouchbaseLanguagesRankings = loadHeatMapRankings('couchbase', 'language');
    var OrientLanguagesRankings = loadHeatMapRankings('orient', 'language');
    var NeoLanguagesRankings = loadHeatMapRankings('orient', 'language');
    var RedisLanguagesRankings = loadHeatMapRankings('redis', 'language');
    var RiakLanguagesRankings = loadHeatMapRankings('riak', 'language');
    var DynamoLanguagesRankings = loadHeatMapRankings('dynamo', 'language');
    var OracleLanguagesRankings = loadHeatMapRankings('oracle', 'language');
    var FoundationLanguagesRankings = loadHeatMapRankings('foundation', 'language');
    var VoltLanguagesRankings = loadHeatMapRankings('volt', 'language');

    var data = {
        labels: ['ACID transactions',
            'Distributed ACID',
            'Number of Replicas',
            'Write configured',
            'Read replica',
            'Constant timestamps',
            'Efficient protocol'],
        datasets: [
            {
                label: 'Accumulo',
                data: AccumuloLanguagesRankings
            },
            {
                label: 'Cassandra',
                data: CassandraLanguagesRankings
            },
            {
                label: 'hBase',
                data: HBaseLanguagesRankings
            },
            {
                label: 'MongoDB',
                data: MongoLanguagesRankings
            },
            {
                label: 'CouchDB',
                data: CouchLanguagesRankings
            },
            {
                label: 'Couchbase',
                data: CouchbaseLanguagesRankings
            },
            {
                label: 'OrientDB',
                data: OrientLanguagesRankings
            },
            {
                label: 'Neo4j',
                data: NeoLanguagesRankings
            },
            {
                label: 'Redis',
                data: RedisLanguagesRankings
            },
            {
                label: 'Riak',
                data: RiakLanguagesRankings
            },
            {
                label: 'DynamoDB',
                data: DynamoLanguagesRankings
            },
            {
                label: 'Oracle NoSQL',
                data: OracleLanguagesRankings
            },
            {
                label: 'FoundationDB',
                data: FoundationLanguagesRankings
            },
            {
                label: 'VoltDB',
                data: VoltLanguagesRankings
            }

//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function reloadHeatmapData(data){
    var data = {
        labels: ['test', 'test', 'test'],
        datasets: [
            {
                label: 'Accumulo',
                data: [8, 6, 5]
            }
//                            {
//                                label: 'Cassandra',
//                                data: [6, 8, 5, 6, 5, 5, 7]
//                            },
//                            {
//                                label: 'HBase',
//                                data: [8, 5, 6, 4, 2, 2, 3]
//                            },
//                            {
//                                label: 'MongoDB',
//                                data: [4, 0, 7, 4, 6, 3, 2]
//                            },
//                            {
//                                label: 'CouchDB',
//                                data: [1, 0, 0, 7, 0, 4, 1]
//                            }
        ]
    };

    var options = {
        backgroundColor: '#fff',
        rounded: true,
        colorInterpolation: "gradient",
        colorHighlight: true
    };

    var ctx = document.getElementById('heatmap').getContext('2d');
    var newChart = new Chart(ctx).HeatMap(data, options);
}

function loadHeatMapRankings(databaseName, featureType) {
    var json;
    var returnData2 = [];

    console.log("http://localhost:8080/rest/database/chart/get/ranking/" + databaseName + "/"+featureType);

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/rest/database/chart/get/ranking/" + databaseName + "/"+featureType,
        async: false,
        dataType: "json",
        success: function (data) {
            console.log("in success callback data");
            returnData2 = data.rankings;
        }
    });

    console.log(returnData2);
    return returnData2;
}

////function loadCassandraInformation() {
////    var json;
////    console.log("http://localhost:8080/rest/database/info/get/cassandra");
////
////    $.ajax({
////        type: "GET",
////        url: "http://localhost:8080/rest/database/info/get/cassandra",
////        async: false,
////        dataType: "json",
////        success: function (data) {
////            console.log("in success callback");
////            json = data;
////        }
////    });
////
////    console.log(json.description);
////    console.log(json);
////    document.getElementById("demo").innerHTML = json.description;
////}
//
//function loadDatabaseAdminInformation(databaseName, featureType) {
//    var json;
//    console.log("http://localhost:8080/rest/database/info/get/" + databaseName + "/" + featureType);
//
//    $.ajax({
//        type: "GET",
//        url: "http://localhost:8080/rest/database/info/get/" + databaseName + "/" + featureType,
//        async: false,
//        dataType: "json",
//        success: function (data) {
//            console.log("in success callback");
//            json = data;
//        }
//    });
//    document.getElementById("placement1").innerHTML = json.databaseName + " Database";
//    document.getElementById("placement2").innerHTML = "Feature Type: " + json.featureType;
//    document.getElementById("placement3").innerHTML = "Configuration File Support: " + json.configurationFiles;
//    document.getElementById("placement4").innerHTML = "Command Line Access: " + json.NodeCommandLineAccess;
//    document.getElementById("placement5").innerHTML = "Node Add/Removal: " + json.nodeAddRemove;
//    document.getElementById("placement6").innerHTML = "Cluster Monitoring: " + json.clusterMonitoring;
//    document.getElementById("placement7").innerHTML = "Dump Database Configuration: " + json.dumpDatabaseConfiguration;
//    document.getElementById("placement8").innerHTML = "Data Object Count: " + json.databaseObjectCount;
//    document.getElementById("placement9").innerHTML = "Physical Storage Usage: " + json.physicalStorageUsage;
//}
//
//function loadDatabaseDistributionInformation(databaseName, featureType) {
//    var json;
//    console.log("http://localhost:8080/rest/database/info/get/" + databaseName + "/" + featureType);
//
//    $.ajax({
//        type: "GET",
//        url: "http://localhost:8080/rest/database/info/get/" + databaseName + "/" + featureType,
//        async: false,
//        dataType: "json",
//        success: function (data) {
//            console.log("in success callback");
//            json = data;
//        }
//    });
//    document.getElementById("placement1").innerHTML = json.databaseName + " Database";
//    document.getElementById("placement2").innerHTML = "Configuration Files: " + json.configurationFiles;
//    document.getElementById("placement3").innerHTML = "Command Line Access: " + json.NodeCommandLineAccess;
//    document.getElementById("placement4").innerHTML = "Node Add/Removal: " + json.nodeAddRemove;
//    document.getElementById("placement5").innerHTML = "Cluster Monitoring: " + json.clusterMonitoring;
//    document.getElementById("placement6").innerHTML = "Dump Database Configuration: " + json.dumpDatabaseConfiguration;
//    document.getElementById("placement7").innerHTML = "Data Object Count: " + json.databaseObjectCount;
//    document.getElementById("placement8").innerHTML = "Physical Storage Usage: " + json.physicalStorageUsage;
//    document.getElementById("placement9").innerHTML = "Admin Storage Size URL: " + json.adminStorageSizeURL;
//}
//
////function loadAccumuloInformation(input) {
////    var json;
////    console.log("http://localhost:8080/rest/database/info/get/accumulo/" + input);
////
////    $.ajax({
////        type: "GET",
////        url: "http://localhost:8080/rest/database/info/get/accumulo/" + input,
////        async: false,
////        dataType: "json",
////        success: function (data) {
////            console.log("in success callback");
////            json = data;
////        }
////    });
////    document.getElementById("placement1").innerHTML = "Accumulo Database:";
////    document.getElementById("placement2").innerHTML = "Feature Type: " + json.featureType;
////    document.getElementById("placement3").innerHTML = "Configuration File Support: " + json.configurationFiles;
////    document.getElementById("placement4").innerHTML = "Command Line Access: " + json.NodeCommandLineAccess;
////    document.getElementById("placement5").innerHTML = "Node Add/Removal: " + json.nodeAddRemove;
////    document.getElementById("placement6").innerHTML = "Cluster Monitoring: " + json.clusterMonitoring;
////    document.getElementById("placement7").innerHTML = "Dump Database Configuration: " + json.dumpDatabaseConfiguration;
////    document.getElementById("placement8").innerHTML = "Data Object Count: " + json.databaseObjectCount;
////    document.getElementById("placement9").innerHTML = "Physical Storage Usage : " + json.physicalStorageUsage;
////}
//
//

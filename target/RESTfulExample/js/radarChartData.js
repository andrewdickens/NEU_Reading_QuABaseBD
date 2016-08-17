function loadChartLabels(database, feature) {
    var json;
    var returnData2 = [];

    console.log(database);
    console.log(feature);

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/rest/database/info/get/" + database + "/" + feature,
        async: false,
        dataType: "json",
        success: function (data) {
            console.log("in success callback | loadChartLabels");
            json = data;
            console.log(json);
        }
    });

    if (feature == "admin") {
        returnData2[0] = "Physical Storage Usage";
        returnData2[1] = "Configuration File Support";
        returnData2[2] = "Command Line Access";
        returnData2[3] = "Node Add/Removal";
        returnData2[4] = "Cluster Monitoring";
        returnData2[5] = "Dump Database Configuration";
        returnData2[6] = "Data Object Count";
    } else if (feature == "consistency") {

        returnData2[0] = "Object Level Isolation";
        returnData2[1] = "ACID Transactions";
        returnData2[2] = "Behavior on failed replica";
        returnData2[3] ="";
        returnData2[4] ="";
        returnData2[5] ="";
        returnData2[6] ="";
    } else if (feature == "data_distribution") {

        returnData2[0] = "Architecture";
        returnData2[1] = "Distribution Method";
        returnData2[2] = "Rebalancing";
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    } else if (feature == "data_model") {

        returnData2[0] = "Enforced Schema"
        returnData2[1] = "Opaque Data Objects"
        returnData2[2] = "Composite Keys"
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    } else if (feature == "query") {

        returnData2[0] = "API Based";
        returnData2[1] = "Declaritive";
        returnData2[2] = "CursorBasedQuery";
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    } else if (feature == "data_replication") {

        returnData2[0] = "Architecture";
        returnData2[1] = "Replication for backup";
        returnData2[2] = "Replica reads";
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    } else if (feature == "security") {

        returnData2[0] = "Client Authentication";
        returnData2[1] = "Server Authentication";
        returnData2[2] = "Role-based Security";
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    } else if (feature == "scalability") {

        returnData2[0] = "Scale Out Architecture";
        returnData2[1] = "Scale Data Capacity";
        returnData2[2] = "Data Objects based on Locks";
        returnData2[3] = "";
        returnData2[4] = "";
        returnData2[5] = "";
        returnData2[6] = "";
    }

    return returnData2;
}


function loadRadarData(feature, databaseName) {
    console.log('feature type is ' + feature + ' in legacy call');
    console.log('feature type is ' + databaseName + ' in legacy call');
    var radarLabels = loadChartLabels(databaseName, feature);
    var accumuloValues = loadRadarChartData(databaseName, feature);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: radarLabels,
            datasets: [
                {
                    label: databaseName,
                    data: accumuloValues,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,120,120,1)",
                    pointBackgroundColor: "rgba(220,120,120,1)",
                    pointBorderColor: "rgba(220,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
//                                            borderWidth: 1
                }
            ]
        },
        options: {
//                                    legendCallback: function(myChart){},
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

function loadRadarDataObject(dataObject) {
    if (dataObject.numDatabases == 1) {
        return loadRadarDataObjectOne(dataObject);
    } else if (dataObject.numDatabases == 2) {
        return loadRadarDataObjectTwo(dataObject);
    } else if (dataObject.numDatabases == 3) {
        return loadRadarDataObjectThree(dataObject)
    } else if (dataObject.numDatabases > 3) {
        alert('Please choose no more than 3 databases');
    }
}

function loadRadarDataObjectOne(dataObject) {
    console.log(dataObject);
    console.log('feature type is ' + dataObject.featureType);
    console.log('database is ' + dataObject.databases[0]);
    var databaseName = dataObject.databases[0];
    var radarLabels = loadChartLabels(dataObject.databases[0], dataObject.featureType);
    var accumuloValues = loadRadarChartData(dataObject.databases[0], dataObject.featureType);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: radarLabels,
            datasets: [
                {
                    label: databaseName,
                    data: accumuloValues,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,120,120,1)",
                    pointBackgroundColor: "rgba(220,120,120,1)",
                    pointBorderColor: "rgba(220,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
//                                            borderWidth: 1
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

function loadRadarDataObjectTwo(dataObject) {
    var databaseName1 = dataObject.databases[0];
    var databaseName2 = dataObject.databases[1];
    var radarLabels1 = loadChartLabels(dataObject.databases[0], dataObject.featureType);
    var accumuloValues1 = loadRadarChartData(dataObject.databases[0], dataObject.featureType);
    var accumuloValues2 = loadRadarChartData(dataObject.databases[1], dataObject.featureType);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: radarLabels1,
            datasets: [
                {
                    label: databaseName1,
                    data: accumuloValues1,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,120,120,1)",
                    pointBackgroundColor: "rgba(220,120,120,1)",
                    pointBorderColor: "rgba(220,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
                },
                {
                    label: databaseName2,
                    data: accumuloValues2,
                    backgroundColor: "rgba(150,165,65,0.0)",
                    borderColor: "rgba(150,120,120,1)",
                    pointBackgroundColor: "rgba(150,120,120,1)",
                    pointBorderColor: "rgba(150,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

function loadRadarDataObjectThree(dataObject) {
    var databaseName1 = dataObject.databases[0];
    var databaseName2 = dataObject.databases[1];
    var databaseName3 = dataObject.databases[2];
    var radarLabels1 = loadChartLabels(dataObject.databases[0], dataObject.featureType);
    var accumuloValues1 = loadRadarChartData(dataObject.databases[0], dataObject.featureType);
    var accumuloValues2 = loadRadarChartData(dataObject.databases[1], dataObject.featureType);
    var accumuloValues3 = loadRadarChartData(dataObject.databases[1], dataObject.featureType);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: radarLabels1,
            datasets: [
                {
                    label: databaseName1,
                    data: accumuloValues1,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,120,120,1)",
                    pointBackgroundColor: "rgba(220,120,120,1)",
                    pointBorderColor: "rgba(220,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
                },
                {
                    label: databaseName2,
                    data: accumuloValues2,
                    backgroundColor: "rgba(150,165,65,0.0)",
                    borderColor: "rgba(150,120,120,1)",
                    pointBackgroundColor: "rgba(150,120,120,1)",
                    pointBorderColor: "rgba(150,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
                },
                {
                    label: databaseName3,
                    data: accumuloValues3,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,120,120,1)",
                    pointBackgroundColor: "rgba(220,120,120,1)",
                    pointBorderColor: "rgba(220,120,120,1)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(179,181,198,1)"
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}


function loadRadarDataObject2(dataObject) {
    //console.log('in lrdo2');
    //console.log(dataObject.numberOfDatabases);

    if (dataObject.numberOfDatabases == 1) {
        return loadRadarDataObjectOne2(dataObject);
    } else if (dataObject.numberOfDatabases == 2) {
        return loadRadarDataObjectTwo2(dataObject);
    } else if (dataObject.numberOfDatabases == 3) {
        return loadRadarDataObjectThree2(dataObject)
    } else if (dataObject.numberOfDatabases > 3) {
        alert('Please choose no more than 3 databases');
    }
}

function loadRadarDataObjectOne2(dataObject) {
    console.log(dataObject);
    console.log('feature type is ' + dataObject.features[0]);
    console.log('database is ' + dataObject.databases[0]);
    var databaseName = dataObject.databases[0];
    //var radarLabels = loadChartLabels(dataObject.databases[0], dataObject.features[0]);
    var accumuloValues = loadRadarChartData2(dataObject, 0);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: dataObject.features,
            datasets: [
                {
                    label: capitalizeFirstLetter(databaseName),
                    data: accumuloValues,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,65,65,.7)",
                    pointBackgroundColor: "rgba(220,65,65,.7)",
                    pointBorderColor: "rgba(220,65,65,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(220,65,65,.7)"
//                                            borderWidth: 1
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

function loadRadarDataObjectTwo2(dataObject) {
    var databaseName1 = dataObject.databases[0];
    var databaseName2 = dataObject.databases[1];
    //var radarLabels1 = loadChartLabels(dataObject.databases[0], dataObject.featureType);
    var accumuloValues1 = loadRadarChartData2(dataObject, 0);
    var accumuloValues2 = loadRadarChartData2(dataObject, 1);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: dataObject.features,
            datasets: [
                {
                    label: capitalizeFirstLetter(databaseName1),
                    data: accumuloValues1,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,65,65,.7)",
                    pointBackgroundColor: "rgba(220,65,65,.7)",
                    pointBorderColor: "rgba(220,65,65,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(220,65,65,.7)"
                },
                {
                    label: capitalizeFirstLetter(databaseName2),
                    data: accumuloValues2,
                    backgroundColor: "rgba(63, 191, 127,0.0)",
                    borderColor: "rgba(63, 191, 127,.7)",
                    pointBackgroundColor: "rgba(63, 191, 127,.7)",
                    pointBorderColor: "rgba(63, 191, 127,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(63, 191, 127,.7)"
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

function loadRadarDataObjectThree2(dataObject) {
    var databaseName1 = dataObject.databases[0];
    var databaseName2 = dataObject.databases[1];
    var databaseName3 = dataObject.databases[2];
    //var radarLabels1 = loadChartLabels(dataObject.databases[0], dataObject.featureType);
    var accumuloValues1 = loadRadarChartData2(dataObject, 0);
    var accumuloValues2 = loadRadarChartData2(dataObject, 1);
    var accumuloValues3 = loadRadarChartData2(dataObject, 2);

    var ctx = document.getElementById("radarChart");
    var myChart = new Chart(ctx, {
        type: 'radar',
        data: {
            labels: dataObject.features,
            datasets: [
                {
                    label: capitalizeFirstLetter(databaseName1),
                    data: accumuloValues1,
                    backgroundColor: "rgba(220,65,65,0.0)",
                    borderColor: "rgba(220,65,65,.7)",
                    pointBackgroundColor: "rgba(220,65,65,.7)",
                    pointBorderColor: "rgba(220,65,65,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(220,65,65,.7)"
                },
                {
                    label: capitalizeFirstLetter(databaseName2),
                    data: accumuloValues2,
                    backgroundColor: "rgba(63, 191, 127,0.0)",
                    borderColor: "rgba(63, 191, 127,.7)",
                    pointBackgroundColor: "rgba(63, 191, 127,.7)",
                    pointBorderColor: "rgba(63, 191, 127,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(63, 191, 127,.7)"
                },
                {
                    label: capitalizeFirstLetter(databaseName3),
                    data: accumuloValues3,
                    backgroundColor: "rgba(63, 127, 191,0.0)",
                    borderColor: "rgba(63, 127, 191,.7)",
                    pointBackgroundColor: "rgba(63, 127, 191,.7)",
                    pointBorderColor: "rgba(63, 127, 191,.7)",
                    pointHoverBackgroundColor: "#fff",
                    pointHoverBorderColor: "rgba(63, 127, 191,.7)"
                }
            ]
        },
        options: {
            scales: {
                ticks: {
                    beginAtZero: true
                }
            }
        }
    });
}

//function loadCassandra(feature, databaseName) {
//    console.log("in cassandra");
//    var radarLabels = loadChartLabels(databaseName, feature);
//    var cassandraValues = loadRadarChartData(databaseName, feature);
//
//    console.log(radarLabels);
//    console.log(cassandraValues);
//
//    var ctx = document.getElementById("radarChart");
//    var myChart = new Chart(ctx, {
//        type: 'radar',
//        data: {
//            labels: radarLabels,
//            datasets: [
//                {
//                    label: databaseName,
//                    data: cassandraValues,
//                    backgroundColor: "rgba(220,65,65,0.0)",
//                    borderColor: "rgba(220,120,120,1)",
//                    pointBackgroundColor: "rgba(220,120,120,1)",
//                    pointBorderColor: "rgba(220,120,120,1)",
//                    pointHoverBackgroundColor: "#fff",
//                    pointHoverBorderColor: "rgba(179,181,198,1)"
////                                            borderWidth: 1
//                }
//            ]
//        },
//        options: {
////                                    legendCallback: function(myChart){},
//            scales: {
//                ticks: {
//                    beginAtZero: true
//                }
//            }
//        }
//    });
//}

function loadRadarChartData(databaseName, featureType) {
    var json;
    var returnData = [];

    console.log("http://localhost:8080/rest/database/chart/get/ranking" + "/" + databaseName + "/" + featureType);

    $.ajax({
        type: "GET",
        url: "http://localhost:8080/rest/database/chart/get/ranking" + "/" + databaseName +"/" + featureType,
        async: false,
        dataType: "json",
        success: function (data) {
            console.log("in success callback data");
            returnData = data.rankings;

        }
    });

    console.log("value from the callback is " + returnData);

    return returnData;
}

function loadRadarChartData2(dataObject, index) {
    var json;
    var returnData = [];
    console.log("index value is " + index);
    var featureCount = dataObject.numberOfFeatures;
    var databaseCount = dataObject.numberOfDatabases;




    for(var i=0; i<featureCount; i++) {
        console.log("http://localhost:8080/rest/database/chart/get/ranking" + "/" + dataObject.databases[index] + "/" + dataObject.featureCategory + "/" + dataObject.features[i]);
        console.log(dataObject.features[i]);
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/rest/database/chart/get/ranking" + "/" + dataObject.databases[index] + "/" + dataObject.featureCategory + "/" + dataObject.features[i],
            async: false,
            dataType: "json",
            success: function (data) {
                console.log("in success callback data");
                returnData[i] = data;
            }
        });
    }

    console.log("value from the callback is " + returnData);

    return returnData;
}



function capitalizeFirstLetter(string){
    return string.charAt(0).toUpperCase() + string.slice(1);
}

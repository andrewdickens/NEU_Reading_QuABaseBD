//function loadChartData(data) {
//    var json;
//    var returnData2 = [];
//
//    console.log("http://localhost:8080/rest/database/chart/get/data"+"/"+data);
//
//    $.ajax({
//        type: "GET",
//        url: "http://localhost:8080/rest/database/chart/get/data"+"/"+data,
//        async: false,
//        dataType: "json",
//        success: function (data) {
//            console.log("in success callback data");
//            json = data;
//            console.log(json);
//            returnData2[0] = json.data1;
//            returnData2[1] = json.data2;
//            returnData2[2] = json.data3;
//            returnData2[3] = json.data4;
//            returnData2[4] = json.data5;
//            returnData2[5] = json.data6;
//            console.log(returnData2[0]);
//        }
//    });
//
//    console.log(returnData2);
//    console.log("test");
//    //console.log([55, 66, 77, 88, 99, 100]);
//    return [1, 2, 3, 4, 5];
//
//    //return returnData2;
//}

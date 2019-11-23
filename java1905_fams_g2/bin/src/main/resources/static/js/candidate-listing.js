function viewDetailResult(linkEl) {
    // var action = confirm("message");
    // if(action==true){

    // }
    // $(document).ready(function() {
    //         $("#dashBoardLink").click(function() {
    $.get({
        // url: myContextPath + "/groupInfo",
        url: "../views/viewdetail-result.html",
        success: function(response) {
            // dayTrang();
            // setTimeout(function() {
            $("#mainpage").html(response);
            // },
            // 3500);
        }
    });
    //     });
    // }
}
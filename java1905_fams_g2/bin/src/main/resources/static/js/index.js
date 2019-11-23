$(document).ready(function() {
    $("#dashBoardLink").click(function() {
        $.get({
            // url: myContextPath + "/groupInfo",
            url: "landing-page chart.html",
            success: function(response) {
                // dayTrang();
                // setTimeout(function() {
                $("#mainpage").html(response);
                // },
                // 3500);
            }
        });
    });

    $("#candidateManagementLink").click(function() {
    	alert('hello');
        $.get({
            url: "candidate-listing",
            success: function(response) {
                // dayTrang();
                // setTimeout(function() {
                $("#mainpage").html(response);
                // }, 3500);
            }
        });
    });

    $("#addCandidate").click(function() {
        $.get({
            url: "candidate-listing",
            success: function(response) {
                // dayTrang();
                // setTimeout(function() {
                $("#mainpage").html(response);
                // }, 3500);
            }
        });
    });

    $("#addCandidate").click(function() {
        $.get({
            //url: "add-candidate.html",
        	url: "add-form",
            success: function(response) {
                // dayTrang();
                // setTimeout(function() {
                $("#mainpage").html(response);
                // }, 3500);
            }
        });
    });

    $("#updateCandidate").click(function() {
        $.get({
            url: "update-candidate.html",
            success: function(response) {
                // dayTrang();
                // setTimeout(function() {
                $("#mainpage").html(response);
                // }, 3500);
            }
        });
    });
});

function dayTrang() {
    $("#mainpage").html("<h3>Loading.. 0 %<h3>");
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ 17 %<h3>");
    }, 500);
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ ▃ 33 %<h3>");
    }, 1000);
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ ▃ ▄ 49 %<h3>");
    }, 1500);
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ ▃ ▄ ▅ 65 %<h3>");
    }, 2000);
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ ▃ ▄ ▅ ▆ 81 %<h3>");
    }, 2500);
    setTimeout(function() {
        $("#mainpage").html("<h3>Loading.. ▂ ▃ ▄ ▅ ▆ █ 99 %<h3>");
    }, 3000);
}
// $(function() {
//     $('#datetimepicker1').datetimepicker();
// });

$(document).ready(function() {
    $('#other-university').hide();
    $('#other-faculty').hide();
    //$('input').css("border", "hidden");
});

$('.uni').click(function() {
    var uni = document.getElementsByName("uni");
    for (var i = 0; i < uni.length - 1; i++) {
        if (uni[i].checked) {
            document.getElementById("university").innerHTML = uni[i].value;
        }
    }
    var check = uni[uni.length - 1].checked;
    if (check == true) {
        $('#other-university').show();
        $('#other-university').change(function() {
            document.getElementById("university").innerHTML = document.getElementById("other-university").value;
        });
    } else {
        $('#other-university').hide();
    }
});

$('.fac').click(function() {
    var fac = document.getElementsByName("fac");
    for (var i = 0; i < fac.length - 1; i++) {
        if (fac[i].checked) {
            document.getElementById("faculty").innerHTML = fac[i].value;
        }
    }
    var check = fac[fac.length - 1].checked;
    if (check == true) {
        $('#other-faculty').show();
        $('#other-faculty').change(function() {
            document.getElementById("faculty").innerHTML = document.getElementById("other-faculty").value;
        });
    } else {
        $('#other-faculty').hide();
    }
});

function createAccount() {
    var name = document.getElementById("fullName").value;
    var nameArray = name.split(" ");
    var length = nameArray.length;
    var account = "";
    account = account + nameArray[length - 1];
    for (var i = 0; i < length - 1; i++) {
        account = account + nameArray[i].charAt(0);
    }
    document.getElementById("account").value = account;
}

$('#CV').change(function() {
    var i = $(this).prev('#fileName').clone();
    var file = $('#CV')[0].files[0].name;
    $(this).prev('#fileName').text(file);
});
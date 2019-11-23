jQuery.validator.addMethod("greaterThan",
    function(value, element, params) {
        // if (!/Invalid|NaN/.test(new Date(value))) {
        //     return new Date(value) > new Date($(params).val());
        // }
        // return isNaN(value) && isNaN($(params).val()) ||
        //     (Number(value) > Number($(params).val()));
        var newDate = new Date();
        var currentDate = newDate.getFullYear() + "-" + (newDate.getMonth() + 1) + "-" + newDate.getDate();
        if (value > currentDate) {
            return false;
        }
        return true;
    }, 'Must be greater than {0}.');

$(document).ready(function() {
    // var fiveDaysFromNow = new Date();
    $("#form-add-candidate").validate({
        rules: {
            applicationDate: {
                greaterThan: true
            },
            fullName: {
                required: true
            },
            dob: {
                required: true,
                greaterThan: true
            },
            email: {
                required: true,
                email: true
            },
            phone: {
                required: true,
                minlength: 10,
                maxlength: 14,
                number: true
            },
            selectChannel: {
                required: true
            }
        },
        messages: {
            fullName: {
                required: "The Full Name should not be blank"
            },
            applicationDate: {
                greaterThan: "No future date"
            },
            dob: {
                required: "The DOB should not be blank",
                greaterThan: "No future date"
            },
            email: {
                required: "The Email should not be blank",
                email: "Please input your correct email address"
            },
            phone: {
                required: "Please input phone",
                number: "Phone is number"
            },
            selectChannel: {
                required: "Please select the Channel"
            }
        },
        errorElement: 'div',
        errorLabelContainer: '.errorTxt'
    });



    // $("#form-add-candidate").submit(function() { 
    //     // alert('OOO: '+$("#form-add-candidate").valid());
    //     if(!$("#form-add-candidate").valid()){
    //         $(".error-input").css({"color": "red", "border": "2px solid red"});
    //         return false;
    //     }
    //     return true; 
    // }); 


});
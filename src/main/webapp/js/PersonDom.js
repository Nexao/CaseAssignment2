$(function (){
    
    $("#submit").on("click", function(){
        var object = new Object();
        object.name = $("PATH FOR INPUT FIELD").val();
        
        var jsonObject = JSON.stringify(object);
        var ajaxMethod = $.ajax({
            url: "URL PATH FOR HTML",
            contentType: "application/json",
            data: jsonObject,
            method: "POST"
        });
        
        ajaxMethod.done(function (data){
            console.log(data);
            "Maybe use the for loop here - See (ajaxWithJson)";
        });
        
        ajaxMethod.fail(function (jqXHR, textStatus){
            alert("Request failed: " + textStatus);
        });
    });
});
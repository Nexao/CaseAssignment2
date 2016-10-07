$(function (){
    
    $("#submit").on("click", function(){
        console.log("I was clicked");
        var object = new Object();
        object.name = $("#firstName").val();
        object.name = $("#lastName").val();
        object.name = $("#email").val();
        object.name = $("#phone").val();
        object.name = $("#street").val();
        object.name = $("#city").val();
        object.name = $("#zip").val();
        object.name = $("#additionalInfo").val();
        object.name = $("#hooby").val();
        
        var jsonObject = JSON.stringify(object);
        var ajaxMethod = $.ajax({
            url: "http://localhost:8080/CA2/api/person",
            contentType: "application/json",
            data: jsonObject,
            method: "POST"
        });
        
        ajaxMethod.done(function (data){ 
            var persons = data;
            console.log(persons);
            persons.forEach(function(person){
                $("#person").append("<li>" + ""+ "</li>");
            });
            
        });
        
        ajaxMethod.fail(function (jqXHR, textStatus){
            alert("Request failed: " + textStatus);
        });
    });
});
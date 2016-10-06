$.ready(function(){
    $('#infoButton').click(function(){
    
                var temp = $.ajax({
                    url: "api/person/getpersons",
                    type: "GET"
                });
                temp.done(function(data, textStatus){
                    $("#");
                });
            });
});

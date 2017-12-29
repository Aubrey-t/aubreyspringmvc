$(document).ready(function() {

    // once the tag is clicks
   $("#request-link").click(function(e){
       //prevent link from actually sending in a request
      e.preventDefault();
      //issue an ajax request sending in the form data
      $.post(ctx + "/resource/request", $(form).serialize(), function(data){
          //print out any response from the server
          alert(data)
     });
      return false
   });
});
<HTML>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
 <!-- ============================================================== POP UP -->
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
<!-- <link rel="stylesheet" href="/resources/demos/style.css"> -->
 <!-- ==============================================================  -->

	
  
 
<script type="text/javascript">
function test(){
	var win = window.open('employee_handbook_cp.pdf#page=10', '_blank');
	if(win){
	    //Browser has allowed it to be opened
	    win.focus();
	}else{
	    //Broswer has blocked it
	    alert('Please allow popups for this site');
	}
}
$(document).ready(function() {
   
	
		
	$("#dialog").dialog();
    
    $(".ui-dialog").attr("style","width:600px;");

});

</script>
</head>

<body>
<!-- <div><a HREF="employee_handbook_cp.pdf#page=5"> CLICK ME</a></div> -->

<div id ="dialog" style ="width:600px !important; height:600px !important">
    <object data="employee_handbook_cp.pdf#page=10" type="application/pdf" width="600" height="600" >
        alt : <a href="employee_handbook_cp.pdf#page=10">test.pdf</a>
    </object>
</div>


  <script>
  $(function() {
    $( "#dialog" ).dialog();
  });
  </script>
  
  
  <a onclick="javascript:test()" href="#"> click me</a>
</head>
</body>
</HTML>
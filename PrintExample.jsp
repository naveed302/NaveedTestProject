<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script>
    function printDiv() {
    	alert("I'm Here");
      var divToPrint = document.getElementById('printTable');
      newWin = window.open("");
      newWin.document.write(divToPrint.outerHTML);
      newWin.print();
      newWin.close();
   }
</script>
<title>Print Example</title>
</head>

<table id="printTable">
<tr><td>R1C1</td><td>R1C</td></tr>
<tr><td>R2C1</td> <td>R2C2</td></tr>
</table>
<button onclick="printDiv()"> Print</button>
<body>

</body>
</html>
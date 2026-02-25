<%@page isELIgnored="false" %>
<%@taglib  uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        body {
            font-family: Arial;
            background-color: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-box {
            background: white;
            padding: 25px;
            border-radius: 8px;
            width: 300px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
        }

        input {
            width: 100%;
            padding: 8px;
            margin: 8px 0;
        }

        button {
            width: 100%;
            padding: 8px;
            background: blue;
            color: white;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: darkblue;
        }
    </style>
</head>
<body>

<div class="form-box">
    <h2>Edit Employee Form</h2>

  
	<form:form action="edit_employee" method="post" modelAttribute="emp">

	 
	 	  <form:input path="empno" placeholder="Employee No" readonly="true"/>
	    <form:input path="ename" placeholder="Employee Name" />
	    <form:input path="esal" placeholder="Employee sal" />
	    <form:input path="job" placeholder="Employee job" />
		<form:input path="deptNo" placeholder="Employee dept no" />

	    <button type="submit">Edit Employee</button>
	    <button type="reset">Cancel Employee</button>

	</form:form>

</div>

</body>
</html>

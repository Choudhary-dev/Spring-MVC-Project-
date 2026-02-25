<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:choose>

    <c:when test="${not empty list}">
        <table border="1" align="center" bgcolor="cyan">
            <tr>
                <th>Empno</th>
                <th>Ename</th>
                <th>Esal</th>
                <th>Job</th>
                <th>Dept No</th>
            </tr>

            <c:forEach var="emps" items="${list}">
                <tr>
                    <td>${emps.empno}</td>
                    <td>${emps.ename}</td>
                    <td>${emps.esal}</td>
                    <td>${emps.job}</td>
                    <td>${emps.deptNo}</td>
					<td>
						<a href="edit_employee?no=${emps.empno}"><img src="resources/images/editpng.png">Edit</a>
												&nbsp; &nbsp;
												
				   <a href="delete_employee?no=${emps.empno}" onclick="return confirm('do you want to delete?')"><img src="resources/images/delete.png">Delete</a>
																								&nbsp; &nbsp;
																												
						
					</td>
                </tr>
            </c:forEach>

        </table>
    </c:when>

    <c:otherwise>
        <h2>Records not found</h2>
    </c:otherwise>

	  
</c:choose>

<h1>${ans}</h1>

<h1>${msg}</h1>
<h1>${msg1}</h1>

<br><br><a href="add_employee"><img src="resources/images/addstudent.png"></a>

<br><br><a href="./"><img src="resources/images/download.jpg"></a>



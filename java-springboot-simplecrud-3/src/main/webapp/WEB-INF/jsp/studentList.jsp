<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>La liste des étudiants</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Liste des étudiants!</h1>
    
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>First Name</th>
          <th>Last Name</th>
          <th>Address</th>
          <th>Email</th>
          <th>Phone</th>
        </tr>
        <c:forEach  items="${etudiants}" var ="etudiant">
        <tr>
          <td>${etudiant.firstName}</td>
          <td>${etudiant.name}</td>
          <td>${etudiant.address}</td>
          <td>${etudiant.email}</td>
          <td>${etudiant.phone}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
  
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>A Year In Pixel</title>
  </head>
  <body>
  <form:form modelAttribute="everydaySearch" method="get">
    <div>
      <table border="1">
      <tr>
        <td><c:out value="day"/></td>
        <td><c:out value="pixel"/></td>
      </tr>
      <c:forEach items="${everydaySearch.everydays}" var="list">
        <tr>
          <td><c:out value="${list.today}"/></td>
          <td id="score"><c:out value="${list.color}"/></td>
        </tr>
      </c:forEach>
      </table>
    </div>
  </form:form>
  </body>

<script type='text/javascript'>
  (() =>
    {
      'use strict';
      const score = document.getElementById('score');

     })();
</script>

</html>

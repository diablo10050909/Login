<%@ page session="true" %>
<%
  String user = (String)session.getAttribute("user");
  if(user == null) {
    response.sendRedirect("index.html");
  }
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Main</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>

<div class="box">
  <h2>환영합니다</h2>
  <p><%= user %> 님 로그인 완료</p>
  <form action="logout" method="post">
    <button>로그아웃</button>
  </form>
</div>

</body>
</html>

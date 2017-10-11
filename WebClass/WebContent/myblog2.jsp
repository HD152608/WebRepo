<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "org.dimigo.vo.UserVO"  %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>my blog</title>
<link rel="stylesheet" href="css1.css">

<script>
	function menu_over(e) {
		e.setAttribute("class", "nav-item active");
	}

	function menu_out(e) {
		e.setAttribute("class", "nav-item");
	}
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
	integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">HOME</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this);"><a class="nav-link"
					href="#1">강아지 사진 <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this);"><a class="nav-link"
					href="#2">맛있는 것</a></li>
				<li class="nav-item" onmouseover="menu_over(this);"
					onmouseout="menu_out(this);"><a class="nav-link"
					href="#3">운동</a></li>
			</ul>
			<%
    UserVO user = (UserVO)session.getAttribute("user");
    if(user == null){
    %>
       <a class="text-bold text-white" style="text-decoration: none" href="/WebClass/bloglogin">Sign in</a>
       <span class="text-bold text-white">&nbsp; or &nbsp;</span>
       <a class="text-bold text-white" style="text-decoration: none" href="#">Sign up</a>
    <% } else { %>
       <ul class="navbar-nav flex-row ml-md-auto d-none d-md-flex">
       <li class="nav-item dropdown">
         <a class="nav-item nav-link dropdown-toggle mr-md-2" href="#" id="bd-versions" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <%= user.getName() %>님
         </a>
         <div class="dropdown-menu dropdown-menu-right" aria-labelledby="bd-versions">
            <form action="/WebClass/bloglogout" method="post">
            <button type="submit" class="dropdown-item">Sign out</button>
            </form>
         </div>
       </li>
       </ul>
       <% } %>
  </div>
		</div>
	</nav>
	<div class="container">
		<h1>My Blog</h1>
		<p>김주연의 블로그입니다</p>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"
		integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
		integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
		crossorigin="anonymous"></script>
  <script>
   
    </script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link rel='stylesheet prefetch'
	href='http://fonts.googleapis.com/css?family=Open+Sans:600'>
<link href="https://fonts.googleapis.com/css?family=Lobster+Two"
	rel="stylesheet">
<link rel="stylesheet" href="css/style.css">
</head>
<body>

	<div class="login-wrap">
		<div class="login-html">
			<header>Closed Campus</header>
			<hr>
			<br /> <input id="tab-1" type="radio" name="tab" class="sign-in"
				checked><label for="tab-1" class="tab">Registration</label>
			<input id="tab-2" type="radio" name="tab" class="sign-up"><label
				for="tab-2" class="tab">Dashboard</label>

			<div class="login-form">
				<div class="sign-in-htm">

					<sf:form method="POST" modelAttribute="employee"
						commandName="employee">


						<div class="group">
							<sf:label path="mac_addr">Enter Mac Address : </sf:label>
							<sf:input path="mac_addr" />
						</div>

						<div class="group">
							<sf:label path="owner_name">Enter Owner name : </sf:label>
							<sf:input path="owner_name" />
						</div>
						<div class="group">
							<sf:label path="vehicle_no">Enter Vehicle No : </sf:label>
							<sf:input path="vehicle_no" />
						</div>
						<div class="group">
							<sf:label path="mob_no">Enter Mobile No : </sf:label>
							<sf:input path="mob_no" />
						</div>
						<div class="group">
							<input type="submit" class="button" value="Register">
						</div>

					</sf:form>
				</div>
				<div class="sign-up-htm">hi i am in dashboard</div>
			</div>


		</div>

	</div>





</body>
</html>
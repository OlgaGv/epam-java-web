<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page errorPage="error.jsp" isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<fmt:setLocale value="${locale}" scope="session"/>
<fmt:setBundle basename="properties.content"/>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css"
          integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"
            integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
            crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"
            integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ"
            crossorigin="anonymous"></script>

    <link href="/css/index.css" rel="stylesheet">
    <link href="/css/forms.css" rel="stylesheet">
</head>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<br>
<br>
<div class="container-fluid">
    <div class="panel panel-success">
        <div class="panel-heading" align="center">
            <h4>Registration</h4>
        </div>
        <div class="panel-body" align="center">
            <div class="container " style=" margin-bottom: 10%;">
                <div class="panel panel-success" style="max-width: 35%;" align="left">
                    <div class="panel-body">
                        <form name="loginForm" action="/controller?command=registration" method="post">
                            <div class="form-group">
                                <label><fmt:message key="page.name"/></label>
                                <input type="text" class="form-control" name="user-name" id="user-name-id"
                                       placeholder="User Name" required="required">
                            </div>
                            <div class="form-group">
                                <label><fmt:message key="page.surname"/></label>
                                <input type="text" class="form-control" name="user-surname" id="user-surname-id"
                                       placeholder="User Name" required="required">
                            </div>
                            <div class="form-group">
                                <label><fmt:message key="page.login"/></label>
                                <input type="text" pattern="^[a-zA-Z0-9]{2,14}" class="form-control" name="user-login" id="user-login-id"
                                       placeholder="User Name" required="required">
                            </div>
                            <div class="form-group">
                                <label><fmt:message key="page.password"/></label>
                                <input type="password" pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{4,}$" class="form-control" name="user-password" id="user-password-id"
                                       placeholder="Password" required="required">
                            </div>
                            <%--<div class="form-group">
                                <label>Role</label>
                                <select class="form-control" name="user-role" id="user-role-id">
                                    <option>USER</option>
                                    <option>ADMIN</option>
                                </select>
                            </div>--%>
                            <button type="submit" style="width: 100%;"
                                    class="btn btn-large btn-primary btn-lg btn-block"><b><fmt:message key="page.registration"/></b></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
</html>

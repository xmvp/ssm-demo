<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<form  method="post" action="/login">
    <p>  账号：<input name="id" type="text">  </p>
    <p>  密码：<input name="password" type="password">  </p>
    <p>
        <input type="submit" name="Button" value="提交"/>
        <input type="reset" name="Reset" value="重填">
    </p>
</form>
</body>
</html>
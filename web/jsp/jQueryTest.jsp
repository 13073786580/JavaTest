<%--
  Author: Edison Hou.
  Date: 2017/6/14
  Time: 22:15
  phone：17621373690
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="../jQuery/jquery-3.1.0.min.js"></script>
    <script type="text/javascript">
        function test() {
            var username = $(".c1");
            var value = $("#username1").val();
            value.length;
            alert(username[0].value);
            alert(username[1].value);
        }
    </script>
</head>
<body>
    <input type="text" id="username1" name="username" class="c1">
    <input type="text" id="username2" name="username" class="c1" onblur="test()">
</body>
</html>

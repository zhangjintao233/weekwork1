<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/2/6
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jQuery练习</title>

    <style type="text/css">
        a {
            text-decoration: none;
        }

        .div1 {

            float: left;
            width: 50px;
            line-height: 30px;
            background-color: lightgray;
            margin-left: 10px;
            text-align: center;
            vertical-align: middle;
        }

        .div2 {
            width: 300px;
            height: 300px;
            border: solid gray 1px;
            margin-top: 60px;
            color: red;
        }

        #a2, #a3 {
            font-size: 20px;
            font-weight: bold;
            display: none;
            color: red;
        }


    </style>
</head>
<body>
<h2>请选择背景颜色</h2>
<div>
    <div id="blue" class="div1" onclick="x()">蓝色</div>
    <div id="green" class="div1" onclick="x2()">绿色</div>
</div>
<div class="div2" id="bg">
    <a id="a2" href="">蓝色背景</a>
    <a id="a3" href="">绿色背景</a>
</div>
<div>输入颜色首字母： <input type="text" id="color" onclick="x3()"></div>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">

</script>
</body>
<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
<script>
    function x() {
        $("#bg").css("background-color", "blue");
        $("#a2").css("display", "block");
        $("#a3").css("display", "none");
    }

    function x2() {
        $("#bg").css("background-color", "darkgreen");
        $("#a3").css("display", "block");
        $("#a2").css("display", "none");
    }

    function x3() {
        var i = $("#color").val();
        var x = "B";
        var y = "G";
        if (i == x) {
            $("#bg").css("background-color", "blue");
            $("#a2").css("display", "none");
            $("#a3").css("display", "none");

        } else if (i == y) {
            $("#bg").css("background-color", "darkgreen");
            $("#a2").css("display", "none");
            $("#a3").css("display", "none");
        }

    }

</script>
</html>

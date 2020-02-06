<html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<style>
    body {
        margin: 0;
        background-color: black;
    }

    a{
        text-decoration: none;
    }

    #div2 {
        height: 100%;
        width: 100%;
        display: flex;
    }
    #div3{
        height: 350px;
        width: 400px;
        background-color: #D6D6D6;
        position: relative;
        margin: auto;
        border-radius: 4px;
        opacity: 0.9;
    }
    #h{
        padding-top: 14px;
        padding-left: 148px;
        padding-bottom: 6px;
    }

    #div3-2{
        padding-left: 50px;
    }

    #input2 {
        height: 36px;
        width: 300px;
        padding-left: 6px;
        margin-bottom: 18px;
        border: none;
        border-radius: 2px;
        color: #B3B3B3;
    }

    #input3{
        height: 36px;
        width: 300px;
        padding-left: 6px;
        margin-bottom: 4px;
        border: none;
        border-radius: 2px;
        color: #B3B3B3;
    }

    #div3-3{
        padding-top: 30px;
        padding-left: 50px;
        padding-bottom: 30px;
    }

    #div3-4{
        font-size: 10px;
        padding-left: 4px;
    }

    #input4{
        height: 36px;
        width: 300px;
        border: none;
        background-color: #32BAF1;
        border-radius: 4px;
        color: white;
    }

    #a2{
        color: #838383;
    }
</style>
<body>
<div id="div2">
    <div id="div3">
        <div id="h">
            <h2>登录中心</h2>
        </div>
        <form action="/backed/user/login" method="post">
            <div id="div3-2">
                <input type="text" placeholder="登录账号" name="username" id="input2">
                <input type="password" placeholder="登录密码" name="password" id="input3">
                <div id="div3-4">
                    <a href="/backed/user/zhuce" id="a2">注册账号</a>
                </div>
            </div>
            <div id="div3-3">
                <input type="submit" value="登录" id="input4">
            </div>
        </form>
    </div>
</div>
</body>
</html>

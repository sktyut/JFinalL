
<html>
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
        <title>注册成功</title>
    </head>

<body>
    <span>注册成功</span><br>
    <span>注册用户名为：</span>
       <#if username??>
             ${username}
          <#else>
             username为空
       </#if>

    <br>
    <span>注册密码为：</span>
    <#if password??>
       ${password}
    <#else>
        password为空
    </#if>
    <br>
</body>

</html>
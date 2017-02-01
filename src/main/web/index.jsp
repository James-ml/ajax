<%--
  Created by IntelliJ IDEA.
  User: Jims
  Date: 2017/2/1
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script type="text/javascript" src="js/jquery-3.1.1.js"></script>
    <style>
        label {
            color: red;
        }
    </style>
</head>
<body>
    用户名：<input type="text" name="username" id="xxx"><label></label><br>
    密&nbsp;码：<input type="password" name="pwd">
</body>
<script>
    //页面加载完成触发该事件
    $(function () {
        <%--失去光标--%>
        $("#xxx").blur(function () {
            //获得文本框的值
            var value = $("#xxx").val();
            //执行异步请求事件
            //ajax里大括号是js对象
            $.ajax({
                url:"/ajax/AjaxServlet",//请求服务器的路径
                //这是一个对象，他表示请求的参数，两个参数：method=ajax&val=value
                //服务器端可以通过request.getParameter()来获取
                //data:{method:"ajax",val:value},
                data:{val:value},//因为servlet没有ajax方法
                async:true,//是否为异步请求
                cache:false,//是否缓存结果
                type:"POST",//请求的方式
                dataType:"json",//服务器返回的数据类型
                //这个函数在服务器执行成功时被调用，参数result就是服务器返回的值
                success:function (result) {
                    if (result){
                        $("label").text("正确！");
                    }else {
                        $("label").text("错误！");
                    }
                }
            });
        });
    });
</script>
</html>

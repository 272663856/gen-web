<%@ page language="java" pageEncoding="UTF-8"%>

<script type="text/javascript">

    function reloadVerifyCode(){
        document.getElementById('verifyCodeImage').setAttribute('src', '${pageContext.request.contextPath}/getVerifyCodeImage?date='+new Date());
    }
</script>

<div style="color:red; font-size:22px;">${message_login}</div>

<form action="<%=request.getContextPath()%>/login" method="POST">
    <table border="1">
        <tr>
            <th>姓名：</th>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <th>密码：</th>
            <td><input type="text" name="password"/></td>
        </tr>
        <tr>
            <th>验证：</th>
            <td>
                <div><input type="text" name="verifyCode"/>
                     <img id="verifyCodeImage" style="vertical-align: middle" onclick="reloadVerifyCode()" src="<%=request.getContextPath()%>/getVerifyCodeImage"/>
                </div>
            </td>
        </tr>
    </table>
    <input type="submit" value="确认"/>
</form>  
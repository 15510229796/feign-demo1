<%--
  Created by IntelliJ IDEA.
  User: ACER
  Date: 2018/3/7
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-3.2.1/jquery-3.2.1.js"></script>
    <link rel="stylesheet" href="/js/layui/css/layui.css">
    <script src="/js/layui/layui.all.js"></script>
</head>
<body>

<div id="showCodeDig" style="display: none;padding-top: 30px">
    <center>
         <img style="width:200px;height: 200px" src="${path}" alt="GG">
    </center>
</div>
<center>
<a href="javascript:showCode()" class="layui-btn">查看信息</a>
</center>
</body>
<script>
 function showCode() {
     layer.open({
         type: 1,
         title: "二维码", //不显示标题栏
         //skin: 'layui-layer-demo', //样式类名
         closeBtn: 1, //不显示关闭按钮
         shift: 2,
         area: ['400px', '400px'], //宽高
         shadeClose: true, //开启遮罩关闭
         content:$("#showCodeDig"),
         scrollbar: false, // 父页面 滚动条 禁止
         btnAlign: 'c',
         /*success: function(layero, index){// 层弹出后的成功回调方法 分别是当前层DOM当前层索引
             console.log(layero, index);
         },*/
         //resize:false, //是否允许拉伸
         btn:['提交'],
         yes: function(index, layero){
             layedit.sync(indexs);
             alert($("#addBookForm").serialize());
             $.ajax({
                 url:"../staff/addInfo.do",
                 type:"post",
                 data:$("#addBookForm").serialize(),
                 dataType:"text",
                 async:true,
                 success:function(){
                     location.href=location;
                     alert(msg+"成功");
                 },
                 error:function(){
                     alert(msg+"失败");
                 }
             })
         },
         end: function () {
             location.reload();
         }
     })

     }

</script>
</html>

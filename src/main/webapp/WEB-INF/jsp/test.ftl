<!doctype html>
<html>
<head>
    <title>${title}</title>
</head>
<body>
<center>
<table border="1" cellspacing="0" width="1000px">
  <#list userlist as user>
      <tr align="center">
          <td colspan="4" bgcolor="#cccccc">简历</td>
      </tr>
      <tr align="center" >
          <td>姓名:</td>
          <td>${user.name}</td>
          <td>性别:</td>
          <td>${user.sex}</td>
      </tr>

      <tr align="center">
          <td>出生年月:</td>
          <td>${(user.birthday)?string("yyyy-MM-dd")}</td>
          <td>籍贯:</td>
          <td>${user.birthplace}</td>
      </tr>
      <tr align="center">
          <td>年龄:</td>
          <td>${user.age}</td>
          <td>工作年限:</td>
          <td>${user.workSeniority}</td>
      </tr>
      <tr align="center">
          <td>学历:</td>
          <td>${user.education}</td>
          <td>专业:</td>
          <td>${user.major}</td>
      </tr>
      <tr align="center">
          <td>移动电话:</td>
          <td>${user.phone}</td>
          <td>电子邮箱：</td>
          <td>${user.email}</td>
      </tr>
      <tr align="center">
          <td colspan="4" bgcolor="#cccccc">求职意向</td>
      </tr>
      <tr align="center">
          <td>工作性质:</td>
          <td>${user.jobCategory}</td>
          <td>目标职位:</td>
          <td>${user.position}</td>
      </tr>
      <tr align="center">
          <td>期望薪资:</td>
          <td>${user.salary}</td>
          <td>工作地:</td>
          <td>${user.workplace}</td>
      </tr>
  </#list>
</table>
<table border="1" cellspacing="0" width="1000px">
    <tr>
        <td bgcolor="#cccccc">技能专长</td>
    </tr>
    <#list skills as sk>
        <tr align="center" >
            <td>${sk.content}</td>
        </tr>
    </#list>
</table>
<table border="1" cellspacing="0" width="1000px">
    <tr>
        <td colspan="3" bgcolor="#cccccc">工作经历</td>
    </tr>

  <#list workexperience as work>
    <tr align="center" >
        <td>${(work.timeBegin)?string("yyyy-MM-dd")}-${(work.timeEnd)?string("yyyy-MM-dd")}</td>
        <td>${work.company}</td>
        <td>${work.position}</td>
    </tr>
  </#list>
</table>
<table border="1" width="1000px" cellspacing="0">
    <tr>
        <td colspan="3" bgcolor="#cccccc">教育经历</td>
    </tr>
    <#list educationexperience as aducation>
        <tr align="center" >
            <td>${(aducation.timeBegin)?string("yyyy-MM-dd")}-${(aducation.timeEnd)?string("yyyy-MM-dd")}</td>
            <td>${aducation.college}</td>
            <td>${aducation.education}</td>
        </tr>
    </#list>
</table>
<table border="1" width="1000px" cellspacing="0">
    <#list project as pr >
        <tr bgcolor="#CCCCCC">
            <td  width="30px">【项目${pr.id}】</td>
            <td>${pr.title}</td>
        </tr>
        <tr>
            <td  width="30px">开发环境:</td>
            <td>${pr.developmentEnvironment}</td>
        </tr>
        <tr>
            <td width="30px">项目框架:</td>
            <td>${pr.projectFramework}</td>
        </tr>
        <tr>
            <td  width="30px">项目描述:</td>
            <td>
            ${pr.projectDescription}
            </td>
        </tr>
        <tr>
            <td  width="30px">责任描述:</td>
            <td>
            ${pr.jobDuty}
            </td>
        </tr>
    </#list>

</table>
<table border="1" cellspacing="0" width="1000px">
    <tr>
        <td bgcolor="#cccccc">自我评价</td>
    </tr>
    <#list userlist as user >
        <tr>
            <td>${user.evaluate}</td>
        </tr>
    </#list>
</table>
</center>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>添加角色</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="content-type" content="text/html;charset=UTF-8">
	<meta name="expires" content="0">    
	<%@ include file="../script.html" %>
	
  </head>
  
  <body style="width:100%;max-width:600px;padding:30px 60px;">
	<section class="info-section">
		<form id="form" method="post">
			<table>
				<tr>
					<td class="text-title">角色名称：</td>
					<td class="text-content">
						<input type="hidden" name="roleVO.id" value="${roleVO.id }"> 
						<input type="text" name="roleVO.roleName" value="${roleVO.roleName }" 
							class="easyui-textbox theme-textbox-radius" data-options="required:true,validType:'length[3,10]'">
					</td>
				</tr>
				<tr>
					<td class="text-title">排序编号：</td>
					<td class="text-content">
						<input type="text" name="roleVO.sortNum" value="${roleVO.sortNum }"
							class="easyui-textbox theme-textbox-radius" data-options="required:true">
					</td>
				</tr>
				<tr>
					<td class="text-title">角色状态：</td>
					<td class="text-content">
						<select name="roleVO.status" class="easyui-combobox theme-textbox-radius">
							<option value="1" ${roleVO.status==1?"selected":"" }>正常</option>
							<option value="0" ${roleVO.status==0?"selected":"" }>禁用</option>
							<option value="2" ${roleVO.status==2?"selected":"" }>已删除</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="text-title">描述信息：</td>
					<td class="text-content">
						<textarea class="theme-textbox-radius" rows="5"  cols="20" name="roleVO.roleNote">${roleVO.roleNote }</textarea></td>
				</tr>

				<tr style="display: none;">
					<td colspan="2">
						<input type="hidden" name="roleVO.funcIds" value="${roleVO.funcIds}"> 
						<input type="hidden" name="roleVO.createById" value="${roleVO.createById}"> 
						<input type="hidden" name="roleVO.createTime" value="${roleVO.createTime}">
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center;margin-top: 10px;">
						<a href="javascript:void(0);" id="saveBtn" class="easyui-linkbutton button-primary">保存</a> 
						<a href="javascript:void(0);" id="resetBtn" class="easyui-linkbutton button-danger">重置</a>
					</td>
				</tr>
				</table>
		</form>
	</section>
	<script type="text/javascript">
		$(function() {
			
		});
			
	</script>
</body>
</html>
				

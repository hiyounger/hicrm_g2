<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list_task.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- 
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<%@include file="../../script.html" %>
  </head>
  	
  <body>
  	<div>
  		<select  name="taskVo" class="easyui-combobox theme-textbox-radius" style="width:120px">
  			<option value="1">任意字段</option>
  			<option value="taskVo.subject" }>主题</option>
  			<option value="taskVo.creatorUsername" }>创建者</option>
  			<option value="taskVo.ownerUsername">负责人</option>
  			<option value="taskVo.status">任务状态</option>
  			<option value="taskVo.priority">优先级</option>
  			<option value="taskVo.description">描述</option>
  			<option value="taskVo.duedate">截止日期</option>
  			<option value="taskVo.createdate">创建日期</option>
  			<option value="taskVo.updtadate">更行日期</option>
  		</select>
  		<select name="taskVo.creatorUsername" class="easyui-combobox theme-textbox-radius" style="width:100px" >
  			<option value="1" {taskVo.creatorUsername?"selected":""} >包含</option>
  			<option value="2" {taskVo.ownerUsername?"selected":""}>人名</option>
  		</select>
  		<input name="subject" type="text" value="${taskVo.subject}" class="easyui-textbox theme-textbox-radius">
  		<a href="javascript:void(0);" onclick="return searchs()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
  	</div>
 
    <table id="taskList"class="easyui-datagrid">
    	
    </table>
  
    <div id="toolbar">
    	<a href="javascript:void(0);" onclick="return add('manage/task/TaskAction_edit.action')" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新建</a>
    	<a href="javascript:void(0);" onclick="return del('manage/task/TaskAction_del.action')" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
    	<a href="javascript:void(0);" onclick="return edit('manage/task/TaskAction_edit.action');" id="editBtn" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>
    	
    </div>
    
  </body>
  <script type="text/javascript">
  		function add(url){
  			
  		}
  		function searchs(){
  			
  		}
  		function del(url){
			
						
  		}
  		function edit(url){
  			
  		}
		$(function(){
			$("#taskList").datagrid({
				url:"manage/task/TaskAction_findByPage.action",
				pagination:true,
				toolbar:"#toolbar",
				fitColumns:true,
				idField:"taskid",
				rownumbers:true,
				columns :[[
					{field:"taskid",title:"选择",checkbox:true},
					{field:"subject" ,title:"主题",width:10},
					{field:"aboutUserId",title:"相关信息",width:10},
					{field:"ownerUsername",title:"负责人",width:15},
					{field:"status",title:"状态",width:10},
					{field:"priority",title:"优先级",width:15},
					{field:"creatorUsername",title:"创建者",width:15},
					{field:"duedate" ,title:"截止日期",width:15},
					{field:"operation",title:"操作",formatter:function(value,rowData,index){
					return "<a href='javascript:void(0);' onclick='see("+index+")'>查看</a>"+
							"<a href='javascript:void(0);' onclick='modify("+index+")'>修改</a>"
					}},		
					
					
				]],
				
				loadFilter:function(data){
				return {"total":data.data.totalRows,"rows":data.data.result}
				}	
				
			})		
		}) 
			
			function see(index){
				
				
			}
			function modify(index){
				
			}
  
  </script>
</html>

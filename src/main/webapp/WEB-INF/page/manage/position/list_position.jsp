<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户列表</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">    
	<%@include file="../../script.html" %>

  </head>
  
  <body >
   	<table id="positionList" class="easyui-datagrid"></table>
    <div id="toolbar">
    	<span>岗位名称:</span>
		<input id="positionName" style="line-height:26px;border:1px solid #ccc">
		<a href="javascript:void(0);" class="easyui-linkbutton" plain="true" onclick="doSearch()" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true">搜索</a>
    	<a href="javascript:void(0);" onclick="return add('manage/position/PositionAction_edit.action')" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新建</a>
    	<a href="javascript:void(0);" onclick="return del('manage/position/PositionAction_delete.action')" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</a>
    	<a href="javascript:void(0);" onclick="return edit('manage/position/PositionAction_edit.action');" id="editBtn" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">修改</a>   	
	</div>
    </div>
    <script type="text/javascript">
    	//条件查询
 	
    	//加载用户数据
    	$(function(){
    		$("#positionList").datagrid({
    			url : "manage/position/PositionAction_findByCondition.action",
    			//queryParams:{"positionName":$("#positionName").val()},
    			pagination : true,
    			toolbar : "#toolbar",
    			fitColumns : true,
    			idField : "positionid",
    			rownumbers : true,
    			singleSelect:true,
    			columns : [[
    				{field:"positionid",title:"选择岗位",checkbox:true},
    				{field:"name",title:"岗位名称",width:10},
    				{field:"departmentName",title:"所属部门",width:10},
    				{field:"positionName",title:"岗位管理上级",width:10},
    				{field:"description",title:"岗位描述",sortable:true,width:10},
    				
    				
    			]],
    			loadFilter:function(data){
    				//data是服务器返回的数据,将服务器端返回的数据转换为datagrid需要的格式
    				return {"total":data.data.totalRows,"rows":data.data.result};
    			}
    		
    		});
    	});
    </script>
  </body>
</html>

[#escape x as x?html]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>${message("admin.movie.add")} - Powered By SHOP++</title>
<meta name="author" content="SHOP++ Team" />
<meta name="copyright" content="SHOP++" />
<link href="${base}/resources/admin/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/admin/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/jquery.tools.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/webuploader.js"></script>
<script type="text/javascript" src="${base}/resources/admin/ueditor/ueditor.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/input.js"></script>
<style type="text/css">
	.parameterTable table th {
		width: 146px;
	}
	
	.specificationTable span {
		padding: 10px;
	}
	
	.productTable td {
		border: 1px solid #dde9f5;
	}
</style>
<script type="text/javascript">
$().ready(function() {

   var $inputForm = $("#inputForm");
   var $type = $("#type");
   var $description = $("#description");
   var $filePicker = $("#filePicker");
   
   [@flash_message /]
   $filePicker.uploader();	
   $description.editor();
   
   	
	// 表单验证
	$inputForm.validate({
	
	
	
	
	
	
	
	
		submitHandler: function(form) {
			addCookie("type",$type, {expires: 24 * 60 * 60});
			$(form).find("input:submit").prop("disabled", true);
			form.submit();
		}
	});
   
   



});
</script>
</head>
<body>
	<div class="breadcrumb">
		<a href="${base}/admin/common/index.jhtml">${message("admin.breadcrumb.home")}</a> &raquo; ${message("admin.movie.add")}
	</div>
	<form id="inputForm" action="save.jhtml" method="post" enctype="multipart/form-data">
		<ul id="tab" class="tab">
			<li>
				<input type="button" value="${message("admin.movie.base")}" />
			</li>
			<li>
				<input type="button" value="${message("admin.movie.introduction")}" />
			</li>
	
		</ul>
		<table class="input tabContent">
              
			<tr>
				<th>
					${message("Movie.type")}:
				</th>
				<td>
					<select id="type" name="movieType">
						[#list types as type]
							<option value="${type}">${message("Movie.Type." + type)}</option>
						[/#list]
					</select>
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.sn")}:
				</th>
				<td>
					<input type="text" name="sn" class="text" maxlength="100" title="${message("admin.movie.snTitle")}" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Movie.name")}:
				</th>
				<td>
					<input type="text" name="movieName" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.actor")}:
				</th>
				<td>
					<input type="text" name="movieActor" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Movie.tag")}:
				</th>
				<td>
					<input type="text" id="movieTag" name="movieTag" class="text" maxlength="16" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.year")}:
				</th>
				<td>
					<input type="text" id="years" name="years" class="text" maxlength="16"  />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.score")}:
				</th>
				<td>
					<input type="text" id="marketPrice" name="score" class="text" maxlength="16"  />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.image")}:
				</th>
				<td>
					<span class="fieldSet">
						<input type="text" name="image" class="text" maxlength="200" title="${message("admin.movie.imageTitle")}" />
						<a href="javascript:;" id="filePicker" class="button">${message("admin.upload.filePicker")}</a>
					</span>
				</td>
			</tr>
		
			<tr>
				<th>
					${message("Movie.keyword")}:
				</th>
				<td>
					<input type="text" name="keyword" class="text" maxlength="200" title="${message("admin.goods.keywordTitle")}" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.seoTitle")}:
				</th>
				<td>
					<input type="text" name="seoTitle" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.seoKeywords")}:
				</th>
				<td>
					<input type="text" name="seoKeywords" class="text" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("Movie.seoDescription")}:
				</th>
				<td>
					<input type="text" name="seoDescription" class="text" maxlength="200" />
				</td>
			</tr>
		</table>
		<table class="input tabContent">
			<tr>
				<td>
					<textarea id="description" name="description" class="editor" style="width: 100%;"></textarea>
				</td>
			</tr>
		</table>
	
		<table class="input">
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="${message("admin.common.submit")}" />
					<input type="button" class="button" value="${message("admin.common.back")}" onclick="history.back(); return false;" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
[/#escape]
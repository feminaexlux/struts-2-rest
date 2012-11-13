<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Show</h2>
<ul>
	<li>ID: <s:property value="model.id" /><li>
	<li>Message: <s:property value="model.text" /></li>
	<li>Author: <s:property value="model.author" /></li>
</ul>
<a href="/messages">Back</a>
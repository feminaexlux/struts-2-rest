<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Show</h2>
<ul>
	<li>ID: <s:property value="model.id" /></li>
	<li>Message: <s:property value="model.text" /></li>
	<li>Author: <s:property value="model.author" /></li>
</ul>
<s:form action="/messages/%{model.id}" method="put">
	<s:hidden name="model.id" />
	<s:hidden name="_method" value="delete" />
	<s:submit value="Delete"/>
</s:form>
<a href="/messages">Back</a>
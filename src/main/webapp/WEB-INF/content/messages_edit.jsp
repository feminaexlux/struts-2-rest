<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Edit New</h2>
<s:url action="messages" var="message_url" >
	<s:param name="id">${model.id}</s:param>
</s:url>
<s:form action="/messages/%{model.id}" method="post">
	<s:hidden name="model.id" />
	<s:hidden name="_method" value="put" />
	<s:textfield name="model.text" label="Message" />
	<s:textfield name="model.author" label="Author" />
	<s:submit />
</s:form>
<a href="/messages">Back</a>

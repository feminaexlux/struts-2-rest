<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Edit New</h2>
<s:form action="messages" method="put">
	<s:textfield name="model.text" label="Message" />
	<s:textfield name="model.author" label="Author" />
	<s:submit />
</s:form>
<a href="/messages">Back</a>
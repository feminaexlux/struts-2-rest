<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Edit New</h2>
<s:form action="/messages/" method="post">
	<s:textfield name="text" label="Message" />
	<s:textfield name="author" label="Author" />
	<s:submit />
</s:form>
<a href="/messages">Back</a>
<%@ taglib prefix="s" uri="/struts-tags"%>
<h2>Index</h2>
<ul>
	<s:iterator  value="model">
		<li>
			<a href="/messages/<s:property value="id" />"> &#34;<s:property value="text" />&#34; by <b><s:property value="author" /></b></a> 
			| <a href="/messages/<s:property value="id" />/edit" >edit</a> |
		</li> 
	</s:iterator>
</ul>
<a href="/messages/new">New Message</a>
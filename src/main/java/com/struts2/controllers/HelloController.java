package com.struts2.controllers;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

@Namespace("/greetings")
public class HelloController {

	public HttpHeaders index() {
		return new DefaultHttpHeaders("index").disableCaching();
	}
	// Direct method invocation
	public HttpHeaders morning() {
		return new DefaultHttpHeaders("morning").disableCaching();
	}
	// Direct method invocation
	public HttpHeaders salutations() {
		return new DefaultHttpHeaders("salutations").disableCaching();
	}
}

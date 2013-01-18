package com.zulutown.struts2.rest;

import java.util.Collection;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ModelDriven;

@Results({
	@Result(name = "update", type = "redirect", location = "/messages/")
})
public class MessagesController implements ModelDriven<Object> {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 89268916175477696L;
	private Message model = new Message();
	private String id;
	private Collection<Message> list;

	public HttpHeaders create() {
		System.out.println("create");
		MessageService.save(model);
		list = MessageService.findAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}

	public HttpHeaders destroy() {
		System.out.println("destroy");
		MessageService.remove(id);
		return new DefaultHttpHeaders("index").disableCaching();
	}

	public HttpHeaders show() {
		System.out.println("show");
		return new DefaultHttpHeaders("show").disableCaching();
	}

	public HttpHeaders update() {
		System.out.println("update");
		MessageService.save(model);
		return new DefaultHttpHeaders("update").disableCaching();
	}

	public HttpHeaders index() {
		System.out.println("index");
		list = MessageService.findAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders edit() {
		System.out.println("edit");
		return new DefaultHttpHeaders("edit").disableCaching();
	}
	
	public HttpHeaders editNew() {
		System.out.println("editNew");
		MessageService.save(model);
		return new DefaultHttpHeaders("edit-new").disableCaching();
	}

	public Object getModel() {
		return (list != null ? list : model);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id != null) {
			this.model = MessageService.find(id);
		}
		this.id = id;
	}
}
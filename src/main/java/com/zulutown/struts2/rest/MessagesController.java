package com.zulutown.struts2.rest;

import java.util.Collection;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;
import com.opensymphony.xwork2.ModelDriven;

public class MessagesController implements ModelDriven<Object> {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 89268916175477696L;
	private Message model = new Message();
	private String id;
	private Collection<Message> list;

	public HttpHeaders create() {
		System.out.println("hello");
		MessageService.save(model);
		list = MessageService.findAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}

	public HttpHeaders destroy() {
		MessageService.remove(id);
		return new DefaultHttpHeaders("index").disableCaching();
	}

	public HttpHeaders show() {
		return new DefaultHttpHeaders("show").disableCaching();
	}

	public HttpHeaders update() {
		MessageService.save(model);
		return new DefaultHttpHeaders("update");
	}

	public HttpHeaders index() {
		list = MessageService.findAll();
		return new DefaultHttpHeaders("index").disableCaching();
	}
	
	public HttpHeaders edit() {
		return new DefaultHttpHeaders("edit").disableCaching();
	}
	
	public HttpHeaders editNew() {
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
package com.struts2.controllers;

import java.util.Collection;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.apache.struts2.rest.HttpHeaders;

import com.opensymphony.xwork2.ModelDriven;
import com.struts2.models.Message;
import com.struts2.services.MessageService;

@Results({
	@Result(name = "update", type = "redirect", location = "/messages/"),
	@Result(name = "destroy", type = "redirect", location = "/messages/"),
	@Result(name = "create", type = "redirect", location = "/messages/")
})
public class MessagesController implements ModelDriven<Object> {

	@SuppressWarnings("unused")
	private static final long serialVersionUID = 89268916175477696L;
	private Message model = new Message();
	private String id;
	private Collection<Message> list;
	private String text;
	private String author;
	// POST request to /messages
	public HttpHeaders create() {
		model = new Message();
		model.setAuthor(author);
		model.setText(text);
		MessageService.save(model);
		list = MessageService.findAll();
		return new DefaultHttpHeaders("create");
	}
	// DELETE request to /messages/{id}
	public HttpHeaders destroy() {
		MessageService.remove(id);
		return new DefaultHttpHeaders("destroy");
	}
	// GET request to /messages/{id}
	public HttpHeaders show() {
		return new DefaultHttpHeaders("show");
	}
	// PUT request to /messages/{id}
	public HttpHeaders update() {
		MessageService.save(model);
		return new DefaultHttpHeaders("update");
	}
	// GET request to /messages
	public HttpHeaders index() {
		list = MessageService.findAll();
		return new DefaultHttpHeaders("index");
	}
	// GET request to /messages/{id}/edit
	public HttpHeaders edit() {
		return new DefaultHttpHeaders("edit");
	}
	// GET request to /messages/new
	public HttpHeaders editNew() {
		return new DefaultHttpHeaders("edit-new");
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
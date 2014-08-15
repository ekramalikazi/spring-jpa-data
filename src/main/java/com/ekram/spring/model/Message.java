package com.ekram.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	@Id
	private Long id;

	@Column(nullable = false)
	private String content;

	public Message() {
	}

	public Message(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Message [content=").append(content).append("]");
		return builder.toString();
	}
}

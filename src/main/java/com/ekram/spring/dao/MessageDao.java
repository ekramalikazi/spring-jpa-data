package com.ekram.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.ekram.spring.model.Message;

public interface MessageDao extends JpaRepository<Message, Long>,
		JpaSpecificationExecutor<Message> {

}
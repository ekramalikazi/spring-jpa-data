package com.ekram.spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ekram.spring.model.Message;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/jpa-context.xml")
public class MessageDaoTest {

	@Autowired
	MessageDao messageDao;

	@Test
	public void test() {
		System.out.println("wwwwwwwwww");
		Message message = messageDao.findOne(1L);
		System.out.println("Testing +++++++++++++++++ " + message.toString());
	}

}

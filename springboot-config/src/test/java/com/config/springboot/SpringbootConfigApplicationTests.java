package com.config.springboot;

import com.config.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringbootConfigApplicationTests {

	@Autowired
	Person person;


	@Test
	void contextLoads() {
		System.out.println(person);
	}

}

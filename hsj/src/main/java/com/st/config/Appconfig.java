package com.st.config;

import com.st.dao.UserDao;
import com.st.dao.UserDao2;
//import com.st.imports.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.st")
//@Import(MyImportSelector.class)
public class Appconfig {
	@Bean
	public UserDao getUserDao(){
		return new UserDao();
	}

	@Bean
	public UserDao2 getUserDao2(){
		getUserDao();
		return new UserDao2();
	}
}

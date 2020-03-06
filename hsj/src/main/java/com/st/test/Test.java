package com.st.test;

import com.st.config.Appconfig;
import com.st.config.MyBeanFactoryPostProcessor;
//import com.st.dao.Indexdao;
//import com.st.dao.Indexdao2;
import com.st.dao.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appconfig.class);
		//context.refresh();
		//context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		context.refresh();
		//Indexdao2 indexdao = context.getBean(Indexdao2.class);
		//System.out.println(indexdao.getClass().getName());
	//	System.out.println(indexdao.hashCode()+"-------"+indexdao1.hashCode());
		UserService userService = context.getBean(UserService.class);
		userService.query();
	}
}

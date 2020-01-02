package com.st.test;

import com.st.config.Appconfig;
import com.st.config.MyBeanFactoryPostProcessor;
import com.st.dao.Indexdao;
import com.st.dao.Indexdao2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(Appconfig.class);
		//context.refresh();
		context.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		context.refresh();
	//	Indexdao indexdao = context.getBean(Indexdao.class);
	//	Indexdao indexdao1 = context.getBean(Indexdao.class);
	//	indexdao.query();
		Indexdao2 indexdao = context.getBean(Indexdao2.class);
		System.out.println(indexdao.getClass().getName());
	//	System.out.println(indexdao.hashCode()+"-------"+indexdao1.hashCode());
	}
}


package com.st.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class Indexdao2 implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	public Indexdao2() {
		System.out.println("construtor");
	}
	@PostConstruct
	public void init(){
		System.out.println("inint");
	}
	public void query() {
		System.out.println("12");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("ApplicationContext applicationContext");
	}
}


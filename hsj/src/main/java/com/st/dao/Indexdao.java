
package com.st.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository("index")
public class Indexdao implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	@Autowired
	private Indexdao2 indexdao2;
	public Indexdao() {
		System.out.println("construtor");
	}
	@Autowired
	public Indexdao(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
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


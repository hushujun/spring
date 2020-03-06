package com.st.dao;

import com.st.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {
	@Autowired
	private Map<String, UserDao> map;

	public void query(){
		System.out.println("x");
	}

}

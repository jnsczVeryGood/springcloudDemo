package cn.com.bosssoft.jnscz.provider.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bosssoft.jnscz.provider.domain.User;
import cn.com.bosssoft.jnscz.provider.mapper.UserMapper;

@Service
public class ShowUserInfoServiceImp implements ShowUserInfoService {
	
	@Autowired
	private UserMapper um;

	public User showInfo(String username) throws Exception {
		User user = null;
		user = um.selectUserById(username);
		return user;
	}
}

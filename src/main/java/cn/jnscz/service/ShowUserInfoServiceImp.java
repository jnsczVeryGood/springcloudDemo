package cn.jnscz.service;

import cn.jnscz.mapper.UserMapper;
import cn.jnscz.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

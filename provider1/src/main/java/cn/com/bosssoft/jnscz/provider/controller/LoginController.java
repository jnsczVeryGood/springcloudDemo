package cn.com.bosssoft.jnscz.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.bosssoft.jnscz.provider.domain.User;
import cn.com.bosssoft.jnscz.provider.service.LoginServiceImp;
import cn.com.bosssoft.jnscz.provider.service.ShowUserInfoServiceImp;

@RestController
public class LoginController {
    @Autowired
    private LoginServiceImp loginServiceImp;
	@Autowired
    private ShowUserInfoServiceImp showUserInfoServiceImp;

    @RequestMapping(value = "/login")
    public User displayUserInfo(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
    	User user = null;
		try {
            if (loginServiceImp.login(username, password)) {
				user = showUserInfoServiceImp.showInfo(username);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}

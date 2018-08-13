package cn.com.bosssoft.jnscz.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.bosssoft.jnscz.provider.mapper.UserMapper;

@Service
public class LoginServiceImp implements LoginService {
    @Autowired
    private UserMapper um;
    public Boolean login(String username,String password)throws Exception{
        String s_password=null;
        s_password=um.selectPasswordById(username);
        if (s_password.equals(password)){
            return true;
        }
        return false;
    }
}

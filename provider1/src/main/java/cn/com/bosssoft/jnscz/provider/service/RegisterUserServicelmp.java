package cn.com.bosssoft.jnscz.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.com.bosssoft.jnscz.provider.domain.User;
import cn.com.bosssoft.jnscz.provider.mapper.UserMapper;

@Service
public class RegisterUserServicelmp implements RegisterUserService {

    @Autowired
    private UserMapper um;

     public boolean registerUser(User user) throws Exception{
       if( um.insertUser(user))
           return  true;
       else
           return false;

    }
}


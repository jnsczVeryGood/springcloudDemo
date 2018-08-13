package cn.com.bosssoft.jnscz.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.com.bosssoft.jnscz.provider.domain.User;
import cn.com.bosssoft.jnscz.provider.service.RegisterUserServicelmp;

@RestController
public class RegisterController {
	
	@Autowired
    private RegisterUserServicelmp registerUserServicelmp;
	
	@RequestMapping(value="/register")
    public String registerUser(User user, ModelMap model) {
        try {
            double account=-1;
            int age=0;
            if(user.getAccount() == null) {
                account=-1;
            }else account=user.getAccount();
            if(user.getAge() == null) {
                age=-1;
            }else age=user.getAge();
            if(!user.getUsername().equals("")) {
                if(!user.getPassword().equals("")&&user.getPassword().length()<=12&&user.getPassword().length()>=6) {

                    if(account>0) {
                        if(age<100&&age>0) {
                            if (user.getName().length()>0) {
                                registerUserServicelmp.registerUser(user);
                                return "ok";
                            }
                            else {
                                model.addAttribute("msg","姓名不合法！");
                                return "姓名不合法！";
                            }
                        }
                        else {
                            model.addAttribute("msg","年龄不合法！");
                            return "年龄不合法！";
                        }
                    }
                    else {
                        model.addAttribute("msg","账户不能为空且不能为负数！");
                        return "账户不能为空且不能为负数！";
                    }
                }

                else {
                    model.addAttribute("msg","密码长度必须为6-12位！");
                    return "密码长度必须为6-12位！";
                }
            }
            else {
                model.addAttribute("msg","用户名不能为空或已经存在！");
                return "用户名不能为空或已经存在！";
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "failure";
    }
	
	
}

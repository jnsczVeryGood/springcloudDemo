package cn.jnscz.controller;

import cn.jnscz.domain.User;
import cn.jnscz.service.ShowUserInfoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class ShowInfoController {

    @Autowired
    private ShowUserInfoServiceImp showUserInfoServiceImp;

	@RequestMapping(value="/userInfo")
    public String displayUserInfo(@RequestParam("username") String username, ModelMap model) {
        try {
            User user = null;
            user = showUserInfoServiceImp.showInfo(username);
            model.addAttribute("user",user);
            return "userInfo";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "error";
    }

}

package cn.com.bosssoft.jnscz.infodisplay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import cn.com.bosssoft.jnscz.infodisplay.domain.User;

@Controller
public class WebController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	// 通过gateway访问
	@RequestMapping("/register")
	public String registerUser(User user, ModelMap model) {
		MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
		paramMap.add("account",user.getAccount());
		paramMap.add("age",user.getAge());
		paramMap.add("info",user.getInfo());
		paramMap.add("name",user.getName());
		paramMap.add("password",user.getPassword());
		paramMap.add("phone",user.getPhone());
		paramMap.add("sex",user.getSex());
		paramMap.add("username",user.getUsername());
		HttpHeaders headers = new HttpHeaders();
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);
		ResponseEntity<String> entity = restTemplate.postForEntity("http://127.0.0.1:8888/server-provide/register", httpEntity,String.class);
		String msg = entity.getBody();
		if (msg.equals("ok")) {
			model.addAttribute("msg", "注册成功");
			return "success";
		} else if ("failure".equals(msg)) {
			model.addAttribute("msg", "注册失败，用户名重复");
			return "failure";
		} else {
			model.addAttribute("msg", "注册失败，"+msg);
			return "register";
		}
	}
	
	@RequestMapping("/login")
	public String loginUser(@RequestParam("username") String username, @RequestParam("password") String password, ModelMap model) {
		System.out.println(0);
		MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
		paramMap.add("password",password);
		paramMap.add("username",username);
		HttpHeaders headers = new HttpHeaders();
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity<MultiValueMap<String, Object>>(paramMap,headers);
		ResponseEntity<User> entity = restTemplate.postForEntity("http://127.0.0.1:8888/server-provide/login", httpEntity,User.class);
		User user = entity.getBody();
		if (null != user) {
			model.addAttribute("user",user);
			return "userInfo";
		} else {
			return "error";
		}
	}
}

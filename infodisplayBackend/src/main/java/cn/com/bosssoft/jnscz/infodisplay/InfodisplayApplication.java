package cn.com.bosssoft.jnscz.infodisplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class InfodisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfodisplayApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}

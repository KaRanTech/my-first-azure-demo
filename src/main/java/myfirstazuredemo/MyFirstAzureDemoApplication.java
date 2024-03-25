package myfirstazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MyFirstAzureDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "my first azure cloud message";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstAzureDemoApplication.class, args);
	}

}

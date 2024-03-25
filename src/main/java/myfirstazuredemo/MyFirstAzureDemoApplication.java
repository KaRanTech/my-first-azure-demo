package myfirstazuredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MyFirstAzureDemoApplication {

	@GetMapping("/message")
	public String getMessage(){
		return "My frist Azure message and deployed Successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyFirstAzureDemoApplication.class, args);
	}

}

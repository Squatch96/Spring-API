package unk.HackBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class HackBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackBackApplication.class, args);
	}
}

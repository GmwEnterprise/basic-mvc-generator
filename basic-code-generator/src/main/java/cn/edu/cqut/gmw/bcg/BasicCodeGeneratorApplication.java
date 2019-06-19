package cn.edu.cqut.gmw.bcg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicCodeGeneratorApplication {

	static void beforeSpringRun() {
	}

	public static void main(String[] args) {
		beforeSpringRun();
		SpringApplication.run(BasicCodeGeneratorApplication.class, args);
	}
}

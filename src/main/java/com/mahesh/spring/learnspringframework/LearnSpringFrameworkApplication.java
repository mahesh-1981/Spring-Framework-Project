package com.mahesh.spring.learnspringframework;

import com.mahesh.spring.learnspringframework.game.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {



//		Before using Spring Framework

//		MarioGame game = new MarioGame();
//		GameRunner runner = new GameRunner(game);

		// After Using SpringFramework
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		GameRunner gr = context.getBean(GameRunner.class);
		gr.run();
	}

}

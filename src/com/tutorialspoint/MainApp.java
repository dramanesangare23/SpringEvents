package com.tutorialspoint;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		//Let us raise a star event
		configurableApplicationContext.start();
		
		HelloWorld helloWorld = (HelloWorld)configurableApplicationContext.getBean("helloWorld");
		helloWorld.getMessage();

		//Let us raise a stop event
		configurableApplicationContext.stop();
		configurableApplicationContext.close();
	}

}

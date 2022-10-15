package com.shan.spring5.sfgdi;

import com.shan.spring5.sfgdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = appCtx.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

}

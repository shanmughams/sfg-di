package com.shan.spring5.sfgdi;

import com.shan.spring5.sfgdi.controller.ConstructorInjectedController;
import com.shan.spring5.sfgdi.controller.MyController;
import com.shan.spring5.sfgdi.controller.PropertyInjectedController;
import com.shan.spring5.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext appCtx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = appCtx.getBean(MyController.class);

		System.out.println("---------Primary Bean ----------");
		System.out.println(myController.sayHello());

		System.out.println("---------Property ----------");
		PropertyInjectedController controller = (PropertyInjectedController) appCtx.getBean("propertyInjectedController");
		System.out.println(controller.getGreeting());

		System.out.println("---------Setter ----------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) appCtx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------Constructor ----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) appCtx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}

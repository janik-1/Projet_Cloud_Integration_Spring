package test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//TP
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/serviceActivator.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/filtering.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/routing.xml");
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/routingAdvanced.xml");

		//Projet
		ApplicationContext ctx = new ClassPathXmlApplicationContext("javaScriptService.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("webServiceCalling.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("sqlDatabase.xml");

	}

}
 
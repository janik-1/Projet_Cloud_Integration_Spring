package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/serviceActivator.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/filtering.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/routing.xml");
		// ApplicationContext ctx = new ClassPathXmlApplicationContext("./TP/routingAdvanced.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./testJS/javaScriptService.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("./testWS/webServiceCalling.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("sqlDatabase.xml");

	}

}
 
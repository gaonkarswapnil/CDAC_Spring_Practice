package day7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configPath = "spring-config.xml";
		ApplicationContext ac= new ClassPathXmlApplicationContext(configPath);
		
		Object obj = ac.getBean("myBean1");
		GreetingService gs = (GreetingService) obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		
		obj = ac.getBean("myBean2");
		gs = (GreetingService) obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}

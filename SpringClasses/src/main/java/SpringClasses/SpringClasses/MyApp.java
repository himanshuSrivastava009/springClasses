package SpringClasses.SpringClasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("applicationContext.xml");
	Car car	= (Car)context.getBean("nano");
	
	System.out.println(car.getCarDetails());
	System.out.println(car.getRocketEngineDetails());
	
	context.close();
	}
	
	

}

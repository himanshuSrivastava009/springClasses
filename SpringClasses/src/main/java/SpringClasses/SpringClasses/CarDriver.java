package SpringClasses.SpringClasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {

	
	public static void main(String[] args) {
		
	String path =  System.getProperty("user.dir");
	System.out.println(path);
	System.out.println(CarDriver.class.getName());
	ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Car car  = (Car)context.getBean("bmw");
	
	System.out.println( car.getCarDetails());
	
	}
}

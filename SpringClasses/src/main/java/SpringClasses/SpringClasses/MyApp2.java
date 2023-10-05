package SpringClasses.SpringClasses;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {
	
	
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context	= new ClassPathXmlApplicationContext("applicationContext.xml");
	
	Audi car = (Audi)context.getBean("audi");
	
	System.out.println(car.getCarDetails());
	System.out.println(car.getRocketEngineDetails());
	System.out.println(car.getColor());
	System.out.println(car.getPrice());
	
	context.close();
	
	}

}

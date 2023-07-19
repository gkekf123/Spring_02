package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("airplane-context.xml");
		
		Car car = (Car)ctx.getBean("car");
		car.getBattery().energy();
		
		Airplane air = (Airplane)ctx.getBean("airplane");
		air.getBattery().energy();
		
		
	
		
	}
	
}

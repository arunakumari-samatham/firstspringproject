package dxc.b6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Dxcb6Application {

	public static void main(String[] args) {
		SpringApplication.run(Dxcb6Application.class, args);
		ApplicationContext vehiclesFactory = new ClassPathXmlApplicationContext("settingconfig.xml");
		Vehicle vehicle = (Vehicle) vehiclesFactory.getBean("car"); 
		//Car car = new Car();
		vehicle.drive();

		System.out.println("Hello Aruna");
	}

}

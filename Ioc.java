//ioc example

public interface Ioc {
    void drive();
}

public class Car implements Ioc{
    public void drive(){
        System.out.println("Car will drive");
    }
}

public class Bike implements Ioc{
    public void drive(){
        System.out.println("Bike will drive");
    }
}

<bean id="vehicle" class="Revature.Car"></bean>

ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
Ioc v = (Ioc) context.getBean("Ioc");
v.drive();
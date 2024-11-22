package home2;

import home2.event.CustomEventPublisher;
import home2.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
        CustomEventPublisher publisher = context.getBean(CustomEventPublisher.class);
        publisher.publishEvent("Hello, this is a custom event!");

        ConfigurableApplicationContext context1 = SpringApplication.run(MainApplication.class, args);

        Employee employee = context1.getBean(Employee.class);
        System.out.println(employee);

        Employee prototypeEmployee1 = context1.getBean("prototypeEmployee", Employee.class);
        Employee prototypeEmployee2 = context1.getBean("prototypeEmployee", Employee.class);

        System.out.println("Prototype 1: " + prototypeEmployee1);
        System.out.println("Prototype 2: " + prototypeEmployee2);
    }

    @Bean
    @Scope("prototype")
    public Employee prototypeEmployee() {
        return new Employee("Prototype User", 25, "Sales");
    }
}

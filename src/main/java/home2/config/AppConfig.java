package home2.config;

import home2.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Employee employee() {
        return new Employee("John Doe", 30, "IT");
    }
}

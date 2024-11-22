package home2.config;

import home2.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpelConfig {

    @Bean
    public String systemPropertyExample() {
        return "${os.name}";
    }

    @Bean
    public String anotherSystemProperty() {
        return "${user.home}";
    }

    @Bean
    public String beanReference(@Qualifier("employee") Employee employee) {
        return "Employee Department: " + employee.getDepartment();
    }

    @Bean
    public int calculatedValue() {
        return 5 + 5;
    }

    @Bean
    public boolean logicalExpression() {
        return true && (5 > 3);
    }

    @Bean
    public double mathExpression() {
        return Math.pow(2, 3);
    }

    @Bean
    public String stringManipulation() {
        return "Hello".toUpperCase();
    }

    @Bean
    public List<Integer> listExample() {
        return List.of(1, 2, 3).stream().filter(x -> x > 1).toList();
    }

    @Bean
    public String customMessage() {
        return "This is a SpEL example";
    }
}


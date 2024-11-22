package home2.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Employee {
    private String name;
    private int age;
    private String department;

    public Employee() {}

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
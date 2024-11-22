package home2.controller;

import home2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller2")
public class Controller2 {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/info")
    public String getInfo() {
        return employeeService.getEmployeeInfo();
    }
}

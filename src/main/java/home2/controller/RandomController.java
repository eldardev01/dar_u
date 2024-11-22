package home2.controller;

import home2.component.ConsumerBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    @Autowired
    private ConsumerBean consumerBean;

    @GetMapping("/getRandomNumber")
    public int getRandomNumber() {
        return consumerBean.getNumber();
    }
}


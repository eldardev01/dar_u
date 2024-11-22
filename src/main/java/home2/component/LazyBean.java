package home2.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Lazy
public class LazyBean {
    public int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }
}

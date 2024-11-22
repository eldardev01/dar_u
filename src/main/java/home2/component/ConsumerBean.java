package home2.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConsumerBean {
    private final LazyBean lazyBean;

    @Autowired
    public ConsumerBean(@Lazy LazyBean lazyBean) {
        this.lazyBean = lazyBean;
    }

    public int getNumber() {
        return lazyBean.getRandomNumber();
    }
}

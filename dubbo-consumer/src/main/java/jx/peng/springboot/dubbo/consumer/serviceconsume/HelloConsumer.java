package jx.peng.springboot.dubbo.consumer.serviceconsume;


import com.alibaba.dubbo.config.annotation.Reference;
import jx.peng.springboot.dubbo.api.service.IHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by pengjianxun on 2019/3/27.
 */
@Component()
public class HelloConsumer {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private IHelloService iHelloService;

    public void sayHello(String name) {
        iHelloService.sayHello(name);
    }
}

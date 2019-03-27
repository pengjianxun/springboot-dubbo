package jx.peng.springboot.dubbo.consumer.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import jx.peng.springboot.dubbo.api.service.IHelloService;
import org.springframework.stereotype.Component;

/**
 * Created by pengjianxun on 2019/3/27.
 */
@Service(interfaceClass = IHelloService.class)
@Component
public class HelloServiceImpl implements IHelloService {

    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}

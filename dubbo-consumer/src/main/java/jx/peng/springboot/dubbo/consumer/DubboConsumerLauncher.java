package jx.peng.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import jx.peng.springboot.dubbo.consumer.serviceconsume.HelloConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by pengjianxun on 2019/3/27.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerLauncher {

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext run = SpringApplication.run(DubboConsumerLauncher.class, args);
        HelloConsumer bean = run.getBean(HelloConsumer.class);
        bean.sayHello("world");
        System.in.read();
    }

}

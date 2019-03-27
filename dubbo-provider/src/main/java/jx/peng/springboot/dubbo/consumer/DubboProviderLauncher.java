package jx.peng.springboot.dubbo.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by pengjianxun on 2019/3/27.
 */
@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderLauncher {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderLauncher.class, args);
    }
}

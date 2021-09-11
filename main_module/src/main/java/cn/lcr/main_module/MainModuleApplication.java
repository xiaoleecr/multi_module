package cn.lcr.main_module;

import cn.lcr.module_a.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Observable;

@ComponentScan("cn.lcr.*.controller")
@SpringBootApplication
public class MainModuleApplication extends Observable {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainModuleApplication.class, args);
        HelloController controller = context.getBean(HelloController.class);
        System.out.println(controller);
    }

}

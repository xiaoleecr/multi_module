package cn.lcr.main_module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MainHelloController
 * @Description
 * @Author licongrui
 * @Date 2021/8/26
 */
@RestController
public class MainHelloController {

    @GetMapping("/main")
    public String MainHello(){
        return "hello moto";
    }
}

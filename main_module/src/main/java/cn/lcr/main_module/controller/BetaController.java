package cn.lcr.main_module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName BetaController
 * @Description
 * @Author licongrui
 * @Date 2021/9/13
 */
@RestController
public class BetaController {
    @GetMapping("/beta")
    public String betaMethod(){
        return "this is beta";
    }
}

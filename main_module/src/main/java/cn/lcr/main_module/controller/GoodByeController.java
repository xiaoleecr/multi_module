package cn.lcr.main_module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodByeController
 * @Description
 * @Author licongrui
 * @Date 2021/9/13
 */
@RestController
public class GoodByeController {
    @GetMapping("/bye")
    public String bye(){
        return "good bye";
    }
}

package cn.lcr.module_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Description
 * @Author licongrui
 * @Date 2021/8/26
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello there!";
    }

    public static void main(String[] args) {
        String v1 = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODIyOTcwNjE0MDY2NzkwNDAiLCJpYXQiOjE2MzAzOTc2MTEsInN1YiI6IntcImlkXCI6XCI5NTI4XCIsXCJhY2NvdW50XCI6XCJzaGVuZ3RpbmdcIixcImFwcENvZGVcIjpcIkEwM1wiLFwidXNlckZsYWdcIjowLFwic25cIjpcIjg4MjI5NzA2MDcxNDYxODg4MFwifSIsImlzcyI6ImN1bnciLCJleHAiOjE2MzA0ODQwMTF9.TWkY6G1XCdP4nLFABtjSlLZtaB_U-llHiPfBTcHJf7o";
        String v2 = "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI4ODIyOTcwNjE0MDY2NzkwNDAiLCJpYXQiOjE2MzAzOTc2MTEsInN1YiI6IntcImlkXCI6XCI5NTI4XCIsXCJhY2NvdW50XCI6XCJzaGVuZ3RpbmdcIixcImFwcENvZGVcIjpcIkEwM1wiLFwidXNlckZsYWdcIjowLFwic25cIjpcIjg4MjI5NzA2MDcxNDYxODg4MFwifSIsImlzcyI6ImN1bnciLCJleHAiOjE2MzA0ODQwMTF9.TWkY6G1XCdP4nLFABtjSlLZtaB_U-llHiPfBTcHJf7o";
        System.out.println(v1.equals(v2));
    }
}

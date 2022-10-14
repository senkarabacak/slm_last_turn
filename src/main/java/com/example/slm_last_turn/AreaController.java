package com.example.slm_last_turn;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class AreaController {
    @RequestMapping(value = "/area", produces="application/json") //, produces=MediaType.TEXT_PLAIN_VALUE)
    //public int sum(@RequestParam int a, @RequestParam int b){
    public String area() {

        //  return a + b;
        return "{\"test\": \"Hello using @ResponseBody\"}";
    }
}

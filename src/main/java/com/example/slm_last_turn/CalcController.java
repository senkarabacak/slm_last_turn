package com.example.slm_last_turn;


import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;

@RestController
public class CalcController {


    @GetMapping("/calculate")
    @ResponseBody
    public double calculate(@RequestParam String form, @RequestParam int b, @RequestParam(defaultValue = "1") int c) {


        if(form.equals("kreis")){
            return 2*b*Math.PI;
        }else if(form.equals("quadrat")){
            return b*b;
        }else if(form.equals("rechteck")){
            return b*c;
        }
        return 0;
    }


    @PostMapping(path= "/calculator", consumes = "application/json", produces = "application/json")
   public String post_calculator(@RequestBody calc calc)
    {
        //Data.add(new calc("form", 1,2));
       return "{\"test\": \"sended @ResponseBody\"}";
    }
}


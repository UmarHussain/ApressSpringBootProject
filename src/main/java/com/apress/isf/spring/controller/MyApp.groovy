package com.apress.isf.spring.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by bv on 12/14/2016.
 */
@Controller
class MyApp {

    @RequestMapping("/")
    @ResponseBody
    String message(){
        return "<h1> Hello World !";
    }
}

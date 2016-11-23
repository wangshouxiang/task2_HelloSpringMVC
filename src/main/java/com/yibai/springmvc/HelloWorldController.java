package com.yibai.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class HelloWorldController {
 
	@RequestMapping(value="/hello")
    public String hello(Model model) {
         
        model.addAttribute("greeting", "Hello Spring MVC");
         
        return"helloworld";
         
    }
 
}

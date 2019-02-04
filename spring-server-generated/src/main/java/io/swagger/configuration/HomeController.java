package io.swagger.configuration;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.io.Authentication;

/**
 * Home redirection to swagger api documentation 
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
    	//Authentication auth = (Authentication) SecurityContextHolder.getContext().getAuthentication();
        
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
    
}

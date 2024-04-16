package org.example;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Hello world!
 *
 */
@Controller
public class App 
{
    @RequestMapping("/home.do")
    public String home(HttpRequest requst){
        return "home";
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}

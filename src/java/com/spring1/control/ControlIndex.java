package com.spring1.control;

import java.io.Serializable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControlIndex implements Serializable {
    
    @RequestMapping("/home")
    public String mostrarHome() {
        return "index";
    }
    
    @RequestMapping("/")
    public String mostrarIndex() {
        return "index";
    }    
    
    @RequestMapping(value="/hola", method=GET) //http://localhost:8080/Spring1/hola?texto=ivette
    public ModelAndView mostrarIndex(@RequestParam("texto") String texto) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("mensaje", "Hola " + texto);
        return mv;
    }    
        
    @RequestMapping("/home/{texto}") //http://localhost:8080/Spring1/home/ivette
    public ModelAndView mostrarIndex2(@PathVariable("texto") String texto) {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("mensaje", "Hola mundo " + texto);
        return mv;
    }    
    
}

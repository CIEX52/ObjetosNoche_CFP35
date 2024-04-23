package ar.org.centro35.configuracion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.org.centro35.configuracion.utils.SystemProperties;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String getIndex(Model model){
        
        String so=SystemProperties.getSO();
        String java=SystemProperties.getJava();
        String user=SystemProperties.getUser();
        String location=SystemProperties.getLocation();
        String time=SystemProperties.getTime();
        String ip=SystemProperties.getIP();

        //model.addAttribute("valor", valor);
        model.addAttribute("so", so);
        model.addAttribute("java", java);
        model.addAttribute("user", user);
        model.addAttribute("location", location);
        model.addAttribute("time", time);
        model.addAttribute("ip", ip);
        return "index";
    }

    @GetMapping("/index2")
    public String getIndex2(){
        return "index2";
    }

}

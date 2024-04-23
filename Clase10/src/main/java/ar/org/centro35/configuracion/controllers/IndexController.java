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
        String lang=SystemProperties.getUserLanguaje();
        String java=SystemProperties.getJava();
        String user=SystemProperties.getUser();
        String location=SystemProperties.getLocation();
        String date=SystemProperties.getDate();
        String ip=SystemProperties.getIP();

        //model.addAttribute("valor", valor);
        model.addAttribute("so", so);
        model.addAttribute("lang", lang);
        model.addAttribute("java", java);
        model.addAttribute("user", user);
        model.addAttribute("location", location);
        model.addAttribute("date", date);
        model.addAttribute("ip", ip);
        return "index";
    }
}

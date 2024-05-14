package ar.org.centro35.configuracion.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.org.centro35.configuracion.utils.SystemProperties;

@Controller
public class IndexController {
    
    @GetMapping("/")
    public String getIndex(Model model){
        //String valor="Hoy es Jueves!";
        String so=SystemProperties.getSO();
        String java=SystemProperties.getJava();
        String user=SystemProperties.getUser();
        String location=SystemProperties.getLocation();
        String ip=SystemProperties.getIP();
        String date=SystemProperties.getDate();
        String language=SystemProperties.getLanguage();

        //model.addAttribute("valor", valor);
        model.addAttribute("so", so);
        model.addAttribute("java", java);
        model.addAttribute("user", user);
        model.addAttribute("location", location);
        model.addAttribute("ip", ip);
        model.addAttribute("language", language);
        model.addAttribute("date", date);
        return "index";
    }

}

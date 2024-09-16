package com.example.themleaf.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Value("${contact.message}")
    private String contactMessage;
    @GetMapping("/")
public String home(Model model){
    model.addAttribute("message","Welcome to our application");
    model.addAttribute("date",new java.util.Date());
    return "home";
}
@GetMapping("/about")
    public String about(Model model){
        model.addAttribute("message","About page");

        return "about";
}
@GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("message",contactMessage);
        return "contact";
}


}

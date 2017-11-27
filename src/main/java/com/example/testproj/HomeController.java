package com.example.testproj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    private  AlumniService alumniService;
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value="/alumni", method = RequestMethod.GET)
    public String showAlumniPage(Model model){
        model.addAttribute("alumni", new Alumni());
        return "Alumni";
    }

    @RequestMapping(value="/alumni", method = RequestMethod.POST)
         public String processAlumniPage(
          @Valid @ModelAttribute("Alumni") Alumni alumni,
          BindingResult result, Model model){
          model.addAttribute("alumni", alumni);
            if (result.hasErrors()) {
                return"Alumni";
            }else{
                alumniService.saveAlumni(alumni);
                model.addAttribute("message", "Alumni information stored");
            }
            return "Alumni";
        }
    }


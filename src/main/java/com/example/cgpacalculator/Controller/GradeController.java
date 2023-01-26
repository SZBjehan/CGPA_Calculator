package com.example.cgpacalculator.Controller;


import com.example.cgpacalculator.Entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GradeController {

    @GetMapping("/index")
    public String sendFom(Model model){
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/result")
    public String processForm(@ModelAttribute Student student, BindingResult result, Model model){
        model.addAttribute("student", student);
        return "result";
    }


}

package controller;

import data.WordDataBase;
import inputOutput.Output;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WordController {

    @GetMapping("/input")
    public ModelAndView input(){
        return new ModelAndView("input","output", new Output());
    }

    @PostMapping("/output")
    public ModelAndView output(@ModelAttribute("output") Output output){
        String result = WordDataBase.checkInput(output);
        if(result == null){
            return new ModelAndView("error");
        } else {
            ModelAndView modelAndView = new ModelAndView("result");
            modelAndView.addObject("result", result);
            return modelAndView;
        }
    }
}

package eu.ncdc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerApp {

    @RequestMapping("showAllBooks.html")
    public ModelAndView showAllBooks(){
        return new ModelAndView("allBooks");
    }

}

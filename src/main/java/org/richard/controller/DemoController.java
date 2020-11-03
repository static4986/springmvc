package org.richard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/handle01")
    public ModelAndView handle01(){
        ModelAndView view = new ModelAndView();
        Date date = new Date();
        view.addObject("date",date);
        view.setViewName("success");
        return view;
    }
}

package com.yojulab.study_springboot.controller;

import com.yojulab.study_springboot.service.CarCompanyService;
import com.yojulab.study_springboot.service.CarInforsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
@RequestMapping("/carcompany")
@RequiredArgsConstructor
public class CarCompanyController {

    private final CarCompanyService carCompanyService;

    @GetMapping("/list")
    public ModelAndView list(@RequestParam Map params, ModelAndView modelAndView) {

        Object result = carCompanyService.list(params);

        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("/WEB-INF/views/carinfor/gahyun.jsp");
        return modelAndView;
    }

    @PostMapping("/delete/{carId}")
    public String delete(@PathVariable("carId") String carId) {
        carCompanyService.deleteCarById(carId);
        return "redirect:/carcompany/list";
    }




}

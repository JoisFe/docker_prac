
package com.nhnenter.controller;

import com.nhnenter.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final TestService testService;

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/")
    public String getPeople(String age, Model model) {
        model.addAttribute("people", testService.findPeople(Integer.parseInt(age)));

        return "index";
    }
}

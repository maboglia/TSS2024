package com.maboglia.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Router {
@RequestMapping("/")
    public String root() {
        return "forward:index.html";
    }
}

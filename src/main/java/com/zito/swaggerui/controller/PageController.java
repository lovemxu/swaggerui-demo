package com.zito.swaggerui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("index")
    public String toPage() {
        return "index";
    }

}

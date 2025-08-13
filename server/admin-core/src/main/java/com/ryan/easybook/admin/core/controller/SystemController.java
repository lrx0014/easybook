package com.ryan.easybook.admin.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemController {

    @GetMapping(path = "/ping")
    public String ping() {
        return "pong";
    }
}

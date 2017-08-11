package com.talentsocial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class WebViewController {
    
    private static final Logger log = LoggerFactory.getLogger(WebViewController.class);

    @RequestMapping("/")
    public String index() {

        log.info("Showing index page");
        return "index";
    }
}
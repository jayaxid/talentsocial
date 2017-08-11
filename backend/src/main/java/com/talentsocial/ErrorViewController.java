package com.talentsocial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.autoconfigure.web.ErrorController;

@Controller("error")
class ErrorViewController implements ErrorController {
    
    private static final Logger log = LoggerFactory.getLogger(ErrorViewController.class);

    private static final String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    public String error() {

        return "error";
    }

    @Override
    public String getErrorPath() {

        return ERROR_PATH;
    }
}
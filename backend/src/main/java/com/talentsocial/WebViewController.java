package com.talentsocial;

import com.talentsocial.models.KaryawanMaster;
import com.talentsocial.repositories.KaryawanMasterRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

@Controller
class WebViewController {
    
    private static final Logger log = LoggerFactory.getLogger(WebViewController.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    KaryawanMasterRepository karyawanRepo;

    @RequestMapping("/")
    public String index() {

        log.info("Showing index page");
        return "index";
    }

    @RequestMapping("/karyawan")
    public String karyawan() {

        log.info("DATASOURCE = " + dataSource);

        log.info("Showing index page");
        return "index";
    }
}
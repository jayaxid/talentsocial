package com.talentsocial;

import com.talentsocial.models.MasterKaryawan;
import com.talentsocial.repositories.MasterKaryawanRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Controller
class WebViewController {
    
    private static final Logger log = LoggerFactory.getLogger(WebViewController.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    MasterKaryawanRepository karyawanRepo;

    @RequestMapping("/")
    public String index() {

        log.info("Showing index page");
        return "index";
    }

    @RequestMapping("/karyawan")
    public String karyawan() {

        log.info("DATASOURCE = " + dataSource);

        for (MasterKaryawan karyawan : karyawanRepo.findAll()) {
            log.info(karyawan.toString());
        }

        log.info("Showing index page");
        return "index";
    }
}
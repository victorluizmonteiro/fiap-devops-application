package com.fiap.dockerapplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
@RequestMapping("/app")
public class DockerController {
    Logger logger = LoggerFactory.getLogger(DockerController.class);

    @GetMapping("/hello-docker")
    public String helloDocker(){



        logger.info("Realizando requisição.....");
        logger.warn("Realizando requisição.....");
        logger.error("Realizando requisição.....");
        logger.debug("Realizando requisição....");

        return "Hello Docker and Jenkins Pipeline";

    }
}

package com.fiap.dockerapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DockerController {


    @GetMapping("/hello-docker")
    public String helloDocker(){

        return "Hello Docker and Jenkins Pipeline";
    }
}

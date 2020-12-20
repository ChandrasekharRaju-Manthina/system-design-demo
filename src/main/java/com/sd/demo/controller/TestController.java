package com.sd.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class TestController {

    @Autowired
    Environment environment;

    @GetMapping("test")
    private String testConnection() throws UnknownHostException {
        String port = environment.getProperty("local.server.port");
        return "Hi there from " + InetAddress.getLocalHost().getHostAddress() + ":" + port;
    }

}

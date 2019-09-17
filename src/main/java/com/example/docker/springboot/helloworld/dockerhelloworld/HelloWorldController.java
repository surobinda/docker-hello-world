package com.example.docker.springboot.helloworld.dockerhelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello")
    public String getHelloWorld() throws UnknownHostException {
        return "Hello World from Docker, Current IP: " + InetAddress.getLocalHost() + " and Host: " + InetAddress.getLocalHost().getHostName();
    }
}

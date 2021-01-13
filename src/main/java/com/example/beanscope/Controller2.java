package com.example.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
    @Autowired
    private PrototypeScopeComponent prototypeScopeComponent;

    @GetMapping("/prototype2")
    public long getPrototypeScopeData(){
        prototypeScopeComponent.printInstanceInfo();
        return System.identityHashCode(prototypeScopeComponent);
    }
}

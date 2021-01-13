package com.example.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
    @Autowired
    private SingletonScopeComponent singletonScopeComponent;

    @Autowired
    private PrototypeScopeComponent prototypeScopeComponent;

    @Autowired
    private SessionScopeComponent sessionScopeComponent;

    @Autowired
    private RequestScopeComponent requestScopeComponent;

    @GetMapping("/session")
    public long getSessionScopeData(){
        sessionScopeComponent.printInstanceInfo();
        return System.identityHashCode(sessionScopeComponent);
    }

    @GetMapping("/request")
    public long getRequestScopeData(){
        requestScopeComponent.printInstanceInfo();
        return System.identityHashCode(requestScopeComponent);
    }

    @GetMapping("/singleton")
    public long getSingletonScopeData(){
        singletonScopeComponent.printInstanceInfo();
        return System.identityHashCode(sessionScopeComponent);
    }

    @GetMapping("/prototype")
    public long getPrototypeScopeData(){
        prototypeScopeComponent.printInstanceInfo();
        return System.identityHashCode(prototypeScopeComponent);
    }
}

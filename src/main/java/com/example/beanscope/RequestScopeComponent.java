package com.example.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serializable;

@Component
@RequestScope
public class RequestScopeComponent implements Serializable {
    private static int instanceCount;

    public RequestScopeComponent(){instanceCount++;}

    public void printInstanceInfo() {
        System.out.println("RequestScope instanceCount : " + instanceCount + "- hashcode : " + this.hashCode());
    }
}

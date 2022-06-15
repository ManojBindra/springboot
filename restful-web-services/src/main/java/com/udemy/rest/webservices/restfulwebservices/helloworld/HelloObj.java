package com.udemy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloObj {
    private String s;
    private int i;

    public String getS() {
        return this.s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return this.i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
}

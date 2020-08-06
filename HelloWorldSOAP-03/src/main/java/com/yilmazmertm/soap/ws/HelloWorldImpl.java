package com.yilmazmertm.soap.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.yilmazmertm.soap.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{


    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS" + name;
    }
}

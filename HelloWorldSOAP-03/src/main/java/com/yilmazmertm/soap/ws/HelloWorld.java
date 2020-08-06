package com.yilmazmertm.soap.ws;


import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface HelloWorld {

    @WebMethod
    public String getHelloWorldAsString(String name);
}

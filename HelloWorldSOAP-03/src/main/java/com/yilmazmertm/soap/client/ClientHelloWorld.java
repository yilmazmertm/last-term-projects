package com.yilmazmertm.soap.client;

import com.yilmazmertm.soap.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientHelloWorld {

    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.soap.yilmazmertm.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        System.out.println(hello.getHelloWorldAsString("Mert Yılmaz"));
    }
}

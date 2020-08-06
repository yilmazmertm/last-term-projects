package com.yilmazmertm.soap.client;

import com.yilmazmertm.soap.converter.CelsiusToFahrenheitResponse;
import com.yilmazmertm.soap.converter.TempConvertSoap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.w3schools.com/xml/tempconvert.asmx?WSDL");

        QName qname = new QName("https://www.w3schools.com/xml/", "TempConvert");

        Service service = Service.create(url, qname);

        TempConvertSoap convertSoap = service.getPort(TempConvertSoap.class);

        String response = convertSoap.celsiusToFahrenheit("150");
        System.out.println(response);
    }
}

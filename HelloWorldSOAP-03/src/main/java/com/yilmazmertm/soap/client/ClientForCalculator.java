package com.yilmazmertm.soap.client;

import com.yilmazmertm.soap.clientgeneratedcalculator.Add;
import com.yilmazmertm.soap.clientgeneratedcalculator.Calculator;
import com.yilmazmertm.soap.clientgeneratedcalculator.CalculatorSoap;
import com.yilmazmertm.soap.ws.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ClientForCalculator {
    public static void main(String[] args) throws MalformedURLException {

        URL url = new URL("http://www.dneonline.com/calculator.asmx?wsdl");

        QName qname = new QName("http://tempuri.org/", "Calculator");

        Service service = Service.create(url, qname);

        CalculatorSoap calculatorSoap = service.getPort(CalculatorSoap.class);

        int result = calculatorSoap.add(5,10);

        System.out.println(result);

    }
}

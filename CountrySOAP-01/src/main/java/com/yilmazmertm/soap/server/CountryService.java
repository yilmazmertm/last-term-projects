package com.yilmazmertm.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface CountryService {

    @WebMethod
    Country findByName(String name);


}

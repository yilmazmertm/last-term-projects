package com.yilmazmertm.soap.server;


import javax.jws.WebService;

@WebService(endpointInterface = "com.yilmazmertm.soap.server.CountryService")
public class CountryServiceImpl implements CountryService{
    private CountryRepository countryRepository = new CountryRepository();

    @Override
    public Country findByName(String name) {
        return null;
    }


}

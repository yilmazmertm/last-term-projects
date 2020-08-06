package com.yilmazmertm.soap.server;

import java.util.HashMap;
import java.util.Map;

public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    {
        initData();
    }
    private final static void initData(){

        Country usa = new Country();
        usa.setCapital("Washington DC");
        usa.setCurrency(Currency.USD);
        usa.setName("United States of America");
        usa.setPopulation(5000000);

        Country france = new Country();
        france.setCapital("Paris");
        france.setCurrency(Currency.EUR);
        france.setName("France");
        france.setPopulation(1000000);

        Country india = new Country();
        india.setName("India");
        india.setCapital("New Delhi");
        india.setCurrency(Currency.INR);
        india.setPopulation(1295210000);

        countries.put(usa.getName(), usa);
        countries.put(france.getName(), france);
        countries.put(india.getName(), india);
    }
    public Country findCountry(String name){
        return countries.get(name);
    }
}

package com.yilmazmertm.soap;

import com.yilmazmertm.soap.client.generated.CountryService;
import com.yilmazmertm.soap.client.generated.CountryServiceImplService;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CountryClientTest {

    private static CountryService countryService;

    @BeforeClass
    public static void setup(){
        CountryServiceImplService service = new CountryServiceImplService();
        countryService = service.getCountryServiceImplPort();
    }

    @Test
    public void givenCountryService_whenCountryIndia_thenCapitalIsNewDelhi() {
        assertEquals("New Delhi", countryService.findByName("India").getCapital());
    }

    @Test
    public void givenCountryService_whenCountryFrance_thenPopulationCorrect() {
        assertEquals(1000000, countryService.findByName("France").getPopulation());
    }
}

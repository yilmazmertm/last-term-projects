package com.yilmazmertm.soap;

import com.yilmazmertm.soap.client.generated.PersonServiceImplService;

import java.util.Arrays;

public class ClientTest {
    public static void main(String[] args) {

        PersonServiceImplService serviceImpl = new PersonServiceImplService();

        com.yilmazmertm.soap.client.generated.PersonService service = serviceImpl.getPersonServiceImplPort();

        com.yilmazmertm.soap.client.generated.Person p1 = new com.yilmazmertm.soap.client.generated.Person(); p1.setName("Mert"); p1.setId(1); p1.setAge(23);
        com.yilmazmertm.soap.client.generated.Person p2 = new com.yilmazmertm.soap.client.generated.Person(); p2.setName("Yilmaz"); p2.setId(2); p2.setAge(35);

        System.out.println("Add Person Status="+service.addPerson(p1));
        System.out.println("Add Person Status="+service.addPerson(p2));

        System.out.println(Arrays.asList(service.getAllPersons()));

        System.out.println(service.getPerson(1));

        System.out.println("Delete Person Status="+service.deletePerson(2));
    }
}

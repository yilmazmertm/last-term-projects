
package com.yilmazmertm.soap.client.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://soap.yilmazmertm.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.yilmazmertm.com/PersonService/deletePersonRequest", output = "http://soap.yilmazmertm.com/PersonService/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @return
     *     returns com.yilmaz.soap.client.generated.PersonArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.yilmazmertm.com/PersonService/getAllPersonsRequest", output = "http://soap.yilmazmertm.com/PersonService/getAllPersonsResponse")
    public PersonArray getAllPersons();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.yilmazmertm.com/PersonService/addPersonRequest", output = "http://soap.yilmazmertm.com/PersonService/addPersonResponse")
    public boolean addPerson(
        @WebParam(name = "arg0", partName = "arg0")
        Person arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.yilmaz.soap.client.generated.Person
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://soap.yilmazmertm.com/PersonService/getPersonRequest", output = "http://soap.yilmazmertm.com/PersonService/getPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

}
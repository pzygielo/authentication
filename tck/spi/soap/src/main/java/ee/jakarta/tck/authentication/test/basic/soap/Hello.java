
package ee.jakarta.tck.authentication.test.basic.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://soap.basic.test.authentication.tck.jakarta.ee/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloProtected", targetNamespace = "http://soap.basic.test.authentication.tck.jakarta.ee/", className = "ee.jakarta.tck.authentication.test.basic.soap.SayHelloProtected")
    @ResponseWrapper(localName = "sayHelloProtectedResponse", targetNamespace = "http://soap.basic.test.authentication.tck.jakarta.ee/", className = "ee.jakarta.tck.authentication.test.basic.soap.SayHelloProtectedResponse")
    @Action(input = "http://soap.basic.test.authentication.tck.jakarta.ee/Hello/sayHelloProtectedRequest", output = "http://soap.basic.test.authentication.tck.jakarta.ee/Hello/sayHelloProtectedResponse")
    public String sayHelloProtected(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
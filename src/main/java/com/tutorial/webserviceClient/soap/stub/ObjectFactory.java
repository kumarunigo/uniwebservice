
package com.tutorial.webserviceClient.soap.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tutorial.webserviceClient.soap.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculateRectangle_QNAME = new QName("http://soap.webservice.tutorial.com/", "calculateRectangle");
    private final static QName _CalculateRectangleResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "calculateRectangleResponse");
    private final static QName _CalculateSquare_QNAME = new QName("http://soap.webservice.tutorial.com/", "calculateSquare");
    private final static QName _CalculateSquareResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "calculateSquareResponse");
    private final static QName _Testing_QNAME = new QName("http://soap.webservice.tutorial.com/", "testing");
    private final static QName _TestingResponse_QNAME = new QName("http://soap.webservice.tutorial.com/", "testingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tutorial.webserviceClient.soap.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculateRectangle }
     * 
     */
    public CalculateRectangle createCalculateRectangle() {
        return new CalculateRectangle();
    }

    /**
     * Create an instance of {@link CalculateRectangleResponse }
     * 
     */
    public CalculateRectangleResponse createCalculateRectangleResponse() {
        return new CalculateRectangleResponse();
    }

    /**
     * Create an instance of {@link CalculateSquare }
     * 
     */
    public CalculateSquare createCalculateSquare() {
        return new CalculateSquare();
    }

    /**
     * Create an instance of {@link CalculateSquareResponse }
     * 
     */
    public CalculateSquareResponse createCalculateSquareResponse() {
        return new CalculateSquareResponse();
    }

    /**
     * Create an instance of {@link Testing }
     * 
     */
    public Testing createTesting() {
        return new Testing();
    }

    /**
     * Create an instance of {@link TestingResponse }
     * 
     */
    public TestingResponse createTestingResponse() {
        return new TestingResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRectangle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateRectangle }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "calculateRectangle")
    public JAXBElement<CalculateRectangle> createCalculateRectangle(CalculateRectangle value) {
        return new JAXBElement<CalculateRectangle>(_CalculateRectangle_QNAME, CalculateRectangle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateRectangleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateRectangleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "calculateRectangleResponse")
    public JAXBElement<CalculateRectangleResponse> createCalculateRectangleResponse(CalculateRectangleResponse value) {
        return new JAXBElement<CalculateRectangleResponse>(_CalculateRectangleResponse_QNAME, CalculateRectangleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSquare }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSquare }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "calculateSquare")
    public JAXBElement<CalculateSquare> createCalculateSquare(CalculateSquare value) {
        return new JAXBElement<CalculateSquare>(_CalculateSquare_QNAME, CalculateSquare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateSquareResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalculateSquareResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "calculateSquareResponse")
    public JAXBElement<CalculateSquareResponse> createCalculateSquareResponse(CalculateSquareResponse value) {
        return new JAXBElement<CalculateSquareResponse>(_CalculateSquareResponse_QNAME, CalculateSquareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Testing }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Testing }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "testing")
    public JAXBElement<Testing> createTesting(Testing value) {
        return new JAXBElement<Testing>(_Testing_QNAME, Testing.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestingResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TestingResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.webservice.tutorial.com/", name = "testingResponse")
    public JAXBElement<TestingResponse> createTestingResponse(TestingResponse value) {
        return new JAXBElement<TestingResponse>(_TestingResponse_QNAME, TestingResponse.class, null, value);
    }

}

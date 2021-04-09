
package com.revature.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.revature.ws package. 
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

    private final static QName _CreateNewGuild_QNAME = new QName("http://ws.revature.com/", "createNewGuild");
    private final static QName _CreateNewGuildResponse_QNAME = new QName("http://ws.revature.com/", "createNewGuildResponse");
    private final static QName _GetGuildByName_QNAME = new QName("http://ws.revature.com/", "getGuildByName");
    private final static QName _GetGuildByNameResponse_QNAME = new QName("http://ws.revature.com/", "getGuildByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.revature.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateNewGuild }
     * 
     */
    public CreateNewGuild createCreateNewGuild() {
        return new CreateNewGuild();
    }

    /**
     * Create an instance of {@link CreateNewGuildResponse }
     * 
     */
    public CreateNewGuildResponse createCreateNewGuildResponse() {
        return new CreateNewGuildResponse();
    }

    /**
     * Create an instance of {@link GetGuildByName }
     * 
     */
    public GetGuildByName createGetGuildByName() {
        return new GetGuildByName();
    }

    /**
     * Create an instance of {@link GetGuildByNameResponse }
     * 
     */
    public GetGuildByNameResponse createGetGuildByNameResponse() {
        return new GetGuildByNameResponse();
    }

    /**
     * Create an instance of {@link Guild }
     * 
     */
    public Guild createGuild() {
        return new Guild();
    }

    /**
     * Create an instance of {@link Player }
     * 
     */
    public Player createPlayer() {
        return new Player();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGuild }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewGuild }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "createNewGuild")
    public JAXBElement<CreateNewGuild> createCreateNewGuild(CreateNewGuild value) {
        return new JAXBElement<CreateNewGuild>(_CreateNewGuild_QNAME, CreateNewGuild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewGuildResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateNewGuildResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "createNewGuildResponse")
    public JAXBElement<CreateNewGuildResponse> createCreateNewGuildResponse(CreateNewGuildResponse value) {
        return new JAXBElement<CreateNewGuildResponse>(_CreateNewGuildResponse_QNAME, CreateNewGuildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGuildByName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGuildByName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getGuildByName")
    public JAXBElement<GetGuildByName> createGetGuildByName(GetGuildByName value) {
        return new JAXBElement<GetGuildByName>(_GetGuildByName_QNAME, GetGuildByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGuildByNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGuildByNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.revature.com/", name = "getGuildByNameResponse")
    public JAXBElement<GetGuildByNameResponse> createGetGuildByNameResponse(GetGuildByNameResponse value) {
        return new JAXBElement<GetGuildByNameResponse>(_GetGuildByNameResponse_QNAME, GetGuildByNameResponse.class, null, value);
    }

}

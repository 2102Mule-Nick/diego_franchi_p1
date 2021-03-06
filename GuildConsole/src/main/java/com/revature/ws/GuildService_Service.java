package com.revature.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2021-04-08T11:20:46.133-07:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "guildService",
                  wsdlLocation = "http://localhost:8080/GuildService/guild?wsdl",
                  targetNamespace = "http://ws.revature.com/")
public class GuildService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.revature.com/", "guildService");
    public final static QName GuildServiceImplPort = new QName("http://ws.revature.com/", "GuildServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/GuildService/guild?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GuildService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/GuildService/guild?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GuildService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GuildService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GuildService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GuildService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GuildService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GuildService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns GuildService
     */
    @WebEndpoint(name = "GuildServiceImplPort")
    public GuildService getGuildServiceImplPort() {
        return super.getPort(GuildServiceImplPort, GuildService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GuildService
     */
    @WebEndpoint(name = "GuildServiceImplPort")
    public GuildService getGuildServiceImplPort(WebServiceFeature... features) {
        return super.getPort(GuildServiceImplPort, GuildService.class, features);
    }

}

package ge.btu.nodar.topuria.covid19;

import ge.btu.nodar.topuria.covid19.model.Covid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CovidEndPoint {
    private static final String NAMESPACE_URI = "http://localhost:8080";


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "string")
    @ResponsePayload
    public Covid getCountry(@RequestPayload String request) {
        Covid response = new Covid();
        return response.findCountry(request);
    }

}

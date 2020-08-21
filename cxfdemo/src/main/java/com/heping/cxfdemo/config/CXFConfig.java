package com.heping.cxfdemo.config;

import com.heping.cxfdemo.service.AnimalService;
import com.heping.cxfdemo.service.UserService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CXFConfig {
    @Autowired
    private Bus bus;

    @Autowired
    private UserService userService;

    @Autowired
    private AnimalService animalService;

    @Bean
    public Endpoint initPoint() {
        //http://localhost:8125/test/user?wsdl
        EndpointImpl endpoint = new EndpointImpl(bus, userService);
        endpoint.publish("/user");
        return endpoint;
    }

    //publish multi services
    @Bean
    public Endpoint initPoint2() {
        //http://localhost:8125/test/animal?wsdl
        EndpointImpl endpoint = new EndpointImpl(bus, animalService);
        endpoint.publish("/animal");
        return endpoint;
    }
}

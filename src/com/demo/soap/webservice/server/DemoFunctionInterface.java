package com.demo.soap.webservice.server;

import javax.jws.WebService;

@WebService
public interface DemoFunctionInterface {

    public String sayHello(String name);

}

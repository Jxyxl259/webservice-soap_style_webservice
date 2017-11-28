package com.demo.soap.webservice.server;

public class DemoFunctionInterfaceImpl implements DemoFunctionInterface {


    @Override
    public String sayHello(String name){

        return "hello"+name;
    }
}

package com.demo.soap.webservice.client;

import com.demo.soap.webservice.server.DemoFunctionInterface;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class MainClient {

    public static void main(String[] args) {
        //创建客户端代理工程对象
        JaxWsProxyFactoryBean clientProxyBean = new JaxWsProxyFactoryBean();
        //设置服务端访问地址
        clientProxyBean.setAddress("http://192.168.1.16:9999/hello");
        //设置服务端提供的服务接口
        clientProxyBean.setServiceClass(DemoFunctionInterface.class);
        //创建服务端的实现类对象
        DemoFunctionInterface demoFunctionInterface = (DemoFunctionInterface)clientProxyBean.create();
        //调用服务端接口定义的的服务方法
        System.out.println(demoFunctionInterface.sayHello("jiangBUG"));

    }

}

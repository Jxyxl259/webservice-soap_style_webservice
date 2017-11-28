package com.demo.soap.webservice.server;


import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MainServer {

    public static void main(String[] args) {
        //创建服务端工厂对象
        JaxWsServerFactoryBean serverFactoryBean = new JaxWsServerFactoryBean();
        //设定服务端的访问地址    此处的IP必须是真实IP
        serverFactoryBean.setAddress("http://192.168.1.16:9999/hello");
        //设定服务接口的实现类
        serverFactoryBean.setServiceClass(DemoFunctionInterfaceImpl.class);
        //创建服务端
        Server server = serverFactoryBean.create();
        //调用start()方法启动服务端
        server.start();

        System.out.println("服务端启动");
    }

}

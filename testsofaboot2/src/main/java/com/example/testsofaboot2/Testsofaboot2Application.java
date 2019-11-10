package com.example.testsofaboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:rpc-sofa2.xml"})
@SpringBootApplication
public class Testsofaboot2Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext  = new SpringApplication(Testsofaboot2Application.class).run(args);
        HelloSyncService helloSyncServiceReference = (HelloSyncService) applicationContext.getBean("helloSynServiceReference");
        System.out.println(applicationContext.getBean("helloSynServiceReference"));
        System.out.println(helloSyncServiceReference.saySync("sync哈哈"));
    }

}

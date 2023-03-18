package com.example.birdsnail.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class NacosSpringCloudExampleApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosSpringCloudExampleApplication.class, args);
        String userName = applicationContext.getEnvironment().getProperty("person.name");
        String userAge = applicationContext.getEnvironment().getProperty("person.age");
        String dog = applicationContext.getEnvironment().getProperty("dog.name");
        System.out.println("dog:" + dog);
        String cat = applicationContext.getEnvironment().getProperty("cat.name");
        System.out.println("cat:" + cat);
        System.err.println("user name :" + userName + "; age: " + userAge);
    }


}

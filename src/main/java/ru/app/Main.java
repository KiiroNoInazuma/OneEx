package ru.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.app.domain.Person;
import ru.app.service.PersonService;

public class Main {

    public static void main(String[] args) {

        var ctx = new ClassPathXmlApplicationContext("spring-context.xml");
        var service = ctx.getBean(PersonService.class);
        Person ivan = service.getByName("Ivan");
        System.out.printf("name: %s age: %s", ivan.name(), ivan.age());
    }
}

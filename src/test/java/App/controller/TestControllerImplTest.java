package App.controller;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestControllerImplTest {

    static ClassPathXmlApplicationContext context;

    @BeforeAll
    static void getContext() {
        context = new ClassPathXmlApplicationContext("/config.xml");
    }

    @Test
    void getNameOfTestSubject() {

    }

    @Test
    void testing() {
    }

    @AfterAll
    static void closeContext(){context.close();}

}
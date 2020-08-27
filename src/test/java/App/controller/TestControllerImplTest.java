package App.controller;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.util.Arrays;

class TestControllerImplTest {

    static ClassPathXmlApplicationContext context;

    @BeforeAll
    static void getContext() {
        context = new ClassPathXmlApplicationContext("/config.xml");
    }

//    @Test
//    void getNameOfTestSubject() {
//        final String withNumbersAndSymbols = "1a$sd d+sa3";
//        final String withoutSpace = "qwerwe";
//        final String moreThanOneSpace = "qwe qwe ewq";
//        final String correctInputEngDiffCase = "Artur Pirojkov";
//        final String correctInputRusDiffCase = "Петр Мамин-Сибиряк";
//        final String correctInputEngSameCase = "bronenosec potemkin";
//        final String correctInputRusSameCase = "вася пупкин";
//
//        TestControllerImpl testController = context.getBean(TestControllerImpl.class);
//
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(new byte[256]);
//        testController.setInputStream(byteArrayInputStream);
//
//        try {
//            System.out.println(byteArrayInputStream.read(withNumbersAndSymbols.getBytes()));
//            System.out.println(Arrays.toString(byteArrayInputStream.readAllBytes()));
//            testController.getNameOfTestSubject();
//            Assert.assertNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(withoutSpace.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(moreThanOneSpace.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(correctInputEngDiffCase.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNotNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(correctInputRusDiffCase.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNotNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(correctInputEngSameCase.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNotNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//
//            byteArrayInputStream.read(correctInputRusSameCase.getBytes());
//            testController.getNameOfTestSubject();
//            Assert.assertNotNull(testController.getNameAndLastName());
//            byteArrayInputStream.reset();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    void testing() {
    }

    @AfterAll
    static void closeContext(){context.close();}

}
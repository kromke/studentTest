package App;

import App.controller.TestController;
import App.controller.TestControllerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicLong;


public class MainApp {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/config.xml");

        TestController testController = context.getBean(TestControllerImpl.class);

        testController.getNameOfTestSubject();
        testController.testing();
        context.close();



    }
}

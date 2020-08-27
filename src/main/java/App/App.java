package App;

import App.controller.TestController;
import App.controller.TestControllerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/config.xml");

        TestController testController = context.getBean(TestControllerImpl.class);

        testController.getNameOfTestSubject();
        testController.testing();
        context.close();
    }
}

package App;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/config.xml");


        context.close();



    }
}

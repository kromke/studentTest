package controller;

import facade.Facade;
import facade.FacadeImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.in;

public class ControllerImpl implements Controller{


    private String name;
    private String lastName;
    private Map<String, String> answers;

    private Facade facade;

    public void setFacade(Facade facade) {
        this.facade = facade;
    }

    @Override
    public void authentification() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))){
            System.out.println("Введите имя: ");
            name = reader.readLine();
            System.out.println("Введите фамилию: ");
            lastName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void testing() {
        Map<String, String> quiz = facade.getQuiz();
        answers = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            for (String question : quiz.keySet()) {
                System.out.println("\nВопрос: " + question);
                System.out.print("Ответ: ");
                answers.put(question, reader.readLine());
                System.out.println();;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void testResults() {
        System.out.println(facade.getResults());
    }
}

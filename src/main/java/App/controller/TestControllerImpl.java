package App.controller;

import App.facade.FacadeModelServiceController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestControllerImpl implements TestController {


    private String name;
    private Map<String, String> answers;
    private Map<String, String> quiz;

    private FacadeModelServiceController facadeServiceController;

    public TestControllerImpl(FacadeModelServiceController facadeServiceController) {
        this.facadeServiceController = facadeServiceController;
    }

    @Override
    public void getNameOfTestSubject() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите имя: ");
            name = reader.readLine();
            System.out.println("Введите фамилию: ");
            name +=  " " + reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void testing() {
        quiz = facadeServiceController.getQuiz();
        answers = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (String question : quiz.keySet()) {
                System.out.println("\nВопрос: " + question);
                System.out.print("Ответ: ");
                String answer = reader.readLine();
                answers.put(question, answer);
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Результаты тестирования " + name + ":\n");
        printTestResults();
    }

    private void printTestResults() {
        System.out.println(facadeServiceController.getTestResults(quiz, answers));
    }
}

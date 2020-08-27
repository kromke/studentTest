package App.controller;

import App.facade.FacadeModelServiceController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestControllerImpl implements TestController {


    private String nameAndLastName;
    private Map<String, String> answers;
    private Map<String, String> quiz;
    private BufferedReader reader;


    private FacadeModelServiceController facadeServiceController;

    public TestControllerImpl(FacadeModelServiceController facadeServiceController) {
        this.facadeServiceController = facadeServiceController;
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void setInputStream(InputStream inputStream) {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    @Override
    public void getNameOfTestSubject() {

        try {

            System.out.println("Введите имя: ");
            nameAndLastName = reader.readLine();

            System.out.println(nameAndLastName);

            System.out.println("Введите фамилию: ");
            nameAndLastName += " " + reader.readLine();

            System.out.println(nameAndLastName);

            if (!nameAndLastName.matches("[a-zA-Zа-яА-Я]+\\s[a-zA-Zа-яА-Я\\-]+"))
                nameAndLastName = null;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void testing() {
        quiz = facadeServiceController.getQuiz();
        answers = new HashMap<>();

        try {
            for (String question : quiz.keySet()) {
                System.out.println("\nВопрос: " + question);
                System.out.print("Ответ: ");

                answers.put(question, reader.readLine());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Результаты тестирования " + nameAndLastName + ":");
        printTestResults();

        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("Exception in close System.in");
        }
    }

    private void printTestResults() {
        System.out.println(facadeServiceController.getTestResults(quiz, answers));
    }
}

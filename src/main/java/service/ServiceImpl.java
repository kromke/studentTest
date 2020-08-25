package service;

import java.util.List;
import java.util.Map;

public class ServiceImpl implements Service{


    @Override
    public String testing(String name, String lastName, Map<String, String> quiz, Map<String, String> answers) {
        StringBuilder stringBuilder = new StringBuilder("Результаты тестирования " + name + " " + lastName + ":\n");
        int counter = 0;
        for (String question : quiz.keySet()) {
            String answer = answers.get(question);
            counter += answer.equalsIgnoreCase(quiz.get(question)) ? 1 : 0;
        }
        stringBuilder.append("Правильно отвечено на " + counter + " вопросов из " + quiz.size());
        return stringBuilder.toString();
    }
}

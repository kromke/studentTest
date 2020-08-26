package App.service;

import java.util.Map;

public class TestServiceImpl implements TestService {


    @Override
    public String getTestResults(Map<String, String> quiz, Map<String, String> answers) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (String question : quiz.keySet()) {
            String answer = answers.get(question);
            counter += answer.equalsIgnoreCase(quiz.get(question)) ? 1 : 0;
        }
        stringBuilder.append("Правильно отвечено на " + counter + " вопросов из " + quiz.size());
        return stringBuilder.toString();
    }
}

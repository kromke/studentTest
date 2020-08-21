package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class QuizDAO {

    private Map<String, String> map = new HashMap<>();

    public QuizDAO(String quizRef) {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(quizRef))) {
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(",");
                if (strings.length == 2)
                map.put(strings[0], strings[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int numberOfQuestions() {
        return map.size();
    }
}

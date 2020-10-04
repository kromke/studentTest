package domain.service.entities;

import java.util.Map;
import java.util.Objects;

public class Test {
    private Map<String, String> questionsAnswers;

    public Test(Map<String, String> questionsAnswers) {
        this.questionsAnswers = questionsAnswers;
    }

    public Map<String, String> getFullTest() {
        return questionsAnswers;
    }

    public Test getClearTest() {
        Map<String, String> clearTest = questionsAnswers;
        for(Map.Entry<String, String> entry : clearTest.entrySet()) {
            entry.setValue("");
        }
        return new Test(clearTest);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Test)) return false;
        Test test = (Test) o;
        return Objects.equals(questionsAnswers, test.questionsAnswers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionsAnswers);
    }
}

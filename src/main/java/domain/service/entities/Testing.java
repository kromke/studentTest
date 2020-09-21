package domain.service.entities;

import domain.service.exceptions.NotCompletedTestException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Testing {
    private Person person;
    private Test test;
    private LocalDate date;
    private Map<String, String> answers;

    public Testing(Person person, Test test) {
        this.person = person;
        this.test = test;
    }

    private void setDate() {
        this.date = LocalDate.now();
    }

    private List<String> getQuestions() {
        return new ArrayList<>(test.getTestData().keySet());
    }

    public List<String> getTest() {
        setDate();
        return getQuestions();
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }

    public String getTestResults() throws NotCompletedTestException{
        if (answers == null)
            throw new NotCompletedTestException();
        return null;
    }

}

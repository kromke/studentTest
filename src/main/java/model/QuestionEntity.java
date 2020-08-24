package model;

public class QuestionEntity {

    private String question;
    private String answer;

    public QuestionEntity(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}

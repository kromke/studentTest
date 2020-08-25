package model;

import java.util.List;

public interface QuizDAO {

    List<QuestionEntity> getQuestions();

    void writeNameLastName (String name, String lastName);
}

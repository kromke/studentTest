package model;

import org.junit.Assert;
import org.junit.Test;

public class QuizDAOTest {

    @Test
    public void quizConstructorTest(){
        QuizDAO quizDAO = new QuizDAO("src/main/Data/quiz.csv");
        Assert.assertTrue(quizDAO.numberOfQuestions() > 0);
    }
}
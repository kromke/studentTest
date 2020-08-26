package App.facade;

import App.model.QuizDAO;
import App.service.TestService;

import java.util.Map;

public class FacadeImpl implements FacadeModelServiceController {


    private TestService service;
    private QuizDAO quizDAO;

    public FacadeImpl (TestService service, QuizDAO quizDAO) {
        this.service = service;
        this.quizDAO = quizDAO;
    }

    @Override
    public Map<String, String> getQuiz() {
        return quizDAO.getQuiz();
    }

    @Override
    public String getTestResults(Map<String, String> quiz, Map<String, String> answers) {
        return service.getTestResults(quiz, answers);
    }
}

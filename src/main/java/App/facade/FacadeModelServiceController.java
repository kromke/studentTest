package App.facade;

import java.util.Map;

public interface FacadeModelServiceController {


    Map<String, String> getQuiz();

    String getTestResults(Map<String, String> quiz, Map<String, String> answers);
}

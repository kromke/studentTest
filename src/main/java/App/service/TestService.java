package App.service;

import java.util.Map;

public interface TestService {


    String getTestResults(Map<String, String> quiz, Map<String, String> answers);
}

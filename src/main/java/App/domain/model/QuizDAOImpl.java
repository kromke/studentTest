package App.domain.model;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class QuizDAOImpl implements QuizDAO{


    private String csvPathIn;

    public QuizDAOImpl(String csvPathIn) {
        this.csvPathIn = csvPathIn;
    }

    public Map<String, String> getQuiz() {
        Map<String, String> map = new HashMap<>();

        try(CSVReader reader =  new CSVReader
                (new InputStreamReader(new FileInputStream(csvPathIn), StandardCharsets.UTF_8))) {
            String[] data;
            while ((data = reader.readNext()) != null) {
                map.put(data[0], data[1]);
            }
        }catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return map;
    }

}

package model;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuizDAOImpl implements QuizDAO{

    private String csvPathIn;
    private String csvPathOut;

    public QuizDAOImpl(String csvPathIn, String csvPathOut) {
        this.csvPathIn = csvPathIn;
        this.csvPathOut = csvPathOut;
    }

    public List<QuestionEntity> getQuestions() {
        List<QuestionEntity> list = new ArrayList<>();

        try(CSVReader reader =  new CSVReader(new FileReader(csvPathIn))) {
            String[] data = null;
            while ((data = reader.readNext()) != null) {
                list.add(new QuestionEntity(data[0], data[1]));
            }
        }catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeNameLastName (String name, String lastName) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvPathOut, true))) {

            writer.writeNext(new String[] {"user", name, lastName});
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}

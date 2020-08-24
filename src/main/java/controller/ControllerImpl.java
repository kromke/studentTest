package controller;

import facade.Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class ControllerImpl implements Controller{

    private String name;
    private String lastName;

    private Facade facade;


    @Override
    public void authentification() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))){
            System.out.println("Введите имя: ");
            name = reader.readLine();
            System.out.println("Введите фамилию: ");
            lastName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getQuiz() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
            System.out.print("\nВопрос: ");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

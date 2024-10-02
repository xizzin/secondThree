package org.example;

import java.util.Date;

public class Reader {

    private String name;
    private int age;
    private String RegistrationDate;
    public Reader(){

    }

    public Reader(String name, int age, String RegistrationDate){
        this.name = name;
        this.age = age;
        this.RegistrationDate = RegistrationDate;
    }

    public void SetName(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public int GetAge(){
        return age;
    }

    public void SetRegisrationDate(String RegistrationDate){
        this.RegistrationDate = RegistrationDate;
    }

    public String GetRegistrationDate(){
        return RegistrationDate;
    }

    public void PrintPersonInfo(){
        System.out.printf("Ваше имя: %s \n Возраст: %d \n Дата регистрации: %s", name, age, RegistrationDate);
    }

    public void UpdateName(String newname){
        this.name = newname;
    }

    public void UpdateAge(int newage){
        this.age = newage;
    }
}

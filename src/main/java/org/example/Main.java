package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Reader[] readers = new Reader[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < readers.length; i++)
        {
            System.out.println("Введите имя читателя: ");
            String name = scanner.nextLine();
            System.out.println("Введите возраст читателя: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите дату регистрации читателя: ");
            String RegistrationDate = scanner.nextLine();

            readers[i] = new Reader(name, age, RegistrationDate);
        }

        for (Reader reader : readers)
        {
            reader.PrintPersonInfo();
        }
    }
}
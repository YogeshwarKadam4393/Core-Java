package com.exceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example8 {

    public static void main(String[] args) {

        try (
            FileReader fileReader = new FileReader("C://Users//ASUS//OneDrive//Desktop//Yogeshwar Personal//addDepWithEmployee.txt");    // For path we have to give double forward slash
            BufferedReader bufferedReader = new BufferedReader(fileReader)
        ) {

            String line = bufferedReader.readLine();

            System.out.println(line);

        } catch (IOException e) {

            System.out.println("Exception occurred while reading the file.");
        }
    }
}

package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainThree {
    public static void main(String[] args) throws Exception {
        File file = new File("temp3.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
            System.out.println(bufferedReader.readLine());
        }

    }
}

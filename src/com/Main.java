package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("temp.txt");
        File dirFile = new File("dir");
        if (!dirFile.exists()) {
            dirFile.mkdir();
            System.out.println("dir exists");
        }
        if (!file.exists()) {

            file.createNewFile();
            System.out.println("file exists");
        }
        if (file.isFile()) {
            System.out.println("file file");
        }
        if (file.isDirectory()) {
            System.out.println("file dir");
        }
        if (dirFile.isFile()) {
            System.out.println("dir file");
        }
        if (dirFile.isDirectory()) {
            System.out.println("dir dir");
        }

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("str 1\n");
        fileWriter.write("str 2\n");
        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader=new FileReader(file);
        char[]chars=new char[20];
        fileReader.read(chars);
        System.out.println(chars);



    }
}

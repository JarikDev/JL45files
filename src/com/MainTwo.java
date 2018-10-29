package com;

import java.io.*;

public class MainTwo {
    public static void main(String[] args) throws Exception {
        File file = new File("temp2.txt");

        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("str 3\n");
        fileWriter.write("str 4\n");

        FileReader fileReader=new FileReader(file);

        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("str 5");
        bufferedWriter.newLine();
        bufferedWriter.write("str 6");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        bufferedWriter.close();

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        while(bufferedReader.ready()){
            System.out.println(bufferedReader.readLine());
        }


    }
}
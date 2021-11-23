package by.overone.homework27;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("Romeo&Juliet.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        while ((i = inputStream.read()) != -1){
            char ch = (char) i;
            stringBuilder.append(ch);
        }
        inputStream.close();
        String text = stringBuilder.toString();
        System.out.println(Analysis.findLeastRecent(text));
        System.out.println(Analysis.findMostRecent(text));
        System.out.println(Analysis.findLonger(text));
    }
}
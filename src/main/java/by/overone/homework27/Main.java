package by.overone.homework27;

import java.io.FileInputStream;
import java.io.FileReader;
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
        System.out.println(Analysis.findYears(text));

        FileReader reader = new FileReader("voina_i_mir.txt");
        StringBuilder stringBuilder1 = new StringBuilder();
        int c;
        while ((c=reader.read()) != -1){
            stringBuilder1.append((char) c);
        }
        reader.close();
        String text2 = stringBuilder1.toString();
        System.out.println(Analysis.findLeastRecent(text2));
        System.out.println(Analysis.findMostRecent(text2));
        System.out.println(Analysis.findLonger(text2));
        System.out.println(Analysis.findYears(text2));

    }
}
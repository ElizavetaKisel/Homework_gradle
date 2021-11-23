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
        System.out.println("*Romeo & Juliet*");
        System.out.println("Самое редко встречающееся слово: " + Analysis.findLeastRecent(text));
        System.out.println("Cамое часто встречающееся слово: " + Analysis.findMostRecent(text));
        System.out.println("Cамое длинное слово: " + Analysis.findLonger(text));
        System.out.println("Все годы, избегая повторений: " + Analysis.findYears(text) + "\n");

        FileReader reader = new FileReader("voina_i_mir.txt");
        StringBuilder stringBuilder1 = new StringBuilder();
        int c;
        while ((c=reader.read()) != -1){
            stringBuilder1.append((char) c);
        }
        reader.close();
        String text2 = stringBuilder1.toString();
        System.out.println("*Война и мир*");
        System.out.println("Самое редко встречающееся слово: " + Analysis.findLeastRecent(text2));
        System.out.println("Cамое часто встречающееся слово: " + Analysis.findMostRecent(text2));
        System.out.println("Cамое длинное слово: " + Analysis.findLonger(text2));
        System.out.println("Все годы, избегая повторений: " + Analysis.findYears(text2));

    }
}
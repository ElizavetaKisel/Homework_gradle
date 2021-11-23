package by.overone.homework27;

import java.io.*;

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

        FileOutputStream outputStream = new FileOutputStream("result.txt");
        StringBuilder result = new StringBuilder();

        result.append("*Romeo & Juliet*"+ "\n");
        result.append("Самое редко встречающееся слово: " + Analysis.findLeastRecent(text)+ "\n");
        result.append("Самое часто встречающееся слово: " + Analysis.findMostRecent(text)+ "\n");
        result.append("Самое длинное слово: " + Analysis.findLonger(text)+ "\n");
        result.append("Все годы, избегая повторений: " + Analysis.findYears(text) + "\n\n");

        byte[] bytes = result.toString().getBytes();
        outputStream.write(bytes);
        outputStream.close();

        FileReader reader = new FileReader("voina_i_mir.txt");
        StringBuilder stringBuilder1 = new StringBuilder();
        int c;
        while ((c=reader.read()) != -1){
            stringBuilder1.append((char) c);
        }
        reader.close();
        String text2 = stringBuilder1.toString();

        FileWriter writer = new FileWriter("result.txt", true);
        StringBuilder result2 = new StringBuilder();

        result2.append("*Война и мир*"+ "\n");
        result2.append("Самое редко встречающееся слово: " + Analysis.findLeastRecent(text2)+ "\n");
        result2.append("Самое часто встречающееся слово: " + Analysis.findMostRecent(text2)+ "\n");
        result2.append("Самое длинное слово: " + Analysis.findLonger(text2)+ "\n");
        result2.append("Все годы, избегая повторений: " + Analysis.findYears(text2)+ "\n\n");

        writer.write(result2.toString());
        writer.close();

        FileReader readRes = new FileReader("result.txt");
        StringBuilder stringResult = new StringBuilder();
        int r;
        while ((r=readRes.read()) != -1){
            stringResult.append((char) r);
        }
        reader.close();
        System.out.println(stringResult);
    }
}
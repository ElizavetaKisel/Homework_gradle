package by.overone.homework27;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream("D://5 Курсы overone//Romeo&Juliet.txt");
        StringBuilder stringBuilder = new StringBuilder();
        int i;
        while ((i = inputStream.read()) != -1){
            char ch = (char) i;
            stringBuilder.append(ch);
        }
        inputStream.close();
        String text = stringBuilder.toString();

    }
}
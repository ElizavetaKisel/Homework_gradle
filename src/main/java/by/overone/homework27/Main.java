package by.overone.homework27;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Hero hero1 = new Hero("Romeo", "male");
        Hero hero2 = new Hero("Juliet", "female");
        Hero hero3 = new Hero("Наташа Ростова", "female");
        Hero hero4 = new Hero("Андрей Балконский", "male");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serialization.txt", true));
        objectOutputStream.writeObject(hero1);
        objectOutputStream.writeObject(hero2);
        objectOutputStream.writeObject(hero3);
        objectOutputStream.writeObject(hero4);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serialization.txt"));
        Hero hero1Restored = (Hero) objectInputStream.readObject();
        Hero hero2Restored = (Hero) objectInputStream.readObject();
        Hero hero3Restored = (Hero) objectInputStream.readObject();
        Hero hero4Restored = (Hero) objectInputStream.readObject();
        objectInputStream.close();

        URL website1 = new URL("https://www.gutenberg.org/files/1112/1112.txt");
        File file1 = new File("Romeo&Juliet.txt");
        FileUtils.copyURLToFile(website1, file1);

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

        result = CompBuilder.shortAppend(result, text, hero1Restored, hero2Restored);

        byte[] bytes = result.toString().getBytes();
        outputStream.write(bytes);
        outputStream.close();


        URL website2 = new URL("https://www.gutenberg.org/files/2600/2600-0.txt");
        File file2 = new File("voina_i_mir.txt");
        FileUtils.copyURLToFile(website2, file2);

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

        result2 = CompBuilder.shortAppend(result2, text2, hero3Restored, hero4Restored);

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
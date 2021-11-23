package by.overone.homework27;

public class CompBuilder {

    public static StringBuilder shortAppend(StringBuilder result, String text, Hero hero1, Hero hero2){
        result.append("*Romeo & Juliet*"+ "\n");
        result.append("Самое редко встречающееся слово: " + Analysis.findLeastRecent(text)+ "\n");
        result.append("Самое часто встречающееся слово: " + Analysis.findMostRecent(text)+ "\n");
        result.append("Самое длинное слово: " + Analysis.findLonger(text)+ "\n");
        result.append("Все годы, избегая повторений: " + Analysis.findYears(text) + "\n");
        result.append("Главные герои: " + hero1.toString() + hero2.toString() + "\n\n");
        return result;
    }
}

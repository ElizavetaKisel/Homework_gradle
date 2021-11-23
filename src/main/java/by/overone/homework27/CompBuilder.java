package by.overone.homework27;

public class CompBuilder {

    public static StringBuilder shortAppend(StringBuilder result, String text, Hero hero1, Hero hero2){
        result.append("*Romeo & Juliet*"+ "\n");
        result.append("Most rare word: " + Analysis.findLeastRecent(text)+ "\n");
        result.append("Most common word: " + Analysis.findMostRecent(text)+ "\n");
        result.append("Longest word: " + Analysis.findLonger(text)+ "\n");
        result.append("All the years, avoiding repetition: " + Analysis.findYears(text) + "\n");
        result.append("Main characters: " + hero1.toString() + hero2.toString() + "\n\n");
        return result;
    }
}

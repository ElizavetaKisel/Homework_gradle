package by.overone.homework27;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Analysis {

    public static String findMostRecent(String text){
        String[] words;
        words = text.split("[0-9\\W]+");
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .orElse(new AbstractMap.SimpleEntry<>(null, null))
                .getKey();
    }

    public static String findLeastRecent(String text){
        String[] words;
        words = text.split("[0-9\\W]+");
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Comparator.comparingLong(Map.Entry::getValue))
                .orElse(new AbstractMap.SimpleEntry<>(null, null))
                .getKey();
    }

    public static String findLonger(String text){
        String[] words;
        words = text.split("[0-9\\W]+");
        String result = "";
        Arrays.sort(words, Comparator.comparing(String::length, Comparator.reverseOrder()));
        result = words[0].length() > result.length() ? words[0] : result;
        return result;
    }

    public static String findYears(String text){
        String[] words;
        words = text.split("\\W+");
        String result = Arrays.stream(words)
                .filter(s -> s.matches("[0-9]{3,}"))
                .distinct()
                .collect(Collectors.joining(", "));
        return result.isBlank() ? "There are no years here" : result;
    }
}

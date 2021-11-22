package by.overone.homework27;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Analysis {

    public static String findMostRecent(String text){
        String[] words;
        words = text.split(" ");
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
        words = text.split(" ");
        return Arrays.stream(words)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Comparator.comparingLong(Map.Entry::getValue))
                .orElse(new AbstractMap.SimpleEntry<>(null, null))
                .getKey();
    }
}

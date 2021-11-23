package by.overone.homework25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringWorker {

    public int getWordsAmount(String str){
        Pattern p = Pattern.compile("[^?!. -]\\S*");
        Matcher m = p.matcher(str);
        int amount = 0;
        while (m.find()) {
            amount++;
        }
        return amount;
    }

    public String changeString(String str){
        return str.trim().replaceAll("a", "%");
    }

    public boolean isEmptyString(String str){
        return str.isBlank();
    }

}

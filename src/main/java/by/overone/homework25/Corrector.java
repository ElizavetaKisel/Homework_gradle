package by.overone.homework25;

public class Corrector {

    public String deleteWord(String sent, String word) throws Exception {
        if (sent.contains(word)){
            String str = sent.replace(word, "");
            return str;
        }else {
            throw new Exception("There is no such word");
        }
    }
}

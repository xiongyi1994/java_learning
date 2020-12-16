package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 语句分割
 * **/
public class SentenceSplit {

    public static void main(String[] args) {
        String source = "aaaaaa。aaa”bbbbaaa。”bbbccc？aaa！aaa。asdfasdf”asdfasdf”asdfasdf。”aaaa”";
        List<String> split = new SentenceSplit().split(source);
        for (String s : split) {
            System.out.println(s);
        }
    }

    private List<String> split(String source) {
        List<String> result = new ArrayList<>();

        char[] chars = source.toCharArray();
        int match = 0;

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            temp.append(c);

            if (c == '”' && match == 0) {
                match = 1;
                continue;
            } else if (c != '”' && match == 1) {
                continue;
            } else if (c == '”' && match == 1) {
                match = 0;
                result.add(temp.toString());
                temp = new StringBuilder();
                continue;
            }

            if ('。' == c || '！' == c || '？' == c) {
                result.add(temp.toString());
                temp = new StringBuilder();
            }
        }

        return result;
    }

}

package fun;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String subject, String anagram) {
        String subjectSorted = sortString(subject);
        String anagramSorted = sortString(anagram);

        return subjectSorted.equals(anagramSorted);
    }

    private static String sortString(String subject) {
        char[] tempArray = subject.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}

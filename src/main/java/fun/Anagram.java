package fun;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String subject, String anagram) {
        char[] tempArray = subject.toCharArray();
        Arrays.sort(tempArray);
        String subjectSorted = new String(tempArray);

        tempArray = anagram.toCharArray();
        Arrays.sort(tempArray);
        String anagramSorted = new String(tempArray);

        return subjectSorted.equals(anagramSorted);
    }
}

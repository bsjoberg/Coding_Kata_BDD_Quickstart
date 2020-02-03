package fun;

import java.util.Arrays;

public class Anagram {
    private Anagram() {}

    public static boolean isAnagram(String subject, String anagram) {
        if(subject.length() != anagram.length())
            return false;

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

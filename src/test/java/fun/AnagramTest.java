package fun;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void testSameLetterIsAnagram() {
        assertTrue(Anagram.isAnagram("a", "a"));
    }
}

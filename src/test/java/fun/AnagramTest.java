package fun;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void testSameLetterIsAnagram() {
        assertTrue(Anagram.isAnagram("a", "a"));
    }

    @Test
    public void testDifferentLetterIsNotAnagram() {
        assertFalse(Anagram.isAnagram("b", "a"));
    }

    @Test
    public void testThreeLetterWordIsAnagram() {
        assertTrue(Anagram.isAnagram("are", "era"));
    }

    // Test with spaces
}

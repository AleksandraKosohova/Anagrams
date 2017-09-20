import static org.junit.Assert.*;

public class StringAnagramCheckerTest {
    @org.junit.Test
    public void isAnagram() throws Exception {
        assertTrue(StringAnagramChecker.isAnagram("elvis", "lives"));
        assertFalse(StringAnagramChecker.isAnagram("elvis", "kives"));
    }

    @org.junit.Test(expected = DifferentLengthException.class)
    public void isAnagramException() throws DifferentLengthException {
        StringAnagramChecker.isAnagram("elvis", "live");
    }
}
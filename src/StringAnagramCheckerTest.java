import static org.junit.Assert.*;

public class StringAnagramCheckerTest {
    @org.junit.Test
    public void isAnagram() throws Exception {
        assertTrue(StringAnagramChecker.isAnagram("qweq", "qwqe"));
        assertFalse(StringAnagramChecker.isAnagram("qqq", "sss"));
    }

    @org.junit.Test(expected = DifferentLengthException.class)
    public void isAnagramException() throws DifferentLengthException {
        assert(StringAnagramChecker.isAnagram("qw eq", "qwqe"));
    }
}
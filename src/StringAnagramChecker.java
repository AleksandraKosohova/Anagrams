import java.util.Arrays;

public class StringAnagramChecker {
    public static final String DIFFERENT_LENGTH_EXCEPTION = "Strings have different sizes.";

    public static boolean isAnagram(String wordFirst, String wordSecond) throws DifferentLengthException{
        boolean result = false;
        if (wordFirst.length() != wordSecond.length()){
            throw new DifferentLengthException(DIFFERENT_LENGTH_EXCEPTION);
        }
        else {
            char[] arFirst = wordFirst.toCharArray();
            char[] arSecond = wordSecond.toCharArray();
            Arrays.sort(arFirst);
            Arrays.sort(arSecond);

            if (String.copyValueOf(arFirst).toLowerCase().equals(String.copyValueOf(arSecond).toLowerCase())){
                result = true;
            }
        }
        return result;
    }
}

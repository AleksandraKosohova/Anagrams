public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(StringAnagramChecker.isAnagram(args[0], args[1]));
        }
        catch (ArrayIndexOutOfBoundsException|DifferentLengthException e) {
            e.printStackTrace();
        }
    }
}

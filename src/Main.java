public class Main {
    public static final String ERROR_FEW_ARGUMENTS = "Too few arguments";
    public static void main(String[] args) {

        try {
            System.out.println(StringAnagramChecker.isAnagram(args[0], args[1]));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(ERROR_FEW_ARGUMENTS);
        }
        catch (DifferentLengthException e) {
            e.printStackTrace();
        }
    }
}

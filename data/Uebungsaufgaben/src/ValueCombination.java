public class ValueCombination {
    public static void main(String[] args) {
        int i = 5;
        long l = 10L;
        float f = 15.0F;
        double d = 20.0D;
        char c = 'c';

        double sumDouble = i + l + f + d + c; // char c's value is 99.0 so the System.out.println(sumDouble) is 149.0
        System.out.println(sumDouble);

        int sumInt = (int) (i + l + f + d + c); // I don't understand my own line of code lol
        System.out.println(sumInt);

    }
}

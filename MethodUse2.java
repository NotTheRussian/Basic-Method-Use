public class MainChallenge {
    public static void main(String[] args) {

        int a = 23;
        int b = 77;
        int c = 99;

        System.out.println("The result is " +
        calculatedResult(a, b, c));

    }
    public static int calculatedResult(int a, int b, int c) {
        a *= (b * c);
        int result = a;
        return result;
    }
}
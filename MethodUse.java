public class MainChallenge {
    public static void main(String[] args) {

        //We want to print the number 100 using arithmetic
        //operations while using a method, This is how!
        calculatedByte();

    }
    public static void calculatedByte() {
        byte number1 = 19;
        byte number2 = 9;
        byte number3 = 9;

        number1 += (byte) (number2 * number3);
        byte result = number1;
        System.out.println("The result is " +result);
    }
}
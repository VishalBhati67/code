import java.util.Scanner;
import java.math.BigInteger;

public class LargeIntegerMultiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("MCA25117");

        System.out.print("Enter first large number: ");
        BigInteger num1 = new BigInteger(sc.next());

        System.out.print("Enter second large number: ");
        BigInteger num2 = new BigInteger(sc.next());

        BigInteger result = num1.multiply(num2);

        System.out.println("Multiplication Result = " + result);
    }
}


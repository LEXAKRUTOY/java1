
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input your price: ");
        float A = in.nextFloat();
        System.out.print("input your sale (%): ");
        float B = in.nextFloat();

        B /= 100;
        float C = A * B;
        float result = A - C;
        System.out.printf("Price: %.2f%n", A);
        System.out.printf("Price with sale: %.2f%n", result);
    }
}

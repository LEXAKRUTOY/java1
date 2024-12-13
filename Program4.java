
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Temp in C: ");
        int A = in.nextInt();

        int F = (A * 9 / 5) + 32;
        System.out.println("Temp in C: " + A);
        System.out.println("Temp in F: " + F);
    }
}

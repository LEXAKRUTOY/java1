
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("input your number: ");
        int A = in.nextInt();

        for (int i = 2; i <= A; i++) {
            while (A % i == 0) {
                System.out.println(i);
                A /= i;
            }
        }
    }
}

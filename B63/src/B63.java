import java.util.Scanner;
public class B63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j =  1; j <= n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

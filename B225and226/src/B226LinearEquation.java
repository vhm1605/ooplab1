
import java.util.Scanner;

public class B226LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear equation: ax + b = 0");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println();

        if (a == 0 && b == 0) System.out.println("Infinite solutions");
        else if (a == 0) System.out.println("No solution");
        else System.out.println("Solution found: x = " + String.format("%.6f", -b/a));
        scanner.close();
    }
}

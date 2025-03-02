
import java.util.Scanner;
public class B226LinearSystem {
    public static void main(String[] args) {
        System.out.println("System:");
        System.out.println("a11 * x1 + a12 * x2 = b1");
        System.out.println("a21 * x1 + a22 * x2 = b2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("b2: ");
        double b2 = scanner.nextDouble();
        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;
        if (D == 0 && D1 == 0 && D2 == 0) System.out.println("Infinite solutions");
        else if (D == 0) System.out.println("No solution");
        else System.out.println("Solution found: x1 = " + String.format("%.6f", D1 / D)
                    + ", x2 = " + String.format("%.6f", D2 / D));
        scanner.close();
    }
}

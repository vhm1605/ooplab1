import java.util.Scanner;

public class B226QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Quadratic equation: ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        if (a == 0)
        {
            if (b == 0) System.out.println(c == 0 ? "Infinite solutions" : "No solution");
            else System.out.println("Linear solution: x = " + String.format("%.6f", -c / b));
        }
        else
        {
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                System.out.println("No real solution");
            else if (delta == 0)
                System.out.println("Double root: x = " + String.format("%.6f", -b / (2 * a)));
            else
            {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Two solutions: x1 = " + String.format("%.6f", x1) + ", x2 = " + String.format("%.6f", x2));
            }
        }
        scanner.close();
    }
}

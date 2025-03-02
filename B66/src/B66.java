
import java.util.Scanner;
public class B66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int rows = scanner.nextInt(), cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols], matrix2 = new int[rows][cols], sumMatrix = new int[rows][cols];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

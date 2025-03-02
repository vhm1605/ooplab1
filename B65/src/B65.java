import java.util.Arrays;
import java.util.Scanner;

public class B65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        Arrays.sort(arr);
        int sum = 0;
        for (int num : arr) sum += num;
        double average = (double) sum / n;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average value: " + average);

        scanner.close();
    }
}


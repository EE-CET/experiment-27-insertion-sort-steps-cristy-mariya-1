import java.util.*;

public class InsertionSortSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int e = arr[n - 1];
        int i = n - 2;

        // Shift elements
        while (i >= 0 && arr[i] > e) {
            arr[i + 1] = arr[i];
            printArray(arr);
            i--;
        }

        // Insert element
        arr[i + 1] = e;
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

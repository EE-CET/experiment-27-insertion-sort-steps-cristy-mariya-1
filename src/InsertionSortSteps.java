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

        while (i >= 0 && arr[i] > e) {
            arr[i + 1] = arr[i];
            printArray(arr);
            i--;
        }

        arr[i + 1] = e;
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);  // no space after last element
            else
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

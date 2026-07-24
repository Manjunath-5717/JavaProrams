package arrays;

import java.util.Scanner;

public class Desending {

    public static boolean isArraySorted(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isArraySorted(arr)) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is not sorted in descending order.");
        }

        sc.close();
    }
}
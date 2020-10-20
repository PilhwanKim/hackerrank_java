package me.leonkim.sorting;

import java.util.Scanner;

public class BubbleSort {

    static int[] _countSwaps(int[] a) {
        int swaps = 0;
        int temp;

        for (int i=0; i < a.length; i++) {
            for (int j=0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swaps++;
                }
            }
        }

        return new int[]{swaps, a[0], a[a.length - 1]};
    }

    static void countSwaps(int[] a) {
        int[] results = _countSwaps(a);

        System.out.println("Array is sorted in "+ results[0] +" swaps.");
        System.out.println("First Element: " + results[1]);
        System.out.println("Last Element: " + results[2]);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        countSwaps(a);

        scanner.close();
    }
}

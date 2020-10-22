package me.leonkim.sorting;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ActivityNotifications {
    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int count = 0;
        int[] number_counts = new int[201];

        for (int i = 0; i < expenditure.length; i++) {
            if(i < d) {
                number_counts[expenditure[i]]++;
                continue;
            }

            double median = getMedian(number_counts, d);

            if (median * 2 <= expenditure[i]) {
                count++;
            }

            number_counts[expenditure[i]]++;
            number_counts[expenditure[i - d]]--;
        }

        return count;
    }

    private static double getMedian(int[] number_counts, int d) {
        double median = 0;
        int count = 0;

        if(d % 2 == 0) {
            Integer median1 = null;
            Integer median2 = null;
            for (int i = 0; i < number_counts.length; i++) {
                count += number_counts[i];
                if (median1 == null && count >= d/2) {
                    median1 = i;
                }
                if (median2 == null && count >= d/2 + 1) {
                    median2 = i;
                    break;
                }
            }

            median = (median1 + median2) / 2.0;

        } else {
            for (int i = 0; i < number_counts.length; i++) {
                count += number_counts[i];
                if (count > d / 2) {
                    median = i;
                    break;
                }
            }
        }

        return median;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

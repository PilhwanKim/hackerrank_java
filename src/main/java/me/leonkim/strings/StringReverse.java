package me.leonkim.strings;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A =sc.next();

        String result = solution(A);

        System.out.println(result);

    }

    public static String solution(String input) {

        for (int i=0; i < input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - i - 1))
                return "No";
        }

        return "Yes";
    }
}

package org.example.Question14;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        allSubstring(str);
    }

    private static void allSubstring(String str) {
        int n = str.length();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <=n ; j++) {
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}

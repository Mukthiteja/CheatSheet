package org.example.Question13;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = in.nextLine();
        int count=0;
        for (int i=0;i<str.length();i++){
            char letter = str.charAt(i);
            if(isVowel(letter))count++;
        }
        System.out.println("number of vowels: "+count);

    }
    public static boolean isVowel(char c) {
        if (c == 'a') return true;
        else if (c == 'e') return true;
        else if (c == 'i') return true;
        else if (c == 'o') return true;
        else if (c == 'u') return true;
        else if (c == 'A') return true;
        else if (c == 'E') return true;
        else if (c == 'I') return true;
        else if (c == 'O') return true;
        else if (c == 'U') return true;
        else return false;
    }
}

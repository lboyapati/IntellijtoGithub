package JavaBasics;

import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character input: ");
        String str = sc.next();
       String str1 = str.toLowerCase();
        switch(str1)
    {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
                System.out.println(str + " is a vowel");
                break;

            default:
                System.out.println("the given character is consonant");
        }
    }
}
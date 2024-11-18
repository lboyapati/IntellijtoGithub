package JavaBasics;

import java.util.Locale;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        //editing the changes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character input: ");
        String str = sc.next();
       String str1 = str.toLowerCase();
        switch(str1)
    {
            //updating the file just for pulling 
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

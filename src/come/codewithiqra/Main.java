package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.println("Enter the string:");

        char[] letter= string.nextLine().toCharArray();
        System.out.println("Reversed String: ");

        for(int i = letter.length-1 ; i>=0; i--){


            System.out.print(letter[i]);
        }
        System.out.println("\n");


    }
}

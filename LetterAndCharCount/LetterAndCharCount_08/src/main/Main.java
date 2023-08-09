package main;

import count.Counter;
import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Counter counter = new Counter();
        System.out.println("Enter your content: ");
        String text = sc.nextLine();
        counter.countCharacterAndLetter(text);
        counter.display();
    }
    
}

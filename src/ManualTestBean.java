package src;

import java.util.Scanner;

public class ManualTestBean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userInput = sc.nextLine();
        System.out.println("Hello " + userInput + ", nice to meet you!");
    }
}

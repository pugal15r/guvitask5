package task5;

import java.util.Scanner;

public class numpattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        printPattern(n);
        
        scanner.close();
    }
    
    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 02== 0) {
                System.out.println("**");
            } else {
                System.out.println("*");
            }
        }
    }
}

package fh;

import java.util.Scanner;

public class fhp {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Faktoriyel sayisi: ");
        int n = inpScanner.nextInt();
        int result = 1;
        
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Sonuc: " + result);
    }
}

package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Tamaño del cuadradro: ");
        size = scanner.nextInt();

        for (int i=0; i<size; i++) {
            // \t is a tab (4 blank spaces) just to center our square
            System.out.print("\t\t\t");
            for (int j=0; j<size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

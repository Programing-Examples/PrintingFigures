package main.java.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.println("Tamaño de la base: ");
        size = scanner.nextInt();

        //Square
        // \n print an end line
        System.out.println("Cuadrado: \n");
        for (int i=0; i<size; i++) {
            // \t is a tab (4 blank spaces) just to center our square
            System.out.print("\t\t\t");
            for (int j=0; j<size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //Triangle
        System.out.println("Triangulo: \n");
        for (int i=size; i>0; i--) {
            System.out.print("\t\t\t");
            for (int j=i; j <= size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

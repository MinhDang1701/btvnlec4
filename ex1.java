package ifelse;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "chan.");
        } else {
            System.out.println(number + "Le.");
        }
    }
}


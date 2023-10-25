package application.belajar.java.string;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama : ");
        String name = scanner.nextLine();

        System.out.println("Umur : ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + "Umur anda :" + age);

    }
}

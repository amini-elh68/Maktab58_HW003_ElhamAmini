package Maktab58_HW003_ElhamAmini;

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String:");
        String string1 = scanner.nextLine();
        System.out.println("Enter Second String:");
        String string2 = scanner.next();
        System.out.println(string1.contains(string2));
    }
}

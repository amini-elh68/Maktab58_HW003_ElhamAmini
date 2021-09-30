package Maktab58_HW003_ElhamAmini;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String string = scanner.next();
        int index = 0;
        while (index != -1) {
            System.out.println("Enter index");
            index = scanner.nextInt();
            if (index < string.length() && index != -1) {
                System.out.println(string.charAt(index));
            }
        }
    }
}

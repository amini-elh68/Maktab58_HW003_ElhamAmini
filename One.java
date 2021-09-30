package Maktab58_HW003_ElhamAmini;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("رشته مورد نظر را وارد نمایید");
        String string = scanner.next();
        for (int i = 97; i <= 122; i++) {
            int index = -1;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == (char) i)
                    index = j;
            }
            System.out.println((char) i + ": " + (index > 0 ? index : "-"));
        }
    }
}

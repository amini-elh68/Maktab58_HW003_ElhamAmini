package Maktab58_HW003_ElhamAmini;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("رشته مورد نظر را وارد نمایید");
        String string = scanner.nextLine();
        String lowRepeat = "";
        char[] array = string.toCharArray();
        int[] intArray = new int[array.length];
        int index = 0;
        for (char c : array)
            intArray[index++] = c;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[j] < intArray[i]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        string = "";
        for (int i : intArray) {
            string += String.valueOf((char) i);
        }
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            int ch = string.charAt(i);
            if (ch < 97 || ch > 122)
                continue;
            int repeat = 0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    repeat++;
                }
            }
            if (counter == 0) {
                counter = repeat;
                lowRepeat = String.valueOf(string.charAt(i)) + ", ";
            } else if (counter != 0 && repeat < counter) {
                counter = repeat;
                lowRepeat = String.valueOf(string.charAt(i)) + ", ";
            } else if (repeat == counter) {
                lowRepeat += string.charAt(i) + ", ";
            }
        }
        System.out.println(lowRepeat);
    }
}

package Maktab58_HW003_ElhamAmini.six;

public class ImmutableSample {
    public static void main(String[] args) {
        String[] array = new String[2];
        array[0] = "first";
        array[1] = "second";
        Student student = new Student("sam", 19, array);
        System.out.println(student.getName());
        System.out.println(student.getRegNo());
        for (String s : student.getDescription()) {
            System.out.print(s);
            System.out.print(" ");
        }
        student.getDescription()[0] = "three";
        System.out.println();
        for (String s : student.getDescription()) {
            System.out.print(s);
            System.out.print(" ");
        }

    }
}

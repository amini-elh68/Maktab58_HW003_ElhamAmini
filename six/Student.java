package Maktab58_HW003_ElhamAmini.six;

public final class Student {

    private final String name;
    private final int regNo;
    private final String[] description;

    public Student(String name, int regNo, String[] metadata) {
        this.name = name;
        this.regNo = regNo;
        this.description = metadata;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String[] getDescription() {
        String[] temp = new String[description.length];
        for (int i = 0; i < description.length; i++) {
            temp[i] = description[i];
        }
        return temp;
    }
}

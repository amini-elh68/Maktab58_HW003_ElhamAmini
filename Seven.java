package Maktab58_HW003_ElhamAmini;

public class Seven {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("جاوا");
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append("پیوست");
        }
        System.out.println("زمان StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("جاوا");
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append("پیوست");
        }
        System.out.println("زمان StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
    }
}

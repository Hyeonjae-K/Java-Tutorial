package testPjt.src;

public class ArrayClass {
    public static void main(String[] args) {
        int[] odds = { 1, 3, 5, 7, 9 };
        String[] weeks = new String[7]; // 길이가 없으면 오류 발생
        weeks[0] = "Mon";
        weeks[1] = "Tue";
        weeks[2] = "Wed";
        weeks[3] = "Thu";
        weeks[4] = "Fri";
        weeks[5] = "Sat";
        weeks[6] = "Sun";
        // String[] weeks = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sum" };

        for (int i = 0; i < odds.length; i++) {
            System.out.print(odds[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < weeks.length; i++) {
            System.out.print(weeks[i] + " ");
        }
        System.out.println();
    }
}

package testPjt.src;

import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");

        for (int i = 0; i < pitches.size(); i++) {
            System.out.printf(pitches.get(i) + " ");
        }
        System.out.println();

        System.out.println("contain 129: " + pitches.contains("129"));

        System.out.println("0 index value: " + pitches.get(0));
        System.out.println("remove 0 index value: " + pitches.remove(0)); // 삭제 후 값 반환
        System.out.println("0 index value: " + pitches.get(0));
    }
}

package testPjt.src;

import java.util.ArrayList;

public class ListClass {
    public static void main(String[] args) {
        // Non-Generic
        ArrayList temp_list = new ArrayList();
        // Generic
        ArrayList<String> pitches = new ArrayList<String>();
        String temp_s;

        temp_list.add("string");
        pitches.add("string");
        temp_s = (String) temp_list.get(0); // 형변환 필수
        System.out.println(temp_s);
        temp_s = pitches.get(0);
        System.out.println(temp_s); // 형변환 필요 없음

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

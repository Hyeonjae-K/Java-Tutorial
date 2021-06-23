package testPjt.src;

import java.util.HashMap;

public class MapClass {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        System.out.println(map.size());
        System.out.println(map.get("people") + ", " + map.get("baseball"));
        System.out.println(map.containsKey("people") + ", " + map.containsKey("person"));
        System.out.println(map.remove("people"));
    }
}

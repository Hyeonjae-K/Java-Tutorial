package testPjt.src;

public class Boolean {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = 3 % 2 == 0; // false
        System.out.println("isTrue = " + isTrue + ", isFalse = " + isFalse);
        System.out.println("2 > 1 = " + (2 > 1)); // true
        System.out.println("1 == 2 = " + (1 == 2)); // false
        System.out.println("3.equals(2) = " + "3".equals(2)); // false

        if (isTrue) {
            System.out.println("isTrue == true");
        }
        if (!isFalse) { // !isFalse == true
            System.out.println("!isFalse == true");
        }
    }
}

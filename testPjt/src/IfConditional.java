package testPjt.src;

import java.util.ArrayList;

public class IfConditional {
    public static void main(String[] args) {
        boolean money = true;
        if (money) {
            System.out.println("Taxi");
        } else {
            System.out.println("Walk");
        }

        int x = 3, y = 2;
        System.out.println("x(3) > y(2): " + (x > y));
        System.out.println("x(3) < y(2): " + (x < y));
        System.out.println("x(3) == y(2): " + (x == y));
        System.out.println("x(3) != y(2): " + (x != y));
        if (x == y) {
            System.out.println("x equal y");
        } else if (x > y) {
            System.out.println("x is larger than y");
        } else {
            System.out.println("x is smaller than y");
        }

        int cash = 2000;
        boolean has_wallet = true;
        if (has_wallet && cash > 2000) {
            System.out.println("Take a taxi");
        } else if (has_wallet && cash >= 1000) {
            System.out.println("Take a bus");
        } else {
            System.out.println("Walk");
        }

        ArrayList<String> wallet = new ArrayList<String>();
        wallet.add("money");
        wallet.add("receipt");
        wallet.add("card");
        if (wallet.contains("money") || wallet.contains("card")) {
            System.out.println("Take a taxi");
        } else {
            System.out.println("Walk");
        }
    }
}

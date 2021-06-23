package testPjt.src;

public class SwitchCaseClass {
    public static void main(String[] args) {
        int num = 3;
        String num_str;

        switch (num) {
            case 0:
                num_str = "Zero";
                break;
            case 1:
                num_str = "One";
                break;
            case 2:
                num_str = "Two";
                break;
            case 3:
                num_str = "Three";
                break;
            default:
                num_str = "Larger than 3";
                break;
        }

        System.out.println(num_str);
    }
}

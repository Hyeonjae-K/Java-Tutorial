package testPjt.src;

public class WhileClass {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true) {
            treeHit++;
            if (treeHit % 2 == 1) {
                continue;
            } else {
                System.out.printf("%d번 찍었습니다.\n", treeHit);
                if (treeHit == 10) {
                    System.out.println("넘어갑니다.");
                    break;
                }
            }
        }
    }
}

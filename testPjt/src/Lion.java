package testPjt.src;

// public class Lion extends Animal implements Predator, Barkable {
//     public String getFood() {
//         return "banana";
//     }

//     public void bark() {
//         System.out.println("으르렁");
//     }
// }

// 추상클래스
public class Lion extends Predator implements Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}
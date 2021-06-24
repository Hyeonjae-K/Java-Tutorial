package testPjt.src;

// public class Tiger extends Animal implements Predator, Barkable {
//     public String getFood() {
//         return "apple";
//     }

//     public void bark() {
//         System.out.println("어흥");
//     }
// }

// 추상클래스
public class Tiger extends Predator implements Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}
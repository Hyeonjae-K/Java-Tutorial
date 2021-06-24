package testPjt.src;

// 인터페이스
// public interface Predator {
//     public String getFood();
// }

// 추상클래스
public abstract class Predator extends Animal {
    public abstract String getFood();

    public boolean isPredator() {
        return true;
    }
}
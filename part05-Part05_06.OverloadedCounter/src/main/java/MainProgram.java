
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter(5);
        
        counter.decrease();
        counter.increase();
        
        counter.decrease(2);
        counter.increase(7);
        
        System.out.println(counter);
    }
}

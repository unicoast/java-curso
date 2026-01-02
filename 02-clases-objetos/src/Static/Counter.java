package Static;

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }
    
    public void showCount(){
        System.out.println("count = " + count);
    }
}

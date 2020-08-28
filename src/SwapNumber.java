public class SwapNumber {
    public static void main(String[] args){
        int x = 10, y = 20;
        int temporary = x;
        x = y;
        y = temporary;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

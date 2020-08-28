import java.util.Scanner;

public class NumberinRevers {
    public static void main(String[] agrs){
        Scanner SC = new Scanner(System.in);
        int Number = SC.nextInt();
        System.out.println("digits");
        while (Number>0){
            int digit = Number%10;
            Number = Number/10;
            System.out.println(digit);
            System.out.println(",");

        }
    }
}

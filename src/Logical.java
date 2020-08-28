import java.util.Scanner;

public class Logical {
    public static void main(String[] agrs){
        Scanner SC = new Scanner(System.in);
        int number;
        do{
            System.out.println("enter a number:");
            number = SC.nextInt();
        }
        while(number % 2 == 0);
    }
}

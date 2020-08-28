import java.util.Scanner;
public class CheckEvenOdd {
    public static void main(String[] agrs){
        Scanner SC = new Scanner(System.in);
        int number, count=0,Rem;
        System.out.println("enter the number:");
        number = SC.nextInt();
        while(number>0){
            Rem = number%10;
            if(Rem % 2 == 0){
                count+=1;
            }
            number/=10;
        }
        System.out.println("total Even number:" +count);

    }
}

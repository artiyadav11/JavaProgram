package Com.example;

import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        int[] bin = new int[100];
        int num1 = num, i=1, j;
        while(num1!=0){
            bin[i++]=num1%2;
            num1/=2;
        }
        for(j=i-1; j>0; j--){
            System.out.print(bin[j]);
        }
    }
}

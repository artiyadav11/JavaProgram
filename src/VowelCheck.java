import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        String str; int count=0;
        System.out.println("enter the string");
        str = SC.nextLine();
        for(int i=0; i<str.length(); i++){
            char chr = str.charAt(i);
            switch(chr){
                case'a':
                    count+= 1;
                    break;
                case'e':
                    count+= 1;
                    break;
                case'i':
                    count+= 1;
                    break;
                case 'o':
                    count+= 1;
                    break;
                case'u':
                    count+= 1;
                    break;
                default:
                    continue;
            }

        }
        System.out.println("total no. of vowels:" +count);
    }
}

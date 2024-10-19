import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]){
        int n=0,a=0;

        int reverse=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number to check palindrome or not: ");
        n=inp.nextInt();
        int temp=n;
        while(n>0){
            a=n%10;
            reverse =reverse*10+a;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println(temp+" is a palindrome number");

        }else{
            System.out.println("Is not a palindorme number");
        }



    }
}

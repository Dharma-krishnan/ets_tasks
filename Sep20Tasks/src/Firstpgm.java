import java.util.Scanner;
public class Firstpgm {
    public static void main(String args[]){
        int a,b;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        a=inp.nextInt();
        System.out.println("Enter second number");
        b=inp.nextInt();

        System.out.println("Sum of two numbers is: "+(a+b));
        System.out.println("Difference of two numbers: "+Math.abs(a-b));
        System.out.println("Product of two integers: "+(a*b));
        System.out.println("Average of two numbers: "+(a+b)/2);
        if(a>b){
            System.out.println("Max Integer: "+a);
        }else{
            System.out.println("Max Integer: "+b);
        }

        if(a<b){
            System.out.println("Min Integer: "+a);
        }else{
            System.out.println("Min Integer: "+b);
        }
    }
}

import java.util.Scanner;
public class Calculator {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
    public int mod(int a,int b){
        return a%b;
    }
    public int po(int a, int b){
        return (int)Math.pow(a,b);
    }
    public static void main(String args[]){
        Scanner inp= new Scanner(System.in);
        Calculator obj=new Calculator();
        int opt,a=0,b=0;

        System.out.println("Enter the number to select an arithemtic operation:");
        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod\n6.Sqr");
        opt=inp.nextInt();

        System.out.println("Enter a number: ");
        a=inp.nextInt();
        System.out.println("Enter a number: ");
        b=inp.nextInt();
        switch(opt){
            case 1:
                System.out.println("Addition of "+a+" and "+b+" is "+ obj.add(a,b));
                break;
            case 2:
                System.out.println("Subtraction of "+a+" and "+b+ " is "+obj.sub(a,b));
                break;
            case 3:
                System.out.println("Multiplication of "+ a+" and "+b+" is "+obj.mul(a,b));
                break;
            case 4:
                System.out.println("Division of "+a+" and "+b+" is "+obj.div((double)a,(double)b));
                break;
            case 6:
                System.out.println("Modulo of "+a+" and "+ b+" is "+ obj.mod(a,b));
                break;
            case 7:
                System.out.println(a+" power of "+b+" is "+ obj.po(a,b));
                break;
            default:
                System.out.println("ENter valid number");
        }
    }
}
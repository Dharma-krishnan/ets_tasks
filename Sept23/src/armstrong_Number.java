import java.util.Scanner;
public class armstrong_Number {
    public int armstrong(int n){
        int a=0,sum=0,digits=0,temp=n;
        while(temp>0){
            digits++;
            temp=temp/10;
        }

        while(n>0){
            a=n%10;
            sum+=Math.pow(a,digits);
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a num to check armstrong or not: ");
        int n=inp.nextInt();

        armstrong_Number obj=new armstrong_Number();
        if(n==obj.armstrong(n)) {
            System.out.println(n+" is a armstrong number");
        }else{
            System.out.println(n+" is not a armstrong number");
        }


    }
}

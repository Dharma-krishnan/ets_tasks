import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String args[]){
        int n;
        int a=0,b=1,c=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=inp.nextInt();
        for(int i=0;i<n;i++){
            c=a+b;

            System.out.println(a);
            a=b;
            b=c;
        }

    }
}

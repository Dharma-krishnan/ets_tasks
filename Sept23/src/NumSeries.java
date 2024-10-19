import java.util.Scanner;
public class NumSeries {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Number of Terms: ");
        int n=inp.nextInt();
        int sum=0,num=0;
        for(int i=1;i<=n;i++){
            num=num*10+1;
            sum+=num;
        }
System.out.println(sum);

    }
}

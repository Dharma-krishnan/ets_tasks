import java.util.Scanner;
public class Java_if_Else {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        if(n%2==1){
            System.out.println("Weird");
        }else if(n%2==0){
            if(n>=2 && n<=5){
                System.out.println("Not weird");
            }else if(n>=6 && n<=20){
                System.out.println("Weird");
            }else if(n>20){
                System.out.println("Not Weird");
            }
        }
    }
}

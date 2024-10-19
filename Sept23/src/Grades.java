
import java.util.Scanner;
public class Grades {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int marks=0;

        System.out.println("Enter Your Marks: ");
        marks=inp.nextInt();


        if(marks>=91 && marks<=100){
            System.out.println("Your Grade: AA");
        }else if(marks>=81 && marks<=90){
            System.out.println("Your Grade: AB");
        }else if(marks>=71 && marks<=80){
            System.out.println("Your Grade: BB");
        }else if(marks>=61 && marks<=70){
            System.out.println("your Grade: BC");
        }else if(marks>= 51 && marks<=60){
            System.out.println("Your Grade: CD");
        }else if(marks>=41 && marks<=50){
            System.out.println("Your Grade: DD");
        }else{
            System.out.println(" Fail");
        }
    }

}

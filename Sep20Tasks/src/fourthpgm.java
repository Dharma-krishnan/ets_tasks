import java.util.Scanner;
public class fourthpgm {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.println("Weight in pounds: ");
        double weight=inp.nextInt();
        System.out.println("Height in inches: ");
        double height=inp.nextInt();

        double bmi= (weight * 703)/(height*height);
        System.out.println("BMI: "+bmi);
    }
}

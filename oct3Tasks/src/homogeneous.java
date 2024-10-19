import java.util.Scanner;
public class homogeneous {
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
// Homogeneous- Similar data type storing
        int arr[]=new int[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }

        for(int a: arr){
            System.out.print(a+" ");
        }




    }
}

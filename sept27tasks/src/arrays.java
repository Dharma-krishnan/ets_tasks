import java.util.Arrays;
import java.util.Scanner;
public class arrays {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int arr[]=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(Arrays.toString(arr));

        int arr1[]=new int[]{5,6,7,8,9};
        System.out.println(arr1[0]);


        int arr2[]={2,3,4,5,65,6,6,7};
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

        int arr3[]=new int[3];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(arr3));

    }

}

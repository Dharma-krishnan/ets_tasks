import java.util.Arrays;

public class CopyAllElementsofArray {
    public static void main(String args[]){
        int arr1[]=new int[]{12,11,78,89};

        int arr2[]=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }

            System.out.print(Arrays.toString(arr2));

    }
}

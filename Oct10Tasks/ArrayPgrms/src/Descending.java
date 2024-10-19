import java.util.Arrays;

public class Descending {
    public static void main(String args[]){
        int arr[]={11,34,23,987,345,1214};

        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

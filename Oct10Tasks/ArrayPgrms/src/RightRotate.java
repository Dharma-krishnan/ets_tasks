import java.util.Arrays;

public class RightRotate {
    public static void main(String args[]){
        int arr[]={9,22,43,46,12,3};
        int n=2;
        for(int i=0;i<n;i++){
            int last=arr[arr.length-1];
            for(int j = arr.length-1; j >0; j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;

        }
        System.out.println(Arrays.toString(arr));
    }
}
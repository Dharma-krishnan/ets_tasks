
public class avgArray {
    public static void main(String args[]){
        int add=0;
        int arr[]={22,33,44,55,66};

        for(int i=0;i<arr.length;i++){
            add+=arr[i];
        }
        int avg=add/arr.length;
        System.out.println(avg);

    }
}

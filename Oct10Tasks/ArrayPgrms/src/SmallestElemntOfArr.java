public class SmallestElemntOfArr {
    public static void main(String args[]){
        int arr[]={23,34,12,356,54};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
                         if(arr[i]<min){
                             min=arr[i];
                         }


        }
        System.out.println(min);
    }
}

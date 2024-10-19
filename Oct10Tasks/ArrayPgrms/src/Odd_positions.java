public class Odd_positions {
    public static void main(String args[]){
        int arr[]={12,13,14,115,16,19,17,18};
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}

public class Even_positions {
    public static void main(String args[]){
        int arr[]={34,56,1,23,56,787,796,123};

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}

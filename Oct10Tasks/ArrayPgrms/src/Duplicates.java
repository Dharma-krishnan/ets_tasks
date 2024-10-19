public class Duplicates {
    public static void main(String args[]){
        int arr[]={2,3,2,8,4,5,6,3,8};
        boolean ar[]=new boolean[arr.length];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[j]);
                        break;
                    }
                }

            }
        }
    }
}

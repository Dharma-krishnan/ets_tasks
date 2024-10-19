public class Max_ElementOfArr {
    public static void main(String args[]){
        int arr[]={12,56,34,98,89};
        int max_ele=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    max_ele=Math.max(arr[i],arr[j]);
                }
            }
        }
        System.out.println("Max Element is "+max_ele);
    }
}

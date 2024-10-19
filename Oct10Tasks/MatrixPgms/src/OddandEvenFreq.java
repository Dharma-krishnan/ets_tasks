public class OddandEvenFreq {
    public static void main(String args[]){
        int arr[][]={
                {2,33,4},
                {12,56,43},
                {22,45,78}

        };
        int odd=0,even=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]%2==0){
                    even++;
                }else{
                    odd++;
                }

            }
        }
System.out.println("Odd num Count: "+odd+"\neven num count: "+even);
    }

}

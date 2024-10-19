public class AddEachRowNCol {
    public static void main(String args[]){
        int arr[][]={
                {2,3,4},
                {5,6,7},
                {8,9,0}
        };
        for(int i=0;i<arr.length;i++){
            int row=0,col=0;
            for(int j=0;j<arr[i].length;j++){
                row+=arr[i][j];
                col+=arr[j][i];
            }
            System.out.println("Sum of row:"+row);
            System.out.println("Sum of col:"+col);
        }

    }
}

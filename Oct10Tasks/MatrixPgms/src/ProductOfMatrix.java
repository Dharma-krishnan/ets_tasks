public class ProductOfMatrix {
    public static void main(String args[]){
        int arr1[][]={
                {11,2,3},
                {2,3,4},
                {4,5,6}
        };
        int arr2[][]={
                {1,2,3},
                {4,5,6},
                {3,4,5}
        };
        int c[][]=new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
//                int c[][]=0;
                for(int k=0;k<arr2.length;k++){
                    c[i][j]+=arr1[i][k]*arr2[k][j];
                }

            }
            System.out.println(" ");
        }
    for(int b=0;b<c.length;b++){
        for(int a=0;a<c[b].length;a++){
            System.out.print(c[b][a]+" ");
        }
    System.out.println(" ");
    }

    }
}

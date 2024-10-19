public class SubTwoMatrix {
    public static void main(String args[]){

                int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
                int arr2[][]={{22,3,4},{33,4,50},{3,22,5}};
                int sub[][]=new int[3][3];

                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr[i].length;j++){
                        sub[i][j]=arr[i][j]-arr2[i][j];
                    }
                }
                for(int a[]:sub){
                    for(int b:a){
                        System.out.print(b+" ");
                    }
                    System.out.println(" ");
                }


            }
        }



public class MultiDimensional_Array {
    public static void main(String args[]){
        int arr1[][]= new int[][]{{2,3,4},{5,6,7},{8,9,10}};
        int arr2[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        int row=3,col=3;
        int add[][]=new int[row][col];
        int sub[][]=new int[row][col];
        int mul[][]=new int[row][col];
        double div[][]= new double[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                add[i][j]= arr1[i][j]+ arr2[i][j];
                sub[i][j]=arr1[i][j]-arr2[i][j];
                mul[i][j]=arr1[i][j]*arr2[i][j];
                div[i][j]=arr1[i][j]/arr2[i][j];
            }
        }
System.out.println(" Addition");
        for(int ad[]: add){
            for(int a: ad){
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }
    System.out.println(" Subtraction");
        for(int su[]:sub){
            for(int i=0;i<col;i++){
                System.out.print(su[i]+" ");
            }
            System.out.println(" ");
        }
    System.out.println("Multiplication");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println(" ");
        }
    System.out.println("Division ");
        for(double di[]:div){
            for(double a:di){
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }

    }

}

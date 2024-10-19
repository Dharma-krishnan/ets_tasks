public class SparseMatrix {
    public static void main(String args[]){
        int a[][] = {
                {4, 0, 0},
                {0, 5, 0},
                {0, 0, 6}
        };
        int rows=a.length;
        int cols=a[0].length;
        int count=0;
        int total=rows*cols;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]==0){
                    count++;
                }
            }
        }
        if(count>(total/2)){
            System.out.println("Given Array is SparseMatrix");
        }else{
            System.out.println("Is not a sparse Matrix");
        }
    }
}

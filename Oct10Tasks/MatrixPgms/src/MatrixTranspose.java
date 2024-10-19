public class MatrixTranspose {
    public static void main(String args[]) {


    int arr[][] = {
            {2, 3, 1},
            {3, 4, 5},
            {6, 7, 8}
    };
    int c[][] = new int[arr.length][arr[0].length];
    for(int i = 0; i<arr.length;i++) {
        for(int j=0;j<arr[0].length;j++){
            c[i][j]=arr[j][i];
        }
    }
    for(int i=0;i<c.length;i++){
        for(int j=0;j<c[i].length;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println("");
    }
}

}

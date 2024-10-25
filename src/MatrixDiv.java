public class MatrixDiv {
    public static void main(String args[]) {
        double a[][] = {{1, 2}, {3, 4}};
        double b[][] = {{6, 4}, {2, 2}};

        double[][] BInverse=Inverse(b);
        double res[][]=multiply(a,BInverse);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }
        public static double[][] Inverse ( double mat[][]){
            double determinant = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];

            if (determinant == 0) {
                return null;
            }
            double inverse[][] = new double[2][2];
            inverse[0][0] = mat[1][1] / determinant;
            inverse[0][1] = -mat[0][1] / determinant;
            inverse[1][0] = -mat[1][0] / determinant;
            inverse[1][1] = mat[0][0] / determinant;

            return inverse;
        }
        public static double[][] multiply ( double a[][], double b[][]){
            double m[][] = new double[2][2];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < 2; k++) {
                        m[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return m;
        }


}
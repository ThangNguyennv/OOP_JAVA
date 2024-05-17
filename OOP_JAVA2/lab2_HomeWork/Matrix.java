package lab2_HomeWork;

public class Matrix {

    public static void print(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void print(double[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static boolean haveSameDimension(int[][] matrix1, int[][]matrix2){
        if(matrix1.length == matrix2.length)
            return true;
        else
            return false;
    }
    public static boolean haveSameDimension(double[][] matrix1, double[][]matrix2){
        if(matrix1.length == matrix2.length)
            return true;
        else
            return false;
    }
    public static int[][] add(int[][] matrix1, int[][] matrix2){
        int newArr[][] = new int[matrix1.length][matrix1[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                newArr[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return newArr;
    }
    public static double[][] add(double[][] matrix1, double[][] matrix2){
        double newArr[][] = new double[matrix1.length][matrix1[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                newArr[row][col] = matrix1[row][col] + matrix2[row][col];
            }
        }
        return newArr;
    }
    public static int[][] substract(int[][] matrix1, int[][] matrix2){
        int newArr[][] = new int[matrix1.length][matrix1[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                newArr[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return newArr;
    }
    public static double[][] substract(double[][] matrix1, double[][] matrix2){
        double newArr[][] = new double[matrix1.length][matrix1[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                newArr[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return newArr;
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int newArr[][] = new int[matrix1.length][matrix2[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix2[0].length; col++){
                newArr[row][col] = 0;
                for(int idx = 0; idx < matrix1[0].length; idx++){
                    newArr[row][col] += matrix1[row][idx] * matrix2[idx][col];
                }
            }
        }
        return newArr;
    }
    public static double[][] multiply(double[][] matrix1, double[][] matrix2){
        double newArr[][] = new double[matrix1.length][matrix1[0].length];
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix2[0].length; col++){
                newArr[row][col] = 0;
                for(int idx = 0; idx < matrix1[0].length; idx++){
                    newArr[row][col] += matrix1[row][idx] * matrix2[idx][col];
                }
            }
        }
        return newArr;
    }

    public static void testArr(int[][] matrix1, int[][] matrix2){
        int sum[][] = add(matrix1, matrix2);
        for(int row = 0; row < sum.length; row++){
            for(int col = 0; col < sum[0].length; col++){
                System.out.print(sum[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int subStract[][] = substract(matrix1, matrix2);
        for(int row = 0; row < sum.length; row++){
            for(int col = 0; col < sum[0].length; col++){
                System.out.print(subStract[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int multy[][] = multiply(matrix1, matrix2);
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix2[0].length; col++){
                System.out.print(multy[row][col] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int a[][] = {
            {1,2,3},
            {4,5,6},
        };
        int b[][] = {
            {10,11},
            {20,22},
            {30,33}
        };
        testArr(a, b);

    }
}

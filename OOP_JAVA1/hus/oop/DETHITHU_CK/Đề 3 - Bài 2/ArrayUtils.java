import java.util.Scanner;
import java.util.*;
public class ArrayUtils {
    
    
	public static int[][] inputMatrix(Scanner reader){
		
		/*
		     Sử dụng biến reader ở trên để đọc dữ liệu từ bàn phím (không tạo biến Scanner mới)
		     Hàm thực hiện đọc số nguyên dương n, m từ bàn phím
		     Tạo ma trận mat với kích thước nxm
		     nhập vào n, m là kích thước hàng, cột trong ma trận
		     trả lại ma trận mat
		*/
		int n = reader.nextInt();
		int mat[][] = new int[n][n];
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++) {
		        mat[i][j] = reader.nextInt();
		    }
		}
		return mat;
	}
	
	/*
	    Hàm trả về giá trị lớn nhất trong ma trận mat.
	*/
	public static int findMax(int[][] mat){
	    int max = mat[0][0];
		for(int i = 0; i < mat.length; i++) {
		    for(int j = 0; j < mat[0].length; j++) {
		        if(mat[i][j] > max){
		            max = mat[i][j];
		        }
		    }
		}
		return max;
	}
	
	/*
	    Hàm trả về một mảng chỉ số các hàng có tổng lớn thứ hai trong ma trận.
	    Nếu không tồn tại hàng nào trả về giá trị null.
	*/
	public static int[] findRows(int[][] mat) {
	    int maxRow1 = Integer.MIN_VALUE;
	    int sum = 0;
	    int maxRow2 = Integer.MIN_VALUE;
	   
	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[0].length; j++) {
	            sum += mat[i][j];
	        }
	        if(sum > maxRow1){
	            maxRow1 = sum;
	        }
	        sum = 0;
	    }
	    sum = 0;
	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[0].length; j++) {
	            sum += mat[i][j];
	        }
	        if(sum != maxRow1 && sum > maxRow2){
	            maxRow2 = sum;
	        }
	        sum = 0;
	    }
	    //tim tong hang max thu 2
	    sum = 0;
	    int k = 0;
	    int cnt = 0;
	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[0].length; j++) {
	            sum += mat[i][j];
	        }
	        if(sum == maxRow2){
	            cnt++;
	        }
	        sum = 0;
	    }
	    int arrayRow [] = new int[cnt];
	    for(int i = 0; i < mat.length; i++) {
	        for(int j = 0; j < mat[0].length; j++) {
	            sum += mat[i][j];
	        }
	        if(sum == maxRow2){
	            arrayRow[k++] = i;
	        }
	        sum = 0;
	    }
		return arrayRow;
	}
	
	/*
	    Hàm in ma trận mat
	    Hàm này sinh viên không cần thay đổi 
	*/
	public static void printMatrix(int[][] mat) {
		if(mat == null) {
			System.out.println("NULL");
			return;
		}
	
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}

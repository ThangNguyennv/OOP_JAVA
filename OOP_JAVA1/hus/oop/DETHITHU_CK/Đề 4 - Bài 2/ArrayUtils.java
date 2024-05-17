import java.util.Scanner;

public class ArrayUtils {
    /*
		     Sử dụng biến reader ở trên để đọc dữ liệu từ bàn phím (không tạo biến Scanner mới)
		     Hàm thực hiện đọc số nguyên dương n, m từ bàn phím
		     Tạo ma trận mat với kích thước nxm
		     nhập vào n, m là kích thước hàng, cột trong ma trận
		     trả lại ma trận mat
	*/
	
	public static int[][] inputMatrix(Scanner reader){
	    int n = reader.nextInt();
	    int a[][] = new int[n][n];
	    for(int i = 0; i < n; i++){
	        for(int j = 0; j < n; j++){
	            a[i][j] = reader.nextInt();
	        }
	    }
		return a;
	}
	
	
	/*
	    Hàm tìm phần tử có giá trị nhỏ nhất trong ma trận
	 */
	public static int findMin(int[][] mat){
	    int min = mat[0][0];
		for(int i = 0; i < mat.length; i++){
		    for(int j = 0; j < mat[0].length; j++){
		        if(mat[i][j] < min)
		            min = mat[i][j];
		    }
		}
		return min;
	}
	
	/*
	    Hàm trả về một mảng chỉ số các cột có tổng lớn thứ hai trong ma trận.
	    Nếu không tồn tại cột nào có tổng lớn thứ hai thì trả về giá trị null
	*/
	public static int[] findColumns(int[][] mat) {
	    int max1 = Integer.MIN_VALUE;
	    int max2 = Integer.MIN_VALUE;
	    //tim max1
	    int sum = 0;
	    for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j < mat[0].length; j++){
	            sum += mat[j][i];
	        }
	        if(sum > max1)
	            max1 = sum;
	       sum = 0;
	    }
	    //tim max2
	    sum = 0;
	    for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j < mat[0].length; j++){
	            sum += mat[j][i];
	        }
	        if(sum != max1 && sum > max2){
	            max2 = sum;
	        }
	        sum = 0;
	    }
	    
	    //tim cot max thu 2
	    sum = 0;
	    int k = 0;
	    int cnt = 0;
	    
	    for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j < mat[0].length; j++){
	            sum += mat[j][i];
	        }
	        if(sum == max2)
	            cnt++;
	       sum = 0;
	    }
	    int arrayCollums[] = new int[cnt];
	    for(int i = 0; i < mat.length; i++){
	        for(int j = 0; j < mat[0].length; j++){
	            sum += mat[j][i];
	        }
	        if(sum == max2){
	            arrayCollums[k++] = i;
	        }
	       sum = 0;
	    }
	    
		return arrayCollums;
	}
	
	/*
	    Hàm in ma trận mat 
	    Hàm này sinh viên không cần chỉnh sửa
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

import java.util.*;
import java.io.*;
public class EmployeeManagement {
	
	/* 
	    Hàm nhập dữ liệu từ tệp và trả về một ArrayList danh sách các nhân viên
	    Biến fileName là tên tệp dữ liệu
	    Nhập n nhân viên từ tệp dữ liệu
	   
	*/
	public ArrayList<Employee> readData(String fileName){
	ArrayList<Employee> employee = new ArrayList<> ();
	try {
	    File file = new File(fileName);
	    Scanner sc = new Scanner(file);
	    int n = Integer.parseInt(sc.nextLine());
	    for(int i = 0; i < n; i++){
	        int index = Integer.parseInt(sc.nextLine()); //chiso o trong data
	        String id = sc.nextLine();
	        String name = sc.nextLine();
	        int age = Integer.parseInt(sc.nextLine());
	        String address = sc.nextLine();
	        double basicSalary = Double.parseDouble(sc.nextLine());
	        String email = sc.nextLine();
	        if(index == 1){
	            int no_test_equipments = Integer.parseInt(sc.nextLine());
	            double allowance = Double.parseDouble(sc.nextLine());
	            Technician tech = new Technician(id,name,age,address,basicSalary, email, no_test_equipments, allowance);
	            employee.add(tech);
	        }
	        else {
	            int no_customers = Integer.parseInt(sc.nextLine());
	            Marketer mar = new Marketer(id, name, age, address, basicSalary, email, no_customers);
	            employee.add(mar);
	        }
	        
	    }
	   sc.close();
	}
	catch (IOException e){
	    System.out.println("Error reading file");
	}
		return employee;
	}
	
	/*
	    In ra danh sách tất cả các nhân viên, mỗi nhân viên trên một hàng
	*/
	public void printInforEmployees(ArrayList <Employee> employees) {
		for(int i = 0; i < employees.size(); i++){
		    System.out.println(employees.get(i).toString());
		}
	}
	
	/*
	    Hàm trả về danh sách các kỹ thuật viên phụ trách lĩnh vực "field". 
	    Nếu không có trả về giá trị null
	*/
	public ArrayList <Employee> filterTech(ArrayList <Employee> employees, String fields){
	    ArrayList<Employee> result = new ArrayList<> ();
		for(int i = 0; i < employees.size(); i++){
		    if(employees.get(i).getClass().getSimpleName().equals("Technician")){
		        Technician tech = (Technician) employees.get(i);
		        if(tech.getField().equals(fields)){
		            result.add(tech);
		        }
		    }
		}
		return result;
	}
	
	/*
	    Hàm sắp xếp lương của nhân viên theo thứ tự tăng dần
	*/
	public void sortBySalary(ArrayList<Employee> arr_e){
		for(int i = 0; i < arr_e.size() - 1; i++){
		    for(int j = i + 1; j < arr_e.size(); j++){
		        if(arr_e.get(i).getSalary() > arr_e.get(j).getSalary()){
		            Employee tmp = arr_e.get(i);
		            arr_e.set(i, arr_e.get(j));
		            arr_e.set(j, tmp);
		        }
		    }
		}
	}
	
	/*
	    Hàm tìm những nhân viên tiếp thị có mức lương cao hơn mức lương cao nhất 
	    của các kỹ thuật viên. Yêu cầu kết quả đầu ra của nhân viên tiếp thị phải 
	    được sắp xếp theo thứ tự tăng dần của lương  
	*/
	public ArrayList <Employee> filterMarketerBySalary(ArrayList<Employee> employees){
		ArrayList<Employee> result = new ArrayList<>();
		double max = 0;
		for(int i = 0; i < employees.size(); i++){
		    if(employees.get(i).getClass().getSimpleName().equals("Technician")){
		        max = Math.max(max, employees.get(i).getSalary());
		    }
		}
		for(int i = 0; i < employees.size(); i++){
		    if(employees.get(i).getClass().getSimpleName().equals("Marketer")){
		        if(employees.get(i).getSalary() > max){
		            result.add(employees.get(i));
		        }
		    }
		}
		for(int i = 0; i < result.size()-1; i++){
		    for(int j = i + 1; j < result.size(); j++){
		        if(result.get(i).getSalary() > result.get(j).getSalary()){
		            Employee tmp = result.get(i);
		            result.set(i, result.get(j));
		            result.set(j, tmp);
		        }
		    }
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		EmployeeManagement st = new EmployeeManagement();
		ArrayList<Employee> staffs = st.readData("data.txt");
		st.printInforEmployees(staffs);
		
		ArrayList<Employee> arr_s = st.filterTech(staffs, "computer");
		st.printInforEmployees(arr_s);
		
		st.sortBySalary(staffs);
		st.printInforEmployees(staffs);
		
		ArrayList<Employee> arr_sp = st.filterMarketerBySalary(staffs);
		st.printInforEmployees(arr_sp);
	}
	
}

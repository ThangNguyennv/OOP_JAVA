import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StaffManagement {
    
    /* 
	    Hàm nhập dữ liệu từ tệp và trả về một ArrayList danh sách các nhân viên
	    Biến fileName là tên tệp dữ liệu
	    Nhập n nhân viên từ tệp dữ liệu
	   
	*/
	
	public ArrayList<Staff> readData(String fileName){
		ArrayList<Staff> staff = new ArrayList<> ();
		try{
		File file = new File(fileName);
		Scanner sc = new Scanner(file);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++){
		    int index = Integer.parseInt(sc.nextLine());
		    String id = sc.nextLine();
		    String name = sc.nextLine();
		    int age = Integer.parseInt(sc.nextLine());
		    int seniority = Integer.parseInt(sc.nextLine());
		    int basicSalary = Integer.parseInt(sc.nextLine());
		    String email = sc.nextLine();
		    if(index == 1){
		        int no_constructions = Integer.parseInt(sc.nextLine());
		        double reward = Double.parseDouble(sc.nextLine());
		        Architect architect = new Architect(id, name, age, seniority, basicSalary, email, no_constructions, reward);
		        staff.add(architect);
		    }
		    else {
		        int no_violates = Integer.parseInt(sc.nextLine());
		        Supervisor supervior = new Supervisor(id, name, age, seniority, basicSalary, email, no_violates);
		        staff.add(supervior);
		    }
		    
		}
		sc.close();
	}
	catch (IOException e){
	    System.out.println("Error reading file");
	}
		return staff;
	}
	
	
	/*
	    In ra danh sách tất cả các nhân viên, mỗi nhân viên trên một hàng
	*/
	public void printInforStaffs(ArrayList <Staff> staffs) {
		for(int i = 0; i < staffs.size(); i++){
		    System.out.println(staffs.get(i).toString());
		}
	}
	
	/*
	    Hàm trả về danh sách các kỹ thuật viên phụ trách chuyên môn "expertise". 
	    Nếu không có trả về giá trị null
	*/
	public ArrayList <Staff> filterExpert(ArrayList <Staff> staffs, String expertise){
		ArrayList<Staff> result = new ArrayList<> ();
		for(int i = 0; i < staffs.size(); i++){
		    if(staffs.get(i).getClass().getSimpleName().equals("Architect")){
		        Architect tech = (Architect) staffs.get(i);
		        if(tech.getExpertise().equals(expertise)){
		            result.add(tech);
		        }
		    }
		}		
		return result;
	}
	
	
	/*
	    Hàm sắp xếp lương của nhân viên theo thứ tự tăng dần
	*/
	public void sortBySalary(ArrayList<Staff> arr_s){
		for(int i = 0; i < arr_s.size() - 1; i++){
		    for(int j = i + 1; j < arr_s.size(); j++){
		        if(arr_s.get(i).getSalary() > arr_s.get(j).getSalary()){
		            Staff tmp = arr_s.get(i);
		            arr_s.set(i, arr_s.get(j));
		            arr_s.set(j, tmp);
		        }
		    }
		}
	}
	
	
	/*
	    Hàm tìm những nhân viên giám sát có mức lương cao hơn mức lương thấp nhất 
	    của các kiến trúc sư. Yêu cầu kết quả đầu ra của nhân viên giám sát phải 
	    được sắp xếp theo thứ tự giảm dần của lương. Nếu không có trả về giá trị null. 
	*/
	public ArrayList <Staff> filterSupervisorBySalary(ArrayList<Staff> staffs){
		ArrayList<Staff> result = new ArrayList<> ();
		double min = Integer.MAX_VALUE;
		for(int i = 0; i < staffs.size(); i++){
		    if(staffs.get(i).getClass().getSimpleName().equals("Architect")){
		        min = Math.min(min, staffs.get(i).getSalary());
		    }
		}
		for(int i = 0; i < staffs.size(); i++){
		    if(staffs.get(i).getClass().getSimpleName().equals("Supervisor")){
		        if(staffs.get(i).getSalary() > min){
		            result.add(staffs.get(i));
		        }
		    }
		}
		for(int i = 0; i < result.size() - 1; i++){
		    for(int j = i + 1; j < result.size(); j++){
		        if(result.get(i).getSalary() < result.get(j).getSalary()){
		            Staff tmp = result.get(i);
		            result.set(i, result.get(j));
		            result.set(j, tmp);
		        }
		    }
		}
		return result;
	}
	
	public static void main(String[] args) {
		StaffManagement st = new StaffManagement();
		ArrayList<Staff> staffs = st.readData("data.txt");
		st.printInforStaffs(staffs);
		
		ArrayList<Staff> arr_s = st.filterExpert(staffs, "adjacent villa");
		st.printInforStaffs(arr_s);
		
		ArrayList<Staff> arr_ex = st.filterExpert(staffs, "apartment");
		st.printInforStaffs(arr_ex);
		
		st.sortBySalary(staffs);
		st.printInforStaffs(staffs);
		
		ArrayList<Staff> arr_sp = st.filterSupervisorBySalary(staffs);
		st.printInforStaffs(arr_sp);
	}
	
}

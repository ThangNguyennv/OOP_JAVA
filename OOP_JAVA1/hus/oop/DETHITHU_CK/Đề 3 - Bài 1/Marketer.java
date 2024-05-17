

public class Marketer extends Employee {
	private int no_customers;
	// Hàm dựng
	public Marketer() {
		super();
	}
	
	// Hàm dựng

	public Marketer(String id, String name, int age, String address, double basicSalary, String email, int no_customers) {
		super(id, name, age, address, basicSalary, email);
		this.no_customers = no_customers;
	}

	public int getNo_customers() {
		return no_customers;
	}

	public void setNo_customers(int no_customers) {
		this.no_customers = no_customers;
	}
	
	/*
	    Sinh viên hoàn thiện phương thức getSalary() 
	*/
	@Override
	public double getSalary() {
	      /*
	        Lương của nhân viên tiếp thị = lương cơ bản + tiền thưởng hoa hồng 
	        (trong đó tiền thưởng hoa hồng = số lượng khách hàng mua sản phẩm *  250.000)
	    */
	    double tienHoaHong = this.no_customers * 250000;
	    double luongTiepThi = super.getBasicSalary() + tienHoaHong;
	    
		return luongTiepThi;
	}

	@Override
	public String toString() {
		return "Marketer [id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", address=" + getAddress() + ", basicSalary="
				+ getBasicSalary() + ", email=" + getEmail() + ", no_customers=" + no_customers + "]";
	}
	

}
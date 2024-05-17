
//nhan vien giam sat
public class Supervisor extends Staff {
	private int no_violates;
		
	public Supervisor() {
		super();
	}

	public Supervisor(String id, String name, int age,  int seniority, double basicSalary, String email, int no_violates) {
		super(id, name, age, seniority, basicSalary, email);
		this.no_violates = no_violates;
	}
	
	

	public int getNo_violates() {
		return no_violates;
	}

	public void setNo_violates(int no_violates) {
		this.no_violates = no_violates;
	}
	
		/*
	    Sinh viên hoàn thiện phương thức getSalary() trả về lương của nhân viên giám sát 
	*/
	@Override
	public double getSalary() {
	    
	     /*
	        Lương của nhân viên giám sát = lương cơ bản + thâm niêm * 200.000 + số lỗi phát hiện trong thiết kế *150.000 
	    */
		return super.getBasicSalary() + 200000*super.getSeniority() + 150000*this.no_violates;
	}

	@Override
	public String toString() {
		return "Supervisor [id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", seniority=" + getSeniority() + ", basicSalary="
				+ getBasicSalary() + ", email=" + getEmail() + ", no_violates=" + no_violates + "]";
	}
	
	

}
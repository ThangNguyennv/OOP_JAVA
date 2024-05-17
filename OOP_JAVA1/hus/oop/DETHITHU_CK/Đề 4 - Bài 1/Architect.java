
public class Architect extends Staff {
	private int no_constructions;
	private double reward;
	
	public Architect(String id, String name, int age, int seniority, double basicSalary
			, String email, int no_constructions, double reward) {
		super(id, name, age, seniority, basicSalary, email);
		this.no_constructions = no_constructions;
		this.reward = reward;
	}
	
	public Architect() {
		super();
	}

	public int getNo_constructions() {
		return no_constructions;
	}

	public void setNo_constructions(int no_constructions) {
		this.no_constructions = no_constructions;
	}

	public void setReward(double reward) {
		this.reward = reward;
	}
	
	public double getReward() {
		return reward;
	}

    /*
        Sinh viên hoàn thiện phương thức getExpertise() trả về lĩnh vực mà kiến trúc sư phụ trách
    */
    
	public String getExpertise() {
		
		/* Chuyên môn thiết kế của mỗi kiến trúc sư phụ trách được xác định dựa vào việc phân tích tên miền trong địa chỉ email của kiến trúc sư.  
		Ví dụ: 
			-	Địa chỉ email minhhtv@advl.cent.vn: kiến trúc sư phụ trách thiết kế biệt thự liền kề
			-	Địa chỉ emal: duongklv@apm.cent.vn: kiến trúc sư phụ trách thiết kế chung cư
		 */
		 String s = super.getEmail();
		 if(s.contains("@advl")) 
		    return "adjacent villa";
		 else 
		    return "apartment";
	
	}
	
	/*
	    Sinh viên hoàn thiện phương thức getSalary() trả về lương của kiến trúc sư
	*/
	@Override
	public double getSalary() {
	    /*
	        Lương của kiến trúc sư = lương cơ bản  + (số công trình đã hoàn thiện thiết kế + thâm niên)* 300.000 + tiền thưởng
	    */
	    
		return super.getBasicSalary() + 300000*(this.no_constructions + super.getSeniority()) + this.reward;
	}

	@Override
	public String toString() {
		return "Architect [id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", seniority=" + getSeniority() + ", basicSalary="
			+ getBasicSalary() + ", email=" + getEmail() + ", no_constructions=" + no_constructions + ", reward=" + reward + "]";
	}
	
	
	
}

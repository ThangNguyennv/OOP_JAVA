
public class Staff {
	private String id, name;
	private int age;
	private int seniority;
	private double basicSalary;
	private String email;
	
	public Staff() {
		
	}
	
	public Staff(String id, String name, int age, int seniority, double basicSalary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.seniority = seniority;
		this.basicSalary = basicSalary;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getSalary() {
		return basicSalary;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", age=" + age + ", seniority=" + seniority + ", basicSalary="
				+ basicSalary + ", email=" + email + "]";
	}
	
}

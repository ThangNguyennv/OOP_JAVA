import java.io.Serializable;

public class Computer implements Serializable {
    
    private static final long serialVersionUID = 12358903454875L;
    
	private String name;
	private String manu;
	private int year;
	private String detail;
	private double price;
	
	public Computer() {
	}
	
	public Computer(String name, String manu, int year, String detail, double price) {
		this.name = name;
		this.manu = manu;
		this.year = year;
		this.detail = detail;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getManu() {
		return manu;
	}
	public void setManu(String manu) {
		this.manu = manu;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " " + manu + " " + year + " " + detail + " "
				+ price;
	}
}

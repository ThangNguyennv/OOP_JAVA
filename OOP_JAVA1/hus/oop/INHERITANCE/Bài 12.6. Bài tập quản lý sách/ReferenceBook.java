public class ReferenceBook extends Book{	 
    
	private double tax;
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price) {
		super(id, name, quantity, publisher, price);
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price, double tax) {
	    super(id, name, quantity, publisher, price);
	    this.tax = tax;
	}
    
    public double getTax() {
		return this.tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	@Override
	public double getAmount() {
	    return super.getPrice() * super.getQuantity() + this.tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}
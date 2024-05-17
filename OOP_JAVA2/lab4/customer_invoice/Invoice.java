package lab4.customer_invoice;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }
    
    public int getID() {
        return this.id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public int getCustomerID() {
        return customer.getID();
    }
    
    public String getCustomerName() {
        return customer.getName();
    }
    
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    
    public double getAmountAfterDiscount() {
        return this.amount - (customer.getDiscount()/100.0)*this.amount;
    }
    
    public String toString() {
        return "Invoice[id=" + this.id + ",customer=" + customer.toString() + ",amount=" + this.amount + "]";
    }
}

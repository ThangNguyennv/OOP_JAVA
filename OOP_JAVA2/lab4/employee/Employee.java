package lab4.employee;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getName(){
        return this.firstname + " " + this.lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary*12;
    }
    public int raiseSalary(int percent){
        double increment = (percent*this.salary)/100;
        salary += increment;
        return salary;
    }
    public String toString(){
        return "Employee[id = " + this.id + ", name = " + getName() + ", salary=" + getSalary() + "]";
    }


    
    
}

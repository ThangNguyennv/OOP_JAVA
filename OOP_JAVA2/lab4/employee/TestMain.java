package lab4.employee;

public class TestMain {
    public static void main(String[] args) {
        // Test constructor and toString()
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1); //toString()

        //Test setters and getters
        employee1.setSalary(999);
        System.out.println(employee1); //toString()
        
        System.out.println("id is: " + employee1.getId());
        System.out.println("firstname is: " + employee1.getFirstname());
        System.out.println("lastname is: "+ employee1.getLastname());
        System.out.println("salary is: " + employee1.getSalary());
        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}

package lab4.customer_account;

public class TestMain {
   public static void main(String[] args) {

        //Test Customer class
        Customer customer1 = new Customer(001, "Peter", 'm');
        System.out.println(customer1);
        System.out.println("id is: " + customer1.getId());
        System.out.println("name is: " + customer1.getName());
        System.out.println("gender is: " + customer1.getGender());

        // Test Account class
        Account account1 = new Account(123, customer1, 100);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("Customer's name is: " + account1.getCustomerName());
        //Test deposit
        account1.deposit(100);
        System.out.println(account1);
        //Test withdraw
        account1.withdraw(50);
        System.out.println(account1);


   }
}

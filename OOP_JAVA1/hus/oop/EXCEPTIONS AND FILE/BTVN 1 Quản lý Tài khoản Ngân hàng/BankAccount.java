/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  

   private String accountNumber;
   private String firstName = "XXXX";
   private String lastName = "XXXX";
   private String password = "****";
   private double balance;
   
   /**
      Constructs a bank account with a zero balance
      @param anAccountNumber the account number for this account
   */
   public BankAccount(String anAccountNumber, String pass)
   {   
      accountNumber = anAccountNumber;
      password = pass;
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance
      @param anAccountNumber the account number for this account
      @param firstName, lastName, password
      @param initialBalance the initial balance
   */
   public BankAccount(String anAccountNumber, String firstName, String lastName, String password, double initialBalance)
   {   
      accountNumber = anAccountNumber;
      this.firstName = normalizeName(firstName);
      this.lastName = normalizeName(lastName);
      this.password = password;
      balance = initialBalance;
   }

    public static String normalizeName(String name){
        String str = name;
        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        char[] ch = str.toCharArray();
        
        ch[0] = Character.toUpperCase(ch[0]);
        
        for(int i = 1 ; i < ch.length; i++)
            if(ch[i-1] == ' ')
                ch[i] = Character.toUpperCase(ch[i]);
            else 
                ch[i] = Character.toLowerCase(ch[i]);
        
        return String.valueOf(ch);
    }

   /**
      Gets the account number of this bank account.
      @return the account number
   */
   public String getAccountNumber()
   {   
      return accountNumber;
   }

   public String getFirstName()
   {   
      return firstName;
   }
   
   public String getLastName()
   {   
      return lastName;
   }   
   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {  
      return balance; 
   }
   
   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

    public boolean setPassword(String oldPass, String newPass){
        boolean check = oldPass.equals(this.password);
        if(check)
            this.password = newPass;
        return check;    
    }
   
   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transfer(double amount, BankAccount other)
   {  
      withdraw(amount);
      other.deposit(amount);
   }
    
    public String toString(){
        
        return "AccountN."+accountNumber+"; Name: " + firstName+ " "+ lastName + 
                "; Balance: " + String.valueOf(balance);    
    }
}

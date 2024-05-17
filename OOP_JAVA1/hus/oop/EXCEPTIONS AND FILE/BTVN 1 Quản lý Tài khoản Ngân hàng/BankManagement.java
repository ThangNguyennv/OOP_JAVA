import java.util.*;
import java.io.*;

public class BankManagement{

    public static ArrayList<BankAccount> readData(String fName){
        
    /* Cần đọc dữ liệu từ tệp fName theo quy tắc: 
        Thông tin cho mỗi đối tượng đặt trên 01 dòng theo thứ tự:
        accountNumber, firstName, lastName, password, balance; 
        Nếu chữ số đầu của accountNumber là '1' thì coi là SavingsAccount
        và thông tin cuôi dòng là interestRate; ngược lại coi là CheckingAccount.
        Các trường cách nhau bởi ít nhất 01 khoảng trắng.
        Dùng try ... catch để xử lý ngoại lệ khi đọc tệp! Nếu không đọc được tệp cần hiển thị thông báo
        với đoạn đầu là: "Cannot open file" và phần tên tệp, các thông tin lỗi.
        Nếu thành công, trả về ArrayList các đối tượng đã đọc được.
        Bổ sung mã lệnh tương ứng - Có thể sửa giá trị trả về của return nhưng cần giữ nguyên kiểu trả về.
    */
    ArrayList<BankAccount> accounts = new ArrayList<> ();
    try {
        File file = new File(fName);
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNextLine()) {
            String[] fields = scanner.nextLine().trim().split("\\s+");
            if(fields.length == 5 || fields.length == 6) {
                String accountNumber = fields[0];
                String firstName = fields[1];
                String lastName = fields[2];
                String password = fields[3];
                double balance = Double.parseDouble(fields[4]);
                if(accountNumber.charAt(0) == '1'){
                    if(fields.length == 6){
                        double interestRate = Double.parseDouble(fields[5]);
                        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, firstName, lastName, password, balance, interestRate);
                        accounts.add(savingsAccount);
                    }
                }
                else {
                    CheckingAccount checkingAccount = new CheckingAccount(accountNumber, firstName, lastName, password, balance);
                    accounts.add(checkingAccount);
                }
            }
        }
        scanner.close();
    }
    catch (IOException e){
        System.out.println("Cannot open file " + fName + ". Error: " + e.getMessage());
    }
        return accounts;
    }


    public static void displayList(ArrayList<BankAccount> listAccount){

        /* Bổ sung mã lệnh để in xâu tương ứng trả về bởi toString() của mỗi đối tượng
            chú ý phương thức cần thực hiện được với cả SavingsAccount và CheckingAccount
            và thông tin tương ứng cho mỗi trường hợp */
        for(int i = 0; i < listAccount.size(); i++){
            System.out.println(listAccount.get(i).toString());
        }
    }

    public static ArrayList<BankAccount> listOfSavingsAccount(ArrayList<BankAccount> listAccount){
        ArrayList<BankAccount> listSavingsAccount = new  ArrayList<BankAccount>();
        // Bổ sung mã lệnh để tách các SavingsAccount từ listAccount ra thành một ArrayList riêng 
        for(int i = 0; i < listAccount.size(); i++){
            if(listAccount.get(i).getClass() == SavingsAccount.class){
                listSavingsAccount.add(listAccount.get(i));
                listAccount.remove(i);
                i--;
            }
        }
        
        return listSavingsAccount;
    }

    public static ArrayList<BankAccount> listOfCheckingAccount(ArrayList<BankAccount> listAccount){
        ArrayList<BankAccount> listCheckingAccount = new  ArrayList<BankAccount>();
        // Bổ sung mã lệnh để tách các CheckingAccount từ listAccount ra thành một ArrayList riêng 
        for(int i = 0; i < listAccount.size(); i++){
            if(listAccount.get(i).getClass() == CheckingAccount.class){
                listCheckingAccount.add(listAccount.get(i));
                listAccount.remove(i);
                i--;
            }
        }
        return listCheckingAccount;
    }

    public static void sortByBalance(ArrayList<BankAccount> listAccount){
    
        // Bổ sung mã lệnh để sắp xếp listAccount theo thứ tự tăng dần của balance
        for(int i = 0; i < listAccount.size()-1; i++){
            for(int j = i + 1; j < listAccount.size(); j++){
                if(listAccount.get(i).getBalance() > listAccount.get(j).getBalance()){
                    BankAccount tmp = listAccount.get(i);
                    listAccount.set(i, listAccount.get(j));
                    listAccount.set(j, tmp);
                }
            }
        }
    }

    public static void saveToFile(ArrayList<BankAccount> listAccount, String fileName){
        Formatter fOut = null;

        try{
            
            /* Bổ sung mã lệnh để mở tệp fileName và ghi thông tin các Account trong listAccount vào tệp
                Thông tin được ghi trên từng dòng cho mỗi trường theo thứ tự: accountNumber, firstName, lastName, 
                balance (2 chữ số phần thập phân), sau đó nếu là SavingsAccount thì thêm interestRate, ngược lại 
                thêm transactionCount.
               + Mẫu thông tin ghi cho SavingsAccount cần tương đương với:
                    format("%s%n%s %s%n%.2f%n%.3f%n", accountNumber, firstName, lastName, balance, interestRate);
                
               + Mẫu thông tin ghi cho CheckingAccount cần tương đương với:
                    format("%s%n%s %s%n%.2f%n%d%n", accountNumber, firstName, lastName, balance,transactionCount);*/
        fOut = new Formatter(fileName);
        for(BankAccount account : listAccount){
            if(account.getClass().getSimpleName().equals("SavingsAccount")){
                SavingsAccount i = (SavingsAccount) account;
                fOut.format("%s%n%s %s%n%.2f%n%.3f%n", i.getAccountNumber(), i.getFirstName(), i.getLastName(), i.getBalance(), i.getInterestRate());
            }
            else if(account.getClass().getSimpleName().equals("CheckingAccount")){
                CheckingAccount i = (CheckingAccount) account;
                fOut.format("%s%n%s %s%n%.2f%n%d%n", i.getAccountNumber(), i.getFirstName(), i.getLastName(), i.getBalance(), i.getTransactionCount());
            }
        }
        fOut.close();
        } catch(IOException e){
            // In ra thông báo: "Cannot access file " + fileName + " to write!\n" + e.getMessage()
            System.out.println("Cannot access file " + fileName + " to write!\n" + e.getMessage());
        }
    }

    public static ArrayList<BankAccount> filterByBalance(ArrayList<BankAccount> listAccount,double upperBound, double lowerBound){
        

        // Bổ sung mã lệnh để trả về danh sách các account có balance lớn hơn hoặc bằng
        // lowerBound và nhỏ hơn hoặc bằng upperBound (gồm cả 2 loại account)
        ArrayList<BankAccount> results = new ArrayList<> ();
        for(BankAccount account : listAccount){
            double balance = account.getBalance();
            if(balance >= lowerBound && balance <= upperBound){
                results.add(account);
            }
        }
        return results;
    }

    public static BankAccount searchByAccountNumber(ArrayList<BankAccount> listAccount, String accountNum){
        BankAccount result  = null;

        // Bổ sung mã lệnh để tìm và trả về đối tượng trong danh sách listAccount có accountNumber trùng với accountNum.
        // Nếu không có trả về null.
        for(BankAccount account : listAccount){
            if(account.getAccountNumber().equals(accountNum)){
                return account;
            }
        }

        return result;
    }

    public static void main(String args[]){
            ArrayList<BankAccount> listAccount = readData("data.txt");
            // Không cần thay đổi phương thức main()!
     }
}

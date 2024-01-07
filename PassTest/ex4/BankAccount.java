public class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}
/*Person（人）House（房子）和BankAccount（銀行帳
戶）。每個類別都應該具有以下屬性：

Person類別
姓名（name）
年齡（age）屬性。

House類別
擁有地址（address）
價格（price）屬性。

BankAccount類別
帳戶號碼（account_number）
和餘額 balance
*/
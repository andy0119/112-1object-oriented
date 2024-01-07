public class Person{
    private String name;
    private House house;
    private int age;
    private BankAccount bankAccount;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public House getHouse(){
        return this.house;
    }

    public void setHouse(House house){
        this.house = house;
    }

    public BankAccount getBankAccount(){
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount){
        this.bankAccount = bankAccount;
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

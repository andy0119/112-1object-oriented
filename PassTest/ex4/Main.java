public class Main{
    public static void main(String[] args){
        Person person = new Person("XZP", 19);//名字和年齡
        House house = new House("NCUT", 23924505);//地址和價格
        BankAccount bankAccount = new BankAccount("567888", 88888888);//帳戶和餘額
        person.setBankAccount(bankAccount);

        if (isAffordable(person, house)){
            buyHouse(person, house);
        }

        sellHouse(person);
    }

    public static void buyHouse(Person person, House house){
        double price = house.getPrice();
        BankAccount bankAccount = person.getBankAccount();
        double balance = bankAccount.getBalance();

        if (balance >= price) {
            bankAccount.setBalance(balance - price);
            person.setHouse(house);
            System.out.println(person.getName() + " 買了房子在" + house.getAddress());
        } else {
            System.out.println("餘額不夠買房子"+ house.getAddress());
        }
    }

    public static void sellHouse(Person person){
        House house = person.getHouse();
        if (house != null) {
            BankAccount bankAccount = person.getBankAccount();
            double price = house.getPrice();
            bankAccount.setBalance(bankAccount.getBalance() + price);
            person.setHouse(null);
            System.out.println(person.getName() + " 賣掉了房子 " + house.getAddress());
        } else {
            System.out.println(person.getName() + " 沒有房子可賣"+ house.getAddress());
        }
    }

    public static boolean isAffordable(Person person, House house){
        double price = house.getPrice();
        BankAccount bankAccount = person.getBankAccount();
        double balance = bankAccount.getBalance();

        return balance >= price;
    }
}

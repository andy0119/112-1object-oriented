import java.util.Scanner;

public class test15{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        int itemCount = 0;

        System.out.println("請輸入項目數量: ");
        int items = scanner.nextInt();
        
        for(int i = 1; i <= items; i++){ 
            System.out.println("第"+ i +"項價格");
            double Price = scanner.nextDouble();
            totalPrice += Price;
            itemCount++;
        }
        if ( totalPrice >= 1000){
            totalPrice= totalPrice*0.9;
        }
        System.out.println("總金額"+ totalPrice + "元");
        System.out.println("平均"+ totalPrice/items + "元");
    }
}
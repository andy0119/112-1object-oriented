import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double unitPrice = 500; // 商品單價
        System.out.print("請輸入購買數量: ");
        int quantity = scanner.nextInt();

        double totalPrice;

        if (quantity >= 10) {
            // 十件七折
            totalPrice = unitPrice * quantity * 0.7;
        } else if (quantity >= 5) {
            // 五件八五折
            totalPrice = unitPrice * quantity * 0.85;
        } else if (quantity >= 3) {
            // 三件九折
            totalPrice = unitPrice * quantity * 0.9;
        } else {
            // 不滿三件不打折
            totalPrice = unitPrice * quantity;
        }

        System.out.println("總價格為: " + totalPrice + "元");

        scanner.close();
    }
}

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner xzp = new Scanner(System.in);
        
        System.out.print("輸入第一個數: ");
        int num1 = xzp.nextInt();
        
        System.out.print("輸入第二個數: ");
        int num2 = xzp.nextInt();
        
        if (num1 > num2) {
            System.out.println("最大的數是: " + num1);
        }
        else if (num2 > num1) {
            System.out.println("最大的數是: " + num2);
        } 
    }
}

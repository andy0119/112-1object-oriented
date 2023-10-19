import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double total = 0;
        System.out.println("請輸入: ");

        
        for(int i = 1; i <= 7; i++){ 
            System.out.println("第"+ i +"天跑多少公里");
            double distance = scanner.nextDouble();
            total += distance;
            
        }
        System.out.println("一周跑"+ total + "公里");
        System.out.println("平均跑"+ total/7 + "公里");
    }
}
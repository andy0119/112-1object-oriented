import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double btc = 500;

        System.out.print("購買數量 :");
        int num1 = scanner.nextInt();

        double total;

        if (num1 >= 10){
            total= btc*num1*0.7;
        }
        else if (num1 >= 5){
            total= btc*num1*0.85;
        }   
        else if (num1 >= 3){
            total= btc*num1*0.9;
        }
        else{
            total= btc*num1;
        }
        System.out.println("total is NT " + total);   
    }
}

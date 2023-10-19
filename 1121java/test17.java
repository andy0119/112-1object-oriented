import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("請猜1到100的整數");
        do {
            System.out.println("請輸入你猜的數字");
            guess = scanner.nextInt();

            if (guess < number)
                System.out.println("太低");
            else if (guess > number)
                System.out.println("太高");
            else
                System.out.println("猜對了");
        } while (guess != number);
        scanner.close();
    }
}

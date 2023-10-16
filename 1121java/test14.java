import java.util.Scanner;

public class test14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("輸入矩陣長度");
        a = input.nextInt();
        for (int i=1;i<=a;i++){	     
            for (int j=1;j<=a;j++)
            if(i==1 || j==1 || i==a || j==a || i==j || i==a-j+1){
                System.out.printf("* ");
            }
            else{
                System.out.printf("  ");
            }
            System.out.println(); 
        }
    }
}
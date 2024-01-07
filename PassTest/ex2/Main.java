import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        List<Vehicle> vehicles = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("請選擇一個操作：");
            System.out.println("1.添加新的交通工具");
            System.out.println("2.顯示所有交通工具");
            System.out.println("3.對特定交通工具進行啟動或停止操作");
            System.out.println("4.離開系統");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.println("請選擇要添加的交通工具類型:1.Car 2.Bicycle");
                    int type = scanner.nextInt();
                    if (type == 1) {
                        vehicles.add(new Car());
                    } else if (type == 2) {
                        vehicles.add(new Bicycle());
                    }
                    break;
                case 2:
                    for (int i = 0; i < vehicles.size(); i++){
                        System.out.println((i + 1) + ". " + vehicles.get(i).getClass().getSimpleName());
                    }
                    break;
                case 3:
                    System.out.println("選擇操作交通工具編號：");
                    int index = scanner.nextInt();
                    System.out.println("選擇操作: 1.啟動 2.停止");
                    int action = scanner.nextInt();
                    if (action == 1) {
                        vehicles.get(index - 1).start();
                    } else if (action == 2) {
                        vehicles.get(index - 1).stop();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}

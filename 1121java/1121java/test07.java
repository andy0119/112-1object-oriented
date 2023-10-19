//作業一 累計儲蓄計算
public class test07 {
    public static void main(String[] args) {
        int sum, i; //宣告整數
        int total = 0; //宣告金額為 0
        int day = 0; // 宣告天數為 0

        for(i = 0; i < 365; i++){ 
            total += 10; // 在迴圈中 每天+10到total中
        }
        System.out.println("一年存的錢是" + total + "元"); //輸出一年存款

        for(sum = total; sum <= 5000; sum += 10){
            day++; // 在每次迴圈天數+1
        }
        System.out.println("再" + day + "天存款會超過5000元");//輸出再天存款會超過5000元
    }
}

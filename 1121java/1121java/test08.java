import java.util.Scanner;
//作業二 成績統計
public class test08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//建立Scanner物件來輸入

        int count = 0;//定義成績總數
        int total = 0;//定義成績總和
        int num = 0;//定義輸入成績
        int HighGrade = 0;//定義最高分
        int LowGrade = 100;//定義最低分

        do {
            System.out.println("輸入多個成績:");
            num = input.nextInt(); //讀取輸入

            if (num != -1) { //!=等於不等於
                total += num; //num加到total
                count++; //計數器
            }
            
            System.out.println("輸入-1停止輸入成績");
            if (num > HighGrade)//如果輸入成績大於最高分
                HighGrade = num;//取代分數
            if (num < LowGrade & num != -1)//如果輸入的成績小於最低分跟-1
                LowGrade = num;//取代分數
        } 
        while (num != -1);//當輸入的成績不是-1繼續迴圈

        total = total / count;//計算平均分數

        System.out.println("平均分" + total);//輸出平均分數
        System.out.println("最高分" + HighGrade);//輸出最高分
        System.out.println("最低分" + LowGrade);//輸出最低分
    }
}

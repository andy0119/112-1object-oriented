import java.util.Scanner;
//作業三 打折活動
public class test09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//建立Scanner物件來輸入

        int book = 290;//書價格為290
        double sum;//書跟價格相乘
        int Total;//書總數

        System.out.println("請輸入購書的總數:");
        Total = input.nextInt();//讀取輸入

        if (book >= 7) { //買7本或以上
            sum = (book * Total) * 0.8;//書跟價格相乘*0.8
        }
        else if (Total == 5) { //買5本
            sum = (book * Total) * 0.85;//書跟價格相乘*0.85
        } 
        else if (Total == 3) { //買3本
            sum = (book * Total) * 0.9;//書跟價格相乘*0.9
        } 
        else
            sum = book * Total;//3以下就直接算書跟價格相乘

        System.out.println("總價 = " + sum); //輸出總價格
    }
}

/*
已知男生標準體重=(身高-80)*0.7；女生標準體重=(身高-70)*0.6；
試寫一程式由使用者處得到性別、身高之數據後，輸出其標準體重。
*/

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        /*
        System.out.println("請使用者得輸入性別之代號，0代表女性，1代表男性");
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        System.out.println("請使用者得輸入身高");
        int height = sc.nextInt();

        double SW; // 宣告一個資料型態為double的變數SW
        if(gender==0){ // 女性
            SW=(height-70)*0.6;
            System.out.println("標準體重為" + SW + "kg");
        }else if(gender==1){ // 男性
            SW=(height-80)*0.7;
            System.out.println("標準體重為" + SW + "kg");
        }else{
            System.out.println("性別代號輸入錯誤，請重新輸入");
        }

        // 以上代碼有問題
        // 萬一性別輸入錯誤還是會要被要求輸入身高，要最後才判別性別輸入錯誤，邏輯很奇怪...所以應該要先判斷性別是否輸入正確
        */

        System.out.println("請輸入性別代號，0 代表女性，1 代表男性:");
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        // 先檢查性別是否有效
        if (gender != 0 && gender != 1) {
            System.out.println("輸入錯誤，請重新輸入性別之代號");
        } else {
            System.out.println("請輸入身高（cm）:");
            int height = sc.nextInt();

            double SW; // 使用 double 儲存浮點數結果
            if (gender == 0) { // 女性
                SW = (height - 70) * 0.6;
            } else { // 男性
                SW = (height - 80) * 0.7;
            }
            System.out.println("標準體重為: " + SW + " kg");
        }
        sc.close(); // 關閉 Scanner，避免資源浪費
    }
}
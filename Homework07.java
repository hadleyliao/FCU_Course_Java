/*
請設計一簡易整數計算機程式，程式從使用者得到兩個數字，並讓使用者選擇要進行哪一個四則運算操作，
最後輸出計算結果。(請注意除法的除0以及小數點問題)
*/

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("請使用者得輸入第一個數字");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("請使用者得輸入第二個數字");
        int n2 = sc.nextInt();
        System.out.println("要進行哪一個四則運算? 加(輸入1)、減(輸入2)、乘(輸入3)、除(輸入4)");
        int n3 = sc.nextInt();

        if(n3==1){  // 加
            System.out.println("相加結果:"+(n1+n2));
        }else if(n3==2){ // 減
            System.out.println("相減結果:"+(n1-n2));
        }else if(n3==3){ // 乘
            System.out.println("相乘結果:"+(n1*n2));
        }else if(n3==4){ // 除
            if (n2 == 0) {
                System.out.println("輸入錯誤，除數不能為 0");
            } else {
                System.out.println("相除結果:"+((float)n1/n2)); // 前面加上(float)強制轉型成浮點數，確保結果有小數
            }
        } else {
            System.out.println("輸入錯誤，請重新輸入四則運算之代號");
        }
        sc.close();  // 關閉 Scanner，避免資源浪費
    }
}

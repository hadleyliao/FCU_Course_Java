/*
請設計一簡易整數計算機程式，程式從使用者得到兩個數字，並讓使用者選擇要進行哪一個四則運算操作，
最後輸出計算結果。(請注意除法的除0以及小數點問題)
*/

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] args) {
        /*
        // 把加減乘除改為數字代號
        System.out.print("請輸入第一個數字: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("請輸入第二個數字: ");
        int n2 = sc.nextInt();
        System.out.print("要進行哪一個四則運算? 加(輸入1)、減(輸入2)、乘(輸入3)、除(輸入4): ");
        int n3 = sc.nextInt();

        if(n3 == 1){  // 加
            System.out.println("相加結果: "+(n1+n2));
        }else if(n3 == 2){ // 減
            System.out.println("相減結果: "+(n1-n2));
        }else if(n3 == 3){ // 乘
            System.out.println("相乘結果: "+(n1*n2));
        }else if(n3 == 4){ // 除
            if (n2 == 0) { // 除數為0
                System.out.println("輸入錯誤，除數不能為 0");
            } else {
                System.out.println("相除結果: "+((double)n1/n2)); // 相除可能會有小數點產生，前面加上(double)強制轉型成浮點數，確保結果有小數
            }
        } else {
            System.out.println("輸入錯誤，請重新輸入四則運算之代號");
        }
        */



        // 直接用加減乘除
        System.out.print("請輸入第一個數字: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("請輸入第二個數字: ");
        int n2 = sc.nextInt();
        System.out.print("要進行哪一個四則運算? 加、減、乘、除: ");
        String operation = sc.next(); // Java 中應該使用 next() 或 nextLine() 來讀取字串

        if(operation.equals("加")){  // 加 // Java 中，字串比較不能使用 ===，應改為 .equals()
            System.out.println("相加結果: "+(n1+n2));
        }else if(operation.equals("減")){ // 減
            System.out.println("相減結果: "+(n1-n2));
        }else if(operation.equals("乘")){ // 乘
            System.out.println("相乘結果: "+(n1*n2));
        }else if(operation.equals("除")){ // 除
            if (n2 == 0) { // 除數為0
                System.out.println("輸入錯誤，除數不能為 0");
            } else {
                System.out.println("相除結果: "+((double)n1/n2)); // 相除可能會有小數點產生，前面加上(double)強制轉型成浮點數，確保結果有小數
            }
        } else {
            System.out.println("輸入錯誤，請重新輸入四則運算");
        }
        sc.close(); // 關閉 Scanner，避免資源浪費
    }
}

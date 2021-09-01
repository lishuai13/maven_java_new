package writtenExamination.demo4;

import java.util.Scanner;

/**
 * 贩卖机，会找零的那种
 */
public class One {
    static int buyCoke(int m, int a, int b, int c, int x) {

        int[] money = {10,50,100};
        int[] number = {a,b,c};
        int numbers=0;
        for (int k = 0; k < m; k++) {
            int price = x;
            for (int i = 2; i>=0; i--){
                if (price<=0)
                    break;
                int n = Math.min(price/money[i]+1,number[i]);
                numbers+=n;
                number[i]=number[i]-n;
                price-=money[i]*n;
                //找零
                if (price<0){
                    int x1=-price;
                    for (int j = 2; j>=0; j--){
                        if (x1<=0)
                            break;
                        int n1 = x1/money[j];
                        number[j]=number[j]+n1;
                        x1-=n1*money[j];
                    }
                }
            }
        }
        return numbers;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _a;
        _a = Integer.parseInt(in.nextLine().trim());

        int _b;
        _b = Integer.parseInt(in.nextLine().trim());

        int _c;
        _c = Integer.parseInt(in.nextLine().trim());

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

        res = buyCoke(_m, _a, _b, _c, _x);

        System.out.println(String.valueOf(res));

    }
}

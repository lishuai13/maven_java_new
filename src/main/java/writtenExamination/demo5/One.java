package writtenExamination.demo5;


import java.util.Scanner;

/**
 * 将整数分解成素数的乘积
 */
public class One {
    //n代表需要输入的正整数
    static int n;
    static int k = 2; //最小素数

    public static void main(String[] args) {
        System.out.print("请输入一个大于2的正整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        f(n);

    }
    public static void f(int n){
        while (n>=k){
            if(n==k){
                System.out.print(n);
                break;
            }else if(n % k == 0){
                System.out.print(k + "*");
                n = n/k;
                f(n);
                break;
            }else if (n % k != 0){
                k++;
                f(n);
                break;
            }
        }
    }
}


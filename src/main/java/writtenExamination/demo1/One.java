package writtenExamination.demo1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt()+20;
        }
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }

        int[] array = new int[41];
        for (int i = 0; i < n; i++) {
            array[x[i]]=s[i];
        }
    }
}

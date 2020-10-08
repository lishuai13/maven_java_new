package writtenExamination.demo1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n= sc.nextInt();

            int[] x = new int[n];
            for (int j = 0; j < n; j++) {
                x[j] = sc.nextInt();
            }
            int[] y = new int[n];
            for (int j = 0; j < n; j++) {
                y[j] = sc.nextInt();
            }

            int min=x[0];
            int[] sort = new int[n];
            int j=0;
            for (int k = 1; k < n; k++) {
                if (x[k]<min){
                    min=x[k];
                    sort[j++]=k;
                }
            }

            int min1=y[0];
            int[] sort1 = new int[n];
            int j1=0;
            for (int k = 1; k < n; k++) {
                if (y[k]<min1){
                    min1=y[k];
                    sort1[j1++]=k;
                }
            }

            if (sort==sort1){
                System.out.println(sort.length);
            }
        }
    }
}

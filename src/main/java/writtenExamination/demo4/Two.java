package writtenExamination.demo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 司机调度问题
 */
public class Two {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] incomeOfA= new int[10];
        int[] incomeOfB= new int[10];
        int i= 0;
        int j= 0;
        while (cin.hasNext()) {
            String s = cin.nextLine();
            if (s.equals("#"))
                break;
            String[] s1 = s.split(" ");
            incomeOfA[i++] = Integer.parseInt(s1[0]);
            incomeOfB[j++] = Integer.parseInt(s1[1]);
        }
        //得到长度
        int length=0;
        while (incomeOfA[length]!=0){
            length++;
        }
        int money = 0;
        List<Integer> list= new ArrayList<>();
        for (int i1 = 0; i1 < length; i1++) {
            list.add(incomeOfA[i1]);
        }
        for (int i1 = 0; i1 < length; i1++) {
            list.add(incomeOfB[i1]);
        }

        int flag =0;
        int max = list.get(0);
        for (int k = 0; k < list.size(); k++) {
            if (list.get(k)>max){
                max=list.get(k);
                flag=k;
            }
        }
        money+=max;
        if (flag>list.size()/2){
            list.remove(flag);
            list.remove(flag-list.size()/2);
        }
    }
}

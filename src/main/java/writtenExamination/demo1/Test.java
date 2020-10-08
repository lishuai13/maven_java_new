package writtenExamination.demo1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] split = str.split(",");
        int[] number = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            number[i] = Integer.parseInt(split[i]);
        }
        int length = number.length;

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int k=0;
            for (int j = i+1; j < length; j++) {
                if (number[i]==number[j])
                    k++;
            }
            if (k==1)
                result.append(number[i]).append(" ");
        }
        result.append('\b');
        String s = result.toString();
        System.out.println(s);
    }
}


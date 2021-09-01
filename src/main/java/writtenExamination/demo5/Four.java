package writtenExamination.demo5;

import java.util.HashMap;
import java.util.Map;

public class Four {
    public static void main(String[] args) {
        int[] arr={1,2};
        final boolean b = new Four().uniqueOccurrences(arr);
        System.out.println(b);

    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int value : arr) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        boolean flag = true;
        for (Map.Entry<Integer, Integer> next1 : map.entrySet()) {
            Integer value1 = next1.getValue();
            int num = 0;
            for (Map.Entry<Integer, Integer> next2 : map.entrySet()){
                Integer value2 = next2.getValue();
                if (value1.equals(value2)){
                    num++;
                }
            }
            if (num>=2){
                flag=false;
                break;
            }
        }
        return flag;
    }

}

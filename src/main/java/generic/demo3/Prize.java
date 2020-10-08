package generic.demo3;

import java.util.ArrayList;

/**
 * 泛型方法，带有泛型列表，独立于所在的泛型类，不受泛型类的约束
 */
public class Prize{

    public  <E> E getPrize(ArrayList<E> list){
        return list.get((int) (Math.random() * list.size()));
    }

    public static void main(String[] args) {

        Prize prize = new Prize();
        //调用方法传入类型String
        ArrayList<String>strList = new ArrayList<>();
        strList.add("苹果手机");
        strList.add("华为手机");
        strList.add("奥里给");

        String result = prize.getPrize(strList);
        System.out.println(result);

        //调用方法传入类型Integer
        ArrayList<Integer>intList = new ArrayList<>();
        intList.add(1000);
        intList.add(2000);
        intList.add(3000);

        int result1 = prize.getPrize(intList);
        System.out.println(result1);

    }
}

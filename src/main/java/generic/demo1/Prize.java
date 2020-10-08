package generic.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 奖品泛型类
 */
public class Prize<T>{

    private T prize;
    private List<T>list = new ArrayList<>();

    void addPrize(T t){
        list.add(t);
    }

    T getPrize(){
        prize = list.get((int) (Math.random() * list.size()));
        return prize;
    }
}

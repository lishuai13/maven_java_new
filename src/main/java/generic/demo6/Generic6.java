package generic.demo6;

/**
 * 泛型类
 */
public class Generic6<T extends Number> {

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    //泛型方法
    public <E extends Number> E show(E e){
        System.out.println(e);
        return e;
    }
}

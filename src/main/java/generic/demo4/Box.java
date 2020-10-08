package generic.demo4;

/**
 * 泛型类
 * @param <T>
 */
public class Box<T>{

    private T key;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}

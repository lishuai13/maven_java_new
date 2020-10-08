package generic.demo2;

/**
 * 泛型接口
 */
public interface GenericInterface<T> {
    T getKey();
}

/**
 * 实现类不是泛型类，需要指明继承的类型，默认是Object类型
 */
class Test1 implements GenericInterface<String>{

    @Override
    public String getKey() {
        return "泛型接口";
    }

    public static void main(String[] args) {
        Test1 test1 =new Test1();
        String result = test1.getKey();
        System.out.println(result);
    }
}

/**
 * 实现类是泛型类，则需要与父类泛型类型保持一致，可以扩展额外的泛型类型。
 * @param <T>
 * @param <V>
 */
class Test2<T,V> implements GenericInterface<T>{

    private T key;
    private V value;

    public Test2(T key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public T getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }

    public static void main(String[] args) {

        Test2<Integer,String>test2 = new Test2<>(560111,"李帅");
        System.out.println(test2.getKey()+" "+test2.getValue());
    }
}

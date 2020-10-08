package generic;

/**
 * 泛型类
 * @param <T>
 *     T为形参类型名
 */
public class MyGeneric<T> {

    private T key;

    public MyGeneric(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "MyGeneric{" +
                "key=" + key +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        //实参传入String
        MyGeneric<String>strGeneric = new MyGeneric<>("abc");
        System.out.println(strGeneric.getKey());

        System.out.println("----------------------------------");

        //实参传入Integer
        MyGeneric<Integer>intGeneric = new MyGeneric<>(123);
        System.out.println(intGeneric.getKey());

        System.out.println("----------------------------------");

        //实参默认是Object
        MyGeneric myGeneric = new MyGeneric(true);
        Object key = myGeneric.getKey();
        System.out.println(key);
    }
}

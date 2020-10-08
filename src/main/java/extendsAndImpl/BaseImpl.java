package extendsAndImpl;

/**
 * 爷爷的实现方法
 */
public class BaseImpl implements Base {
    @Override
    public void test() {
        System.out.println("Base的方法实现了");
    }
}

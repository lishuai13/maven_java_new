package extendsAndImpl;

/**
 * 儿子的实现方法
 */
public class BaseSonImpl extends BaseImpl implements BaseSon  {

    //这里重写了父类的方法，如果不重写就相当于只有super.test();
    @Override
    public void test() {
        System.out.println("BaseSon附加的字段");
        super.test();
    }
}

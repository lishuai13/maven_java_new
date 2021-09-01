package extendsTest.demo4;

/**
 * 子类
 */
public class Son  extends Father{

    public Son() {
        add(2);
    }

    @Override
    public void add(int v) {
        i+=2*v;
    }

    public static void main(String[] args) {
        Father father = new Son();
        father.add(8);
        father.print();
    }
}

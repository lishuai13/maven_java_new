package extendsTest.demo2;

public class SonImpl implements Son {
    @Override
    public void test() {
        System.out.println(Father1.id);
    }

    public static void main(String[] args) {
        new SonImpl().test();
    }
}

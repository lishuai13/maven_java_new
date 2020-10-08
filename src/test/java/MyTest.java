import org.junit.Test;

public class MyTest
{
    static int i =20;
    @Test
    public void test(){
        MyTest test = new MyTest();
        test.i++;
        MyTest test1 = new MyTest();
        test1.i++;
        MyTest.i++;
        System.out.println(i);
    }
}

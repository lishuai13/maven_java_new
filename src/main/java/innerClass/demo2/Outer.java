package innerClass.demo2;

/**
 * 成员内部类
 */
public class Outer {
    private int id = 1;
    public void out(){
        System.out.println("外部类方法");
    }
    public void test(){

    }

    public static class Inner{
        private int id = 2;

        public static void in(){
            System.out.println("内部类方法");
        }

        public void get(){
            Outer outer = new Outer();
            System.out.println(id);

        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();

    }
}

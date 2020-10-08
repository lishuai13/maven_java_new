package innerClass.demo1;

/**
 * 成员内部类
 */
public class Outer {
    private int id = 1;
    public void out(){
        System.out.println("外部类方法");
    }

    public class Inner{
        private  int id = 2;

        public  void in(){
            System.out.println("内部类方法");
        }

        public void get(){
            Outer outer = new Outer();
            System.out.println(id);
            out();
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.new Inner();
        inner.get();
    }
}

package parameter;

/**
 * 参数传递之值传递
 */
public class ParamPass1 {
    public static void main(String[] args) {
        ParamPass1 p = new ParamPass1();
        int i = 10;
        System.out.println("pass方法调用前，i的值为=" + i);
        p.pass(i);
        System.out.println("pass方法调用后，i的值为=" + i);
    }

    private void pass(int i) {
        i *= 3;
        System.out.println("pass方法中，i的值为=" + i);
    }
}
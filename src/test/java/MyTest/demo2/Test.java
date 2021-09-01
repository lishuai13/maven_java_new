package MyTest.demo2;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuffer =new StringBuilder("abc");
        int a = stringBuffer.hashCode();
        stringBuffer.append("d");
        int b = stringBuffer.hashCode();
        System.out.println(a+"----"+b);

        String string ="abc";
        int c =string.hashCode();
        string+="d";
        int d =string.hashCode();
        System.out.println(c+"----"+d);
    }
}

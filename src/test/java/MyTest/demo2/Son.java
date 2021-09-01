package MyTest.demo2;

public class Son extends Father {
    public String name ="Son";

    public static void main(String[] args) {
        Father p  =new Son();
        System.out.println(p.name);
    }
}

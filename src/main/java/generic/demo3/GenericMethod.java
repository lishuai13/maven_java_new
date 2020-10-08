package generic.demo3;

/**
 * 泛型方法测试
 */
public class GenericMethod {

    public static <E,K,V> void printGeneric(E e , K k, V v){
        System.out.println(e);
        System.out.println(k);
        System.out.println(v);
    }

    public static void main(String[] args) {
        GenericMethod me  = new GenericMethod();
        printGeneric(560111,"李帅",true);
//        GenericMethod.printGeneric(560111,"李帅",true);
    }
}

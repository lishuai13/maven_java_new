package generic.demo4;

/**
 * 类型通配符
 */
public class Test {

    public static void main(String[] args) {
        Box<String>box1 = new Box<>();
        box1.setKey("李帅");
        showBox(box1);

        Box<Integer>box2 = new Box<>();
        box2.setKey(560111);
        showBox(box2);

    }


    private static void showBox(Box<?> box){
        Object key = box.getKey();
        System.out.println(key);
    }
}

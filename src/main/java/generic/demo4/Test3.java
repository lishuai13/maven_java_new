package generic.demo4;

/**
 * 类型通配符下限
 */
public class Test3 {

    public static void main(String[] args) {
        //传入参数Integer
        Box<Integer>box1 = new Box<>();
        box1.setKey(7056);
        showBox(box1);
        //传入参数Integer的父类Number
        Box<Number>box2 = new Box<>();
        box2.setKey(560111);
        showBox(box2);

    }

    //这里设置下限为Integer,调用该方法传入的参数必须是Integer或者Integer的父类
    private static void showBox(Box<? super Integer> box){
        //默认类型为Object
        Object key = box.getKey();
        System.out.println(key);
    }
}
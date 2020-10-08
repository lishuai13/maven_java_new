package generic.demo4;

/**
 * 类型通配符上限
 */
public class Test2 {

    public static void main(String[] args) {
        //传入参数Number
        Box<Number>box1 = new Box<>();
        box1.setKey(7056);
        showBox(box1);
        //传入参数Number的子类Integer
        Box<Integer>box2 = new Box<>();
        box2.setKey(560111);
        showBox(box2);

    }

    //这里设置上限为Number,调用该方法传入的参数必须是Number或者Number的子类
    private static void showBox(Box<? extends Number> box){
        //默认类型为Number
        Number key = box.getKey();
        System.out.println(key);
    }
}

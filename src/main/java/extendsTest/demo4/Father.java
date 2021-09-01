package extendsTest.demo4;

/**
 * 父类
 */
public class Father {
    int i;

    public Father() {
        add(1); //这里会调用子类重写的方法
    }

    public void add(int v){
        i+=v;
    }

    public void print(){
        System.out.println(i);
    }
}

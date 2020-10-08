package generic.demo1;

/**
 * 泛型测试抽奖机
 */
public class Driver {

    static String prize;

    public static void main(String[] args) {


        GetPrize p1 =new GetPrize();

        System.out.println("-----抽奖结果-----");

        prize = p1.getPrize();
        System.out.println(prize);

        GetPrize p2 =new GetPrize();
        prize = p2.getPrize();
        System.out.println(prize);
    }

}

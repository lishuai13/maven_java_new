package generic.demo1;

/**
 * 抽奖机
 */
public class GetPrize {

    static Prize<String>prize = new Prize<>();
    static {
        String[] allPrize = {"华为手机","苹果电脑","奥利给","谢谢参与"};
        for (int i = 0; i < allPrize.length; i++) {
            prize.addPrize(allPrize[i]);
        }
        System.out.println("加入奖品");
    }

    public String getPrize(){
        return prize.getPrize();
    }
 }


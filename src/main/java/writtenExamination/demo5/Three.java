package writtenExamination.demo5;

/**
 * 零钱兑换
 */
public class Three {
    public static void main(String[] args) {
        int[] coins= {1,2,5};
        final int i = coinChange(coins, 11);
        System.out.println(i);
    }
    public static int coinChange(int[] coins, int amount) {
        int[] results = new int[amount+1];
        //写出dp方程F(x)=min(F(x-amount[i])+1);
        //确定边界条件
        results[0]=0;
        for(int i=1;i<=amount;i++){
            int min = (int)1e9;
            int nums=0;
            for (int coin : coins) {
                if (i - coin < 0) {
                    nums = (int) 1e9;
                } else {
                    nums = results[i - coin] + 1;
                }
                min = Math.min(min, nums);
            }
            results[i]=min;
        }
        return results[amount]==1e9?-1:results[amount];
    }
}

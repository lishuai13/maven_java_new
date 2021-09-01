package writtenExamination.demo5;

import java.util.Arrays;

/**
 * 把0移到非零的后边
 */
public class Two {
    public static void main(String[] args) {
        int[] nums = {3,0,2,0,1};
        int[] ints = moveZeroes(nums);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] moveZeroes (int[] nums) {
        int i=0;
        int j=0;
        while (i<nums.length&&j<nums.length){
            while (nums[i]!=0&&i<nums.length-1){
                i++;
            }
            while (nums[j]==0&&j<nums.length-1){
                j++;
            }
            if(i>j){
                j++;
            }
            if(i<j){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }
        }
        return nums;
    }
}

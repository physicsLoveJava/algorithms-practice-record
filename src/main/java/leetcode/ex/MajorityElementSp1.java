package leetcode.ex;

public class MajorityElementSp1 {

    public static int find(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new RuntimeException();
        }
        int num = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == num) {
                count ++;
            }else {
                if(count > 0) {
                    count--;
                }else {
                    num = nums[i];
                    count--;
                }
            }
        }
        return num;
    }


}

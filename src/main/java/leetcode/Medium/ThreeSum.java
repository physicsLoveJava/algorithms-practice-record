package leetcode.Medium;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int mid = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                mid = i;
            }
            if(nums[i] > 0) {
                mid = i;
                break;
            }
        }
        for (int i = 0; i < mid; i++) {
            int left = i + 1, right = nums.length - 1;
            while(left < right) {
                if(nums[left] + nums[right] + nums[i] == 0) {
                    add(set, list, nums[i], nums[left], nums[right]);
                    left++;right--;
                }else if(nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                }else {
                    left++;
                }
            }
        }
        return list;
    }

    private void add(Set<List<Integer>> set, List<List<Integer>> list, int left, int mid, int right) {
        List<Integer> e = Arrays.asList(left, mid, right);
        if(!set.contains(e)) {
            list.add(e);
            set.add(e);
        }
    }

}

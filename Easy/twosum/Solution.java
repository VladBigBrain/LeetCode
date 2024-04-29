package Easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] str) {

        int[] num = { 2, 7, 11, 15 };
        int[] num2 = { 3, 2, 3 };
        
        System.out.println(twoSum(num, 9));
        System.out.println(twoSum(num2, 6));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] result = {};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                return new int[] { i, map.get(target - num) };
            }
            map.put(num, i);
        }

        return result;
    }
}

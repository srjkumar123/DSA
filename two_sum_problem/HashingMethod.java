package two_sum_problem;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Arrays;

public class HashingMethod {
    static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }else {
                map.put(target-nums[i], i);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        int[] result = twoSum(arr, 9);
        System.out.print(Arrays.toString(result));
    }
}

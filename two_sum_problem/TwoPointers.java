package two_sum_problem;

import java.util.Arrays;

public class TwoPointers {
    //helper class to store value and original index
    static class ElementWithIndex{
        int value;
        int originalInex;

        ElementWithIndex(int value, int originalInex){
            this.value = value;
            this.originalInex = originalInex;
        }
    }

    public static int[] twoSum(int[] nums, int target){
        // Create an array of ElementWithIndex to store both value and original index
        ElementWithIndex[] elements = new ElementWithIndex[nums.length];

        for (int i = 0; i < nums.length; i++) {
            elements[i] = new ElementWithIndex(nums[i],i );
        }

        // Sort the array based on values
        Arrays.sort(elements, (a,b)-> Integer.compare(a.value, b.value));


        // Initialize two pointers
        int left = 0, right = nums.length - 1;

        // Iterate with two pointers
        while (left < right) {
            int sum = elements[left].value + elements[right].value;

            if (sum == target) {

                return new int[]{elements[left].originalInex, elements[right].originalInex};
            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3};
        int target1 = 6;

        int[] result = twoSum(nums1, target1);

        System.out.println(Arrays.toString(result));
    }
}

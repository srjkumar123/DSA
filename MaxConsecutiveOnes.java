public class MaxConsecutiveOnes {
    //Given a binary array nums, return the maximum number of consecutive 1's in the array.
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                count=0;
            }
        }
        return maxCount;

    }

    public static void main(String[] args) {
        int[] array = {1,1,0,1,1,1,1,};

        int maxCount = findMaxConsecutiveOnes(array);
        System.out.println("MaxCOunt 1's: "+maxCount);
    }
}

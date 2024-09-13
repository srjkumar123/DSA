public class SquaresofSortedArray {
    public static void main(String[] args) {
        int nums[] = {-4,-1,0,3,10};

        int n = nums.length;
        int left = 0;
        int right = n-1;
        int index = n-1;
        int[] result = new int[n];

        while (left<=right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];

            if (leftSquare>rightSquare){
                result[index] = leftSquare;
                index--;
                left++;
            }
            else {
                result[index] = rightSquare;
                index--;
                right--;
            }
        }


        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }


    }
}

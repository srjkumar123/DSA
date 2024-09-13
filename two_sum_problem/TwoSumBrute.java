package two_sum_problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumBrute {
    static List<int[]> twoSumPair(int[] arr, int target){
        List<int[]> sumIndex = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]+arr[j] == target){
                    sumIndex.add(new int[]{i,j});
                }
            }
        }
       return sumIndex;
    }

    public static void main(String[] args) {
        int arr[] = {3,3};
        List<int[]> result = twoSumPair(arr,6);
        for (int[] pair: result){
            System.out.println(Arrays.toString(pair));
        }
    }
}

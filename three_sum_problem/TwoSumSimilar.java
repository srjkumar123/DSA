package three_sum_problem;

import java.util.*;

public class TwoSumSimilar {

    static List<List<Integer>> threeSum(int[] arr){
        if (arr==null || arr.length<3) return new ArrayList<>();


        //sort the array
        Arrays.sort(arr);

        Set<List<Integer>> result = new HashSet<>();


        //now fix the first element and find other two elements

        for (int i = 0; i < arr.length; i++) {
            //find the other two elements using TWO SUM APPROACH
            int left = i+1;
            int right = arr.length -1;

            while (left<right){
                System.out.println("hello");
                int sum = arr[i] + arr[left] + arr[right];

                if (sum==0){
                    //Add these elem to set and move to find other triplets
                    result.add(Arrays.asList(arr[i], arr[left],arr[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        System.out.println("Result : "+result);
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int arr[] = {-1,0, 1,2,-1,-4};



        List<List<Integer>> result = threeSum(arr);

        if (result.isEmpty()){
            System.out.println("Triplets not found");
        }else {
            for (List<Integer> triplets : result){
                System.out.println(triplets);
            }
        }
    }
}

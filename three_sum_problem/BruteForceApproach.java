package three_sum_problem;

import java.util.ArrayList;
import java.util.List;

public class BruteForceApproach {
    static List<int[]> findTriplets(int arr[]){
        List<int[]> triplets = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i <n-2 ; i++) {
            for (int j =i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k]==0){
                        triplets.add(new int[]{arr[i], arr[j], arr[k]});
                    }
                }
            }
        }
        return triplets;
    }

    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        List<int[]> result = findTriplets(arr);
        if(result.isEmpty()){
            System.out.println("No triplets found...");
        }
        else {
            for (int[] t: result){
                System.out.println(t[0]+","+t[1]+","+t[2]);
            }
        }
    }
}

package merge_sorted_array;

public class MergeSortedArray {
    public static void merge(int nums1[], int nums2[], int m, int n){
        int i = m-1; // Index of the last element in nums1's initial part
        int j = n-1; // Index of the last element in nums2
        int k = m+n-1; // Index of the last element in nums1's total length

        // Merge nums1 and nums2, starting from the end of both arrays
        while (i>=0 && j>=0){
            if (nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        while (j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
        for (int l = 0; l < nums1.length; l++) {
            System.out.print(nums1[l]+" ");
        }

    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0,0,0};
        int nums2[] = {2,5,6,8,9};

        int m = 3;
        int n = nums2.length;

        merge(nums1, nums2, m, n);
    }
}

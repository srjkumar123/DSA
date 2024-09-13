package basic_dsa;

public class AverageOfArray {
    static void average(int a[]){
        int n = a.length;
        double sum = 0;

        for (int i = 0; i <n ; i++) {
            sum += a[i];
        }
        double avg = sum/n;
        System.out.printf("The average of the given array: %.2f ",avg);
    }

    //reccursively computes avg of an array
    static double avgRecursive(int[] a, int i, int n){
        //last element
        if (i==n-1){
            return a[i];
        }
        //when i=0 divide the sum compted by n
        if (i==0){
            return ((a[i]+avgRecursive(a,i+1,n))/n);
        }

        //compute sum
        return (a[i]+avgRecursive(a,i+1,n));
    }

    static double average(int[] a, int n){
        return avgRecursive( a, 0, n);
    }


    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 7, 5, 3};
        average(arr);

        System.out.println("\nAverage using recursive mrthod: "+average(arr,arr.length));

    }
}

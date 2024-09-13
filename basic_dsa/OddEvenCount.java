package basic_dsa;

public class OddEvenCount {
    void countOddEven(int[] a){
        int n = a.length;
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i <n ; i++) {
            if (a[i]%2==0){
                evenCount += 1;
            }
            else {
                oddCount +=1;
            }
        }
        System.out.println("Even count: "+ evenCount);
        System.out.println("Odd count: "+ oddCount);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6 };

        OddEvenCount oe = new OddEvenCount();
        oe.countOddEven(arr);

    }
}

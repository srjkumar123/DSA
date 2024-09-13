package duplicate_zeroes;

public class DuplicateZeroes {

    public static void duplicateZeroes(int[] arr){
        int possibleDups = 0;
        int length_ = arr.length-1;

        for (int i = 0; i <=length_-possibleDups ; i++) {

            if (arr[i]== 0){
                if (i == length_-possibleDups){

                    arr[length_] = 0;
                    length_ -= 1;

                    break;
                }

                possibleDups++;
            }
        }
        System.out.println(length_);
        System.out.println(possibleDups);


        int last = length_-possibleDups;
        for (int i = last; i>=0 ; i--) {
            if (arr[i]==0){
                arr[i+possibleDups] = 0;
                possibleDups--;
                arr[i+possibleDups] = 0;
            }
            else {
                arr[i+possibleDups] = arr[i];
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,4,5,0};
        duplicateZeroes(arr);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

package hackerrrank;

public class SortedRotated {

    static int searchElement(int[] a, int key){

        int low = 0;
        int high = a.length-1;

        while (low<=high){ //atleat one element
            int mid = (low+high)/2;
            if (a[mid]==key) return mid; // mid ==key return

            if (a[low]<a[mid]){ //if hamara low element small ha mid elemnt k then left part is sorted one
                //then we search in that part
                if (key >=a[low]  && key<a[mid]){ //key low se bada ha orr mid se chhota to hamara kya pakka yahi lie
                    // karega
                    high = mid-1; //high ko -1 kr denge
                }
                else {
                    low = mid+1; //agar iss half ma nahi ha to low mid+1 krenge or dusre half ma check karenge
                }
            }else {
                if (key>a[mid] && key <=a[high]){ //key mid se bada orr high se chota
                    low = mid+1; //low ko mid +1 kr denge or iss part ma check karenge
                }
                else {
                    high = mid-1; //nahi to dusre half me jayenge
                }
            }
        }

        return -1; //element arraya ma nahi mila to -1 return kara denge
    }


    public static void main(String[] args) {
        int[] a = {20,30,40,50,60,5,10};

        System.out.println(searchElement(a,30));
    }
}

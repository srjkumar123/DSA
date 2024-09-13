import java.io.*;
        import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> list = new ArrayList<>();

        int input = scanner.nextInt();

        List<Integer> tempList;
        for(int i=0; i<input; i++){
            tempList = new ArrayList<>();
            int dataCount = scanner.nextInt();
            for (int j = 0; j < dataCount; j++) {
                tempList.add(scanner.nextInt());
            }

            list.add(tempList);
        }

        int noOfQuery = scanner.nextInt();
        for (int i = 0; i < noOfQuery; i++) {
            int x = scanner.nextInt() -1;
            int y = scanner.nextInt()-1;

            try{
                System.out.println(list.get(x).get(y));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }

        }

    }
}


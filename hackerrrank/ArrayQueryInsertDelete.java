package hackerrrank;

import java.io.*;
import java.util.*;

public class ArrayQueryInsertDelete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        while(Q-- >0){
            String s = scanner.next();
            if(s.equalsIgnoreCase("Insert")){
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            }else if(s.equalsIgnoreCase("Delete")){
                int deleteIndex = scanner.nextInt();
                list.remove(deleteIndex);
            }
        }
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}

/*
* Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
*
*
* */


//https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
package basic_dsa;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalindrome(int num){

        int reverseNum = 0;

        int temp = num;
        while (temp!=0){
            reverseNum = (reverseNum*10) + temp%10;
             temp = temp/10;
        }
        return reverseNum==num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}

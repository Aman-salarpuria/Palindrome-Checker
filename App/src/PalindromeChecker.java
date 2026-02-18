/**
 * ===========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ===========================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 *
 * This reduces extra memory usage.
 *
 * @author Developer
 * @version 4.0
 */



import java.util.Scanner;
public class PalindromeChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char[] strc = str.toCharArray();
        int n=str.length();
        int flag=0;
        for(int i=0;i<n;i++){
            if(strc[i]==strc[n-1-i]){
                continue;
            }else{flag=1;}
        }
        if(flag==0){
            System.out.println("Its a Palindrome");
        }else{System.out.println("its not a palindrome");
        }
        ;}
}
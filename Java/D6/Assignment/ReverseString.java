package Assignment;

import java.util.Scanner;

public class ReverseString {
    static String reverseString(String s){
        StringBuilder sb = new StringBuilder();
        for(char e: s.toCharArray())
            sb.append(e);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.next();
        String reverse_s = reverseString(s);
        System.out.println("Reversed: "+reverse_s);
    }
}

package programs;

//  https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75

//For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

public class GcdOfStrings {
    public static void main(String[] args){
        String answer = gcdOfStrings("ABABAB", "AB");
        System.out.println(answer);
    }

    public static String gcdOfStrings(String str1, String str2){
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1)) return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}

package programs;

/*
*
* https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
*
* 1768. Merge Strings Alternately
* You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
* Return the merged string.
*
* */
public class MergeStringAlternately {
    public static void main(String[] args){
        String answer = mergeAlt("abc","pqr");
        System.out.println(answer);
    }

    public static String mergeAlt(String w1, String w2){
//      Using StringBuilder to build alt char string
        StringBuilder sb = new StringBuilder();
        int l1,l2,i;
        i=0;
        l1=w1.length();
        l2=w2.length();
//        adding each letter from 2 strings to alt char string
//        using append method
        while(i<l1 || i<l2){
            if(i<l1){
                sb.append(w1.charAt(i));
            }
            if(i<l2){
                sb.append(w2.charAt(i));
            }
            i++;
        }
//      returning final string
        return sb.toString();
    }
}

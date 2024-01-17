package programs;

import java.util.HashMap;
import java.util.HashSet;

/*
 * https://leetcode.com/problems/unique-number-of-occurrences/description
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 *
 * Example 1:
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Constraints:
 * 1 <= arr.length <= 1000
 * -1000 <= arr[i] <= 1000
 *
 */
public class UniqueNumberofOccurrences {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 1, 1, 3};
        boolean answer = uniqueOccurrences(arr);
        System.out.println(answer);
    }

    public static boolean uniqueOccurrences(int[] arr){
        HashMap<Integer,Integer> num_occur = new HashMap<>();
        for (int num : arr) {
            num_occur.put(num,num_occur.getOrDefault(num,0)+1);
        }
        HashSet<Integer> unique_values = new HashSet<>(num_occur.values());
        return num_occur.size() == unique_values.size();
    }
}

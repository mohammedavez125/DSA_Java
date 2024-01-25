package programs;

import java.util.Arrays;
//https://leetcode.com/problems/product-of-array-except-self/submissions/1156580368/?envType=study-plan-v2&envId=leetcode-75

public class ProductExceptSelf {
    public static void main(String[] args){
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    /*
        public static int[] productExceptSelf(int[] nums){
            int[] arr = new int[nums.length];
            for (int i = 0; i < nums.length ; i++) {
                int product = 1;
                for (int j = 0; j < nums.length ; j++) {
                    if (i == j){
                        continue;
                    }
                    product *= nums[j];
                }
                arr[i] = product;
            }
            return arr;
        }
    */
    //gtp code this
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;

        // Initialize arrays for prefix and suffix products
        int[] prefixProducts = new int[n];
        int[] suffixProducts = new int[n];

        // Initialize the result array
        int[] result = new int[n];

        // Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            prefixProducts[i] = prefix;
            prefix *= nums[i];
        }

        // Calculate suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            suffixProducts[i] = suffix;
            suffix *= nums[i];
        }

        // Calculate the product except self
        for (int i = 0; i < n; i++) {
            result[i] = prefixProducts[i] * suffixProducts[i];
        }

        return result;
    }
}

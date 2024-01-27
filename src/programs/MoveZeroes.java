package programs;

//https://leetcode.com/problems/move-zeroes/solutions/4218030/java-1ms-beats-100/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){
        int[] nums = {1, 2, 0, 3, 12, 0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums){
        if (nums.length == 1){
            return;
        }

        int numP = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[numP] = nums[i];
                numP++;
            }
        }
        while (numP < nums.length) {
            nums[numP] = 0;
            numP++;
        }

    }
/*
    public static void moveZeroes(int[] nums){
        int zeroP;
        int numP=0;
        for (zeroP =nums.length-1; zeroP >0; zeroP--) {
            while(nums[numP]!=0){
                numP++;
            }
            if(numP>zeroP){
                break;
            }
            while (nums[zeroP]==0){
                zeroP--;
            }
            swap(nums,numP,zeroP);

        }
        System.out.println(Arrays.toString(nums));
    }
    private static void swap(int[] arr, int a, int b){
        int temp =arr[a] ;
        arr[a]=arr[b];
        arr[b]=temp;
    }
*/

}

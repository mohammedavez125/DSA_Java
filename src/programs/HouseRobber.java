package programs;
//198. House Robber
//        You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
//        the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it
//        will automatically contact the police if two adjacent houses were broken into on the same night.
//        Given an integer array nums representing the amount of money of each house,
//        return the maximum amount of money you can rob tonight without alerting the police.

//        https://leetcode.com/problems/house-robber/description/?envType=daily-question&envId=2024-01-21

public class HouseRobber {
    public static void main(String[] args){
        int steal = rob(new int[]{1, 2, 3, 1});
        System.out.println(steal);
    }
    public static int rob(int[] nums) {
        int rob = 0;
        int norob = 0;
        for (int num : nums) {
            int newRob = norob + num;
            int newNoRob = Math.max(norob, rob);
            rob = newRob;
            norob = newNoRob;
        }
        return Math.max(rob, norob);
    }
}

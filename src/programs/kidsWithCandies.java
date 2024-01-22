package programs;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75

public class kidsWithCandies {
    public static void main(String[] args){

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<Boolean>(candies.length);

        int max = candies[0];

        for(int i=1; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        for(int i=0; i< candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if(candies[i] >= max) {
                result.add(true);
            }
            else {
                result.add(false);
            }
        }

        return result;
    }
}

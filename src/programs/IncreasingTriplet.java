package programs;

public class IncreasingTriplet {
    public static void main(String[] args){
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<=3){
            return false;
        }
        for(int i =1; i<nums.length;i++){
            if(i >= nums.length-1){
                return false;
            }
            if(nums[i-1]<nums[i] & nums[i]<nums[i+1]){
                break;
            }
        }
        return true;
    }
}

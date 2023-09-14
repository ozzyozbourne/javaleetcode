public final class TwoSumTwo{
    private TwoSumTwo(){}

    public static void main(String... a){

    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left < right){
            if((nums[left] + nums[right]) < target) left+=1;
            else if((nums[left] + nums[right]) > target)right-=1;
            else break;
        }return new int[]{left+=1, right+=1};        
    }
}

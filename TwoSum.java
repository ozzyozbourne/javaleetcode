import java.util.Map;
import java.util.HashMap;

public final class TwoSum {
    private TwoSum(){}

    public static void main(String... a){

    }

     public static  int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        final int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(map.getOrDefault(target - nums[i], -1) == -1)map.put(nums[i], i);
            else {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
        }
        return res;
    }

}

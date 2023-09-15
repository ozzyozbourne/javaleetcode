import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FourSum {

    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> quad = new ArrayList<>();

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);
        kSum(nums, 4, 0, target);
        return res;
    }

    private void kSum(int[] nums, int k, int start, long target){
        if (k > 2){
            for(int i = start; i < nums.length-k+1; i++){
                if (i > start && nums[i] == nums[i-1])continue;
                quad.add(nums[i]);
                kSum(nums, k-1, i+1, target-nums[i]);
                quad.remove(quad.size()-1);
            }
        }else {
            int left = start, right = nums.length-1;
            while (left < right){
                final long sum  = nums[left] + nums[right];
                if (sum < target)left+=1;
                else if (sum > target)right-=1;
                else {
                    res.add(List.of(quad.get(0), quad.get(1), nums[left], nums[right]));
                    left+=1;
                    while (nums[left] == nums[left -1] && left < right)left+=1;

                }
            }
        }
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class FourSum {

    public static void main(String[] args) {
        System.out.println(new FourSum().fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);
        return ksum(nums, 4, 0, target, new ArrayList<>(), new int[2]);
    }

    private List<List<Integer>> ksum(int[] nums, int k, int start, long target, List<List<Integer>> res, int[] tuple )  {
        if (k > 2){
            for(int i = start; i < nums.length-k+1; i++){
                if (i > start && nums[i] == nums[i-1])continue;
                tuple[4-k] = nums[i];
                res = ksum(nums, k-1, i+1, target-nums[i], res, tuple);
            }
        }else {
            int left = start, right = nums.length-1;
            while (left < right){
                final long sum  = nums[left] + nums[right];
                if (sum < target)left+=1;
                else if (sum > target)right-=1;
                else {
                    res.add(List.of(tuple[0], tuple[1], nums[left], nums[right]));
                    left+=1;
                    while (nums[left] == nums[left -1] && left < right)left+=1;
                }
            }
        }return res;
    }
}

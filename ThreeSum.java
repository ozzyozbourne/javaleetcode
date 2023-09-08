import java.util.*;
import java.util.stream.Collectors;

public final class ThreeSum{

    private ThreeSum() {}

    public static void main(String ... a){
        //System.out.println("Hey there");    
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)return List.of(List.of());
        Arrays.sort(nums);
        final Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int j = i +1, k = nums.length-1;
            final int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                set.add(List.of(nums[i], nums[j], nums[k]));
                j++;
                while (nums[j] == nums[j - 1] && j < k) j++;
            }else{
                if(sum > 0)k--;
                else j++;
            }
        }
        return set.stream().toList();
    }
}

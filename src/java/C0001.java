import java.util.HashMap;
import java.util.Map;

public class C0001 {

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        // 使用Map缓存
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        // 遍历寻找
        for(int i=0; i<nums.length; i++){
            Integer index = map.get(target - nums[i]);
            if(index != null && index != i){
                return new int[]{i, index};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(1);
    }
}

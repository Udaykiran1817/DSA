import java.util.*;

public class TwoSumUS {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 9, 5, 11, 6 };
        int target = 16;
        int[] result = Demo.test(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}

class Demo {
    public static int[] test(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int difference = target - nums[i];
            if(map.containsKey(difference))
            {
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
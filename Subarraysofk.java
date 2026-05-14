import java.util.*;

public class Subarraysofk {
   public static void main(String[] args) {
      int[] nums = { -1, 1, 0, 1, -1, 2, 3 };

      int target = 2;

      int result = Demo.test(nums, target);
      System.out.println(result);
   }
}

class Demo {
   public static int test(int[] nums, int target) {
      HashMap<Integer, Integer> map = new HashMap<>();
      map.put(0, 1);
      int count = 0;
      int prefixSum = 0;

      for (int num : nums) {
         prefixSum += num;

         if (map.containsKey(prefixSum - target)) {
            count += map.get(prefixSum - target);
         }
         map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
      }
      return count;
   }
}
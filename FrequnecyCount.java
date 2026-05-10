import java.util.*;

public class FrequnecyCount {
   public static void main(String[] args) {
      int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7 };

      Demo.test(nums);
   }
}

class Demo {
   public static void test(int[] nums) {
      Map<Integer, Integer> map = new LinkedHashMap<>();

      for (int i = 0; i < nums.length; i++) {
         map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
      }
      System.out.println(map);
   }
}

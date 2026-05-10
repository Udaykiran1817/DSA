import java.util.Arrays;

public class TwoSumSorted {

   public static void main(String[] args) {
      int[] nums = { 2, 7, 8, 9, 11, 13 };
      int target = 25;

      int[] result = Demo1.test(nums, target);

      System.out.println(Arrays.toString(result));
   }
}

class Demo1 {

   public static int[] test(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;

      while (left < right) {
         int sum = nums[left] + nums[right];

         if (target == sum) {
            return new int[] { left, right };
         } else if (sum > target) {
            right--;
         } else {
            left++;
         }
      }
      return new int[] { -1, -1 };
   }
}

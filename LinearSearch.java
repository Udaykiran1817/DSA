public class LinearSearch {
   public static void main(String[] args) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
      int target = 4;

      int result = Demo.test(nums, target);
      System.out.println(result);
   }
}

class Demo {
   public static int test(int[] nums, int target) {
      for (int i = 0; i < nums.length; i++) {
         if (nums[i] == target) {
            return i;
         }
      }
      return -1;
   }
}
public class MoveZeroes {
   public static void main(String[] args) {
      int[] nums = { 1, 4, 0, 0, 6, 4, 0, 7, 0, 4, 0, 8, 0, 9, 6, 0, 5, 0, 4, 0, 0, 9, 9, 0, 8, 7 };

      Demo.test(nums);
      for (int n : nums) {
         System.out.print(n + " ");
      }
   }
}

class Demo {
   public static void test(int[] nums) {
      int left = 0;
      for (int right = 0; right < nums.length; right++) {
         if (nums[right] != 0) {
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;

            left++;
         }
      }
   }
}
public class BinarySearch {
   public static void main(String[] args) {
      int[] nums = { 2, 4, 5, 7, 8, 9, 12, 14, 16, 19, 20, 32, 43, 56 };
      int target = 568;

      int result = Demo.test(nums, target);
      if (result == -1) {
         System.out.println("Value is not available!");
      } else {
         System.out.println("Value is ar index position: " + result);
      }
   }
}

class Demo {
   public static int test(int[] nums, int target) {
      int left = 0;
      int right = nums.length - 1;
      while (left <= right) {
         int mid = left + (right - left) / 2;
         if (nums[mid] == target) {
            return mid;
         } else if (nums[mid] > target) {
            right--;
         } else {
            left++;
         }
      }

      return -1;
   }
}

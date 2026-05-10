public class ReverseArray {
   public static void main(String[] args) {
      int[] nums = { 2, 4, 7, 8, 4, 3, 7 };

      Demo.test(nums);
      for (int num : nums) {
         System.out.print(num + " ");
      }

   }
}

class Demo {
   public static void test(int[] nums) {
      int left = 0;
      int right = nums.length - 1;

      while (left < right) {
         int temp = nums[left];
         nums[left] = nums[right];
         nums[right] = temp;

         left++;
         right--;
      }
   }
}
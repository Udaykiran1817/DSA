public class ColorProblem {
   public static void main(String[] args) {
      int[] nums = { 1, 0, 1, 0, 1, 2, 2, 0, 1, 0, 1, 1, 0, 0, 2, 2, 1, 0, 1, 0, 2, 2, 0, 1, 0 };

      Demo.test(nums);
      for (int num : nums) {
         System.out.print(num + " ");
      }

   }
}

class Demo {
   public static void test(int[] nums) {
      int low = 0;
      int mid = 0;
      int high = nums.length - 1;

      while (mid <= high) {
         switch (nums[mid]) {
            case 0 -> {
               int temp = nums[low];
               nums[low] = nums[mid];
               nums[mid] = temp;
               low++;
               mid++;
            }
            case 1 -> mid++;
            default -> {
               int temp = nums[mid];
               nums[mid] = nums[high];
               nums[high] = temp;
               high--;
            }
         }
      }
   }
}

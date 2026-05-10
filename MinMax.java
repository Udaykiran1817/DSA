public class MinMax {
   public static void main(String[] args) {
      int[] nums = { 2, 5, 7, 9, 45, -1, 354, 6, 645, 1 };

      int min = nums[0];
      int max = nums[0];

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] < min) {
            min = nums[i];
         } else if (nums[i] > max) {
            max = nums[i];
         }
      }
      System.out.println("Minimum value: " + min);
      System.out.println("Maximum value: " + max);
   }
}

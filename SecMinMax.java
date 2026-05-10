public class SecMinMax {
   public static void main(String[] args) {
      int[] nums = { 2, 7, 9, 11, 45, 24, 46, 76 };

      int min = Integer.MAX_VALUE;
      int secMin = Integer.MAX_VALUE;

      int max = Integer.MIN_VALUE;
      int secMax = Integer.MIN_VALUE;

      for (int i = 0; i < nums.length; i++) {
         if (nums[i] < min) {
            secMin = min;
            min = nums[i];
         } else if (nums[i] < secMin && nums[i] != min) {
            secMin = nums[i];
         }

         if (nums[i] > max) {
            secMax = max;
            max = nums[i];
         } else if (nums[i] > secMax && nums[i] != max) {
            secMax = nums[i];
         }
      }
      System.out.println("Second Maximum value: " + secMax);
      System.out.println("Second Minimum value is: " + secMin);
   }
}

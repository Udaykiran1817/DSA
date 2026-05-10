public class TwoPalindromeRemove {
   public static void main(String[] args) {
      String name = "aaba";

      boolean result = Demo.test(name);
      System.out.println(result);
   }
}

class Demo {
   public static boolean test(String name) {
      int left = 0;
      int right = name.length() - 1;

      while (left < right) {
         if (name.charAt(left) == name.charAt(right)) {
            left++;
            right--;
         } else {
            return checkPalindrome(name, left + 1, right) ||
                  checkPalindrome(name, left, right - 1);
         }
      }
      return true;
   }

   public static boolean checkPalindrome(String name, int left, int right) {
      while (left < right) {
         if (name.charAt(left) != name.charAt(right)) {
            return false;
         }
         left++;
         right--;
      }
      return true;
   }
}

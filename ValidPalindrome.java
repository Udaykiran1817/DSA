public class ValidPalindrome {
   public static void main(String[] args) {
      String name = "A man, a plan, a fycanal, Panama!";

      boolean result = Demo.test(name);
      if (result) {
         System.out.println("Is Palindrome");
      } else {
         System.out.println("Not a Palindrome");
      }
   }
}

class Demo {
   public static boolean test(String name) {
      int left = 0;
      int right = name.length() - 1;

      while (left < right) {
         char l = name.charAt(left);
         char r = name.charAt(right);

         if (!Character.isLetterOrDigit(l)) {
            left++;
         } else if (!Character.isLetterOrDigit(r)) {
            right--;
         } else {
            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
               return false;
            }
            left++;
            right--;
         }
      }
      return true;
   }
}

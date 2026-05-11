public class CyclicString {
   public static void main(String[] args) {
      String base = "abcdefg";
      String input = "defgabcd";

      String doubled = base + base;

      if (doubled.contains(input) && input.length() == base.length()) {
         System.out.println("Cyclic True");
      } else {
         System.out.println("Not a Cyclic False");
      }
   }
}

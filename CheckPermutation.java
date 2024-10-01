import java.util.Arrays;

public class CheckPermutation {
  
    static boolean checkPermutation(String s1, String s2) {
      if (s1.length() != s2.length()) {
        return false;
      }
      char[] s1Array = s1.toCharArray();
      char [] s2Array = s2.toCharArray();

      Arrays.sort(s1Array);
      Arrays.sort(s2Array);

      return Arrays.equals(s1Array, s2Array);
  }

  public static void main(String[] args) {
    System.out.println(checkPermutation("hello", "world")); // false
    System.out.println(checkPermutation("world", "dlrow")); // true
  }
}

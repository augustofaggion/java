// "Implement an algorithm to determine if a string has unique characters. What if you cannot use additional data structure?

public class IsUnique {
  static boolean isUnique(String str) {
    for (int i = 0; i < str.length(); i++) { // iterate thorugh string
      for (int j = i + 1; j < str.length(); j++) { // interate through string again
        if (str.charAt(i) == str.charAt(j)) { // if charactres are the same
          return false;  // return false
        }
      }
    }
    return true; // return true
  }

  public static void main(String[] args) {
    System.out.println(isUnique("hello")); // false
    System.out.println(isUnique("world")); // true
  }
}

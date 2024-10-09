class Urlify {

  static String urlify(String str) {
    str = str.trim();  // removes the whitespace from the begin and end
    return str.replace(" ", "%20");
  }
  public static void main(String[] args) {
    System.out.println(urlify("Mr John Smith    ")); // Mr%20John%20Smith
  }
}

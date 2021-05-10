package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Find out if there are any occurrences of the word "Shaw" in a sentence
 */
public class RegExPatten {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("Shaw", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("AshwaniShaw");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
// Outputs Match found
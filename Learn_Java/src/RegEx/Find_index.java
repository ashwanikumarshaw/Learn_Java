package RegEx;

import java.util.regex.*;

public class Find_index {
	  private static final String REGEX = "\\bShaw\\b";
	   private static final String INPUT = "Ashwani Shaw shaw Kumar ashu Shaw";

	   public static void main( String args[] ) {
		   
	      Pattern p = Pattern.compile(REGEX);//,Pattern.CASE_INSENSITIVE);
	      Matcher m = p.matcher(INPUT);   // get a matcher object
	      
	      int count = 0;

	      while(m.find()) {
	         count++;
	         System.out.println("Match number "+count);
	         System.out.println("start(): "+m.start());
	         System.out.println("end(): "+m.end());
	      }
	   }
}
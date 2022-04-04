package question75.string;

public class ValidPalindrome {

	public static void main(String[] args) {
		boolean result = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(result);
	}
	
    public static boolean isPalindrome(String s) {
    	
    	String match = "[^a-z0-9A-Z]";
    	s = s.toLowerCase();
    	s = s.replaceAll(match, "");
    	
    	int j = s.length()-1;
    	
    	for(int i = 0; i < j; i++) {
    		if(s.charAt(i) != s.charAt(j)) {
    			return false;
    		} else {
    			j--;
    		}
    	}
    	
    	return true;
    	
    }
    
//    public boolean isPalindrome(String s) {
//        for (int i = 0, j = s.length() - 1; i < j;) {
//          if (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
//            i++;
//            continue;
//          }
//          if (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
//            j--;
//            continue;
//          }
//
//          if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
//            return false;
//            
//          i++;
//          j--;
//        }
//
//        return true;
//      }

}

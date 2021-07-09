package level1.test;

public class HidePhone {
	public String solution(String phone_number) {
		String answer = phone_number;

		String copy = answer.substring(answer.length() - 4);
		String copy1 = answer.substring(0, answer.length() - 4);
		String copy2 = "";

		for (int i = 0; i < copy1.length(); i++) {
			copy2 += "*";
		}
		answer = copy2 + copy;
		return answer;
	}

	public static void main(String[] args) {

//		String input = "01033334444";
//		String copy1 = input.substring(input.length() - 4);
//		String copy2 = input.substring(0, input.length() - 4);
//		String copy3 = "";
//
//		for (int i = 0; i < copy2.length(); i++) {
//			copy3 += "*";
//		}
//
//		System.out.println(copy3 + copy1);
		HidePhone hp = new HidePhone();
		System.out.println(hp.solution("01033334444"));
		System.out.println(hp.solution("027778888"));
	}
}

//class Solution {
//  public String solution(String phone_number) {
//     char[] ch = phone_number.toCharArray();
//     for(int i = 0; i < ch.length - 4; i ++){
//         ch[i] = '*';
//     }
//     return String.valueOf(ch);
//  }
//}

//class Solution {
//	  public String solution(String phone_number) {
//	      String answer = "";
//
//	        for (int i = 0; i < phone_number.length() - 4; i++)
//	            answer += "*";
//
//	        answer += phone_number.substring(phone_number.length() - 4);
//
//	        return answer;
//	  }
//	}

//class Solution {
//	  public String solution(String phone_number) {
//	      String answer = "";
//	      int len = phone_number.length();
//	      for(int i = 0; i < len; i++){
//	          if(i < len - 4)
//	              answer += "*";
//	          else
//	              answer += phone_number.charAt(i);
//	      }
//
//	      return answer;
//	  }
//	}
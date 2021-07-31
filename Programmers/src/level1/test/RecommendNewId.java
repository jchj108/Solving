package level1.test;

public class RecommendNewId {
	
    public String solution(String new_id) {
    	StringBuilder sb = new StringBuilder();
        
    	System.out.println(new_id.length());
    	
    	// 1 �ܰ�
        new_id = new_id.toLowerCase(); 

        // 2�ܰ�
        for(int i = 0; i < new_id.length(); i++) { 
        	char c = new_id.charAt(i);
        	
        	if(Character.isDigit(c) || Character.isLowerCase(c) || c == '-' || c == '.' || c=='_') {
        		sb.append(c);
        	}
        }
        
        // 3�ܰ�
        for(int i = 0; i < sb.length()-1; i++) { 
        	char c = sb.charAt(i);
        	if(sb.charAt(i) == '.' && sb.charAt(i+1) == '.') {
        		sb.deleteCharAt(i);
        		i--;
        	}
        }
        
        // 4�ܰ�
        if(sb.length() > 0) { 
        	if(sb.charAt(sb.length()-1) == '.') { 
        		System.out.println("4");
        		sb.deleteCharAt(sb.length()-1);
        	}
        }
        if(sb.length() > 0) {
        	if(sb.charAt(0) == '.') { 
        		System.out.println("4");
        		sb.deleteCharAt(0);
        	}
        }
        
        if(sb.length() == 0) { // 5�ܰ�
        	System.out.println("5");
        	sb.append("a");
        }
        
        System.out.println(sb.length());
        
        // 6�ܰ�
        if(sb.length() > 15) { 
        	sb.delete(15, sb.length()); // charIndex15���� sb.length-1���� ����
        	
        	// 4�ܰ� �ٽ� ȣ��
            if(sb.length() > 0) { 
            	if(sb.charAt(sb.length()-1) == '.') { 
            		System.out.println("4");
            		sb.deleteCharAt(sb.length()-1);
            	}
            }
            if(sb.length() > 0) {
            	if(sb.charAt(0) == '.') { 
            		System.out.println("4");
            		sb.deleteCharAt(0);
            	}
            }
        }
        
        // 7�ܰ�
        while(!(sb.length() > 2)) { 
        	System.out.println("7");
        	sb.append(sb.charAt(sb.length()-1));
        }
        
        return sb.toString();
    }

	public static void main(String[] args) {
		
		System.out.println(new RecommendNewId().solution("abcdefghijklmn.p"));
	}
}

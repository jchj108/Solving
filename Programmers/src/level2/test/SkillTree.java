package level2.test;

public class SkillTree {

	public static void main(String[] args) {
		
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		
		int result = solution(skill, skill_trees);
		System.out.println(result);
	}

	
    public static int solution(String skill, String[] skill_trees) {
    	
    	int answer = 0;
    	
    	for(int i = 0; i < skill_trees.length; i++) {
    		
    		String s = skill_trees[i];
    		String convert = "";
    		
    		for(char c : s.toCharArray()) {
    			for(int j = 0; j < skill.length(); j++) {
    				if(c == skill.charAt(j)) {
    					convert += c;
    				}
    			}
    		}
    		boolean flag = true;
    		for(int j = 0; j < convert.length(); j++) {
    			char c = convert.charAt(j);
    			if(c != skill.charAt(j)) {
    				flag = false;
    				break;
    			}
    		}
    		
    		if(flag) {
    			answer++;
    		}
    	}
        return answer;
    }
}

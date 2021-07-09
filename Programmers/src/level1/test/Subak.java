package level1.test;

// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

public class Subak {
    public String watermelon(int n){
    StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
        	if(i%2==1) {
        		sb.append("수");
        	}
        	else {
        		sb.append("박");
        	}
    }

        return sb.toString();
    }

    // 실행을 위한 테스트코드입니다.
    public static void  main(String[] args){
    	Subak wm = new Subak();
        System.out.println("n이 3인 경우: " + wm.watermelon(3));
        System.out.println("n이 4인 경우: " + wm.watermelon(4));
    }
}
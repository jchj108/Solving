package level1.test;


public class Eratos {

    public int solution(int n) {
        int answer = 0;
        
        boolean[] arr = new boolean[n+1];
        arr[0] = false;
        arr[1] = false;
        
        for(int i = 2; i <=n; i++) {
        	arr[i] = true;
        }
        
        for(int i = 2; (i*i) <= n; i++) {
        	for(int j = i*i; j <= n; j+=i) {
        		System.out.println(j);
        		arr[j] = false;
        	}
        }
        
        for(int i = 0; i<=n; i++) {
        	if(arr[i] == true) {
        		answer++;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
		Eratos e = new Eratos();
		System.out.println(e.solution(100));
		
	}
}
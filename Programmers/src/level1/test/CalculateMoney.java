package level1.test;

import java.math.BigInteger;

public class CalculateMoney {

	   public long solution(int price, int money, int count) {
	        long answer = 0;
	        BigInteger zero = new BigInteger("0");
	        BigInteger bPrice = new BigInteger(Integer.toString(price));
	        BigInteger bMoney = new BigInteger(Integer.toString(money));
	        BigInteger acc = new BigInteger("0");

	        for(int i = 1; i <= count; i++) {
	        	BigInteger index = new BigInteger(Integer.toString(i));
	        	acc = acc.add(bPrice.multiply(index));
	        	
	        	if(bMoney.subtract(acc).compareTo(zero) == -1 && i == count) {
	        		answer = Long.parseLong(bMoney.subtract(acc).toString()); 
	        		answer = Math.abs(answer);
	        		return answer;
	        	}
	        }
	        return 0;
	    }
	
	public static void main(String[] args) {
		
		long result = new CalculateMoney().solution(3, 20, 5);
		System.out.println(result);
	}

}

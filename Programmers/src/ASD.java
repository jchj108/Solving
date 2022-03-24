import java.io.UnsupportedEncodingException;

public class ASD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-asasfgfff"; 
		int bytesLen=0;
		try {
			bytesLen = String.valueOf(s).getBytes("utf-8").length;
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(bytesLen);
		

	}

}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q22 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //����
		String s = bf.readLine(); //String
		int i = Integer.parseInt(bf.readLine()); //Int
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
		String sd = "abcdefg";//����� ���ڿ�
		bw.write(s);//���
	}

}

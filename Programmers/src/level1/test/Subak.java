package level1.test;

// ���̰� n�̰�, "���ڼ��ڼ��ڼ�...."�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� "���ڼ���"�� �����ϰ� 3�̶�� "���ڼ�"�� �����ϸ� �˴ϴ�.

public class Subak {
    public String watermelon(int n){
    StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
        	if(i%2==1) {
        		sb.append("��");
        	}
        	else {
        		sb.append("��");
        	}
    }

        return sb.toString();
    }

    // ������ ���� �׽�Ʈ�ڵ��Դϴ�.
    public static void  main(String[] args){
    	Subak wm = new Subak();
        System.out.println("n�� 3�� ���: " + wm.watermelon(3));
        System.out.println("n�� 4�� ���: " + wm.watermelon(4));
    }
}
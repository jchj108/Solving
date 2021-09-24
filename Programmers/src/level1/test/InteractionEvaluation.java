package level1.test;


public class InteractionEvaluation {

	public String solution(int[][] scores) {
		String answer = "";

		// i j�� i�� �л��� ���� j�� �л��� ����
		// �ڱ� �ڽſ� ���� �� ������ ������ �ְ��� �Ǵ� �������̶��
		// �ش� ������ �����ϰ� ��� ���� ��
		// ��� ������ ���� ���� �ο��� ����

		for (int i = 0; i < scores.length; i++) {
			int ownScore = scores[i][i]; // [i][i]�� 2���� �迭�� �밢���� ���� �ȴ�
			boolean sameScore = true;
			int sum = 0;
			int divide = 0;
			int max = scores[0][i];
			int min = scores[0][i];
			double avg;

			for (int j = 0; j < scores.length; j++) { // �ڱ� �ڽŰ� �Ȱ��� �� ã��
				if (i != j && ownScore == scores[j][i]) {
					sameScore = false;
				}
				if (max < scores[j][i]) {
					max = scores[j][i];
				}
				if (min > scores[j][i]) {
					min = scores[j][i];
				}
				sum += scores[j][i];
				divide++;
			}

			if (sameScore && (max == ownScore || min == ownScore)) {
				sum -= ownScore;
				divide--;
			}

			avg = (double) sum / (double) divide;
			answer += getRank(avg);

		}

		return answer;
	}

	private String getRank(double score) {
		if (score >= 90) {
			return "A";
		}
		if (score >= 80) {
			return "B";
		}
		if (score >= 70) {
			return "C";
		}
		if (score >= 50) {
			return "D";
		}

		return "F";
	}

	public static void main(String[] args) {
		InteractionEvaluation ie = new InteractionEvaluation();

		int[][] arr = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };

		System.out.println(ie.solution(arr));
	}

}

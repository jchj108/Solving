package level1.test;


public class InteractionEvaluation {

	public String solution(int[][] scores) {
		String answer = "";

		// i j는 i번 학생이 평가한 j번 학생의 점수
		// 자기 자신에 대한 평가 점수가 유일한 최고점 또는 최저점이라면
		// 해당 점수는 제외하고 평균 구한 후
		// 평균 점수에 따라 학점 부여해 리턴

		for (int i = 0; i < scores.length; i++) {
			int ownScore = scores[i][i]; // [i][i]는 2차원 배열의 대각선의 값이 된다
			boolean sameScore = true;
			int sum = 0;
			int divide = 0;
			int max = scores[0][i];
			int min = scores[0][i];
			double avg;

			for (int j = 0; j < scores.length; j++) { // 자기 자신과 똑같은 값 찾기
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

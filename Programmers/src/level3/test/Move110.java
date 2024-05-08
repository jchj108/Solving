package src.level3.test;

public class Move110 {

    public static void main(String[] args) {

        String[] input = new String[]{"100111100"};
        String[] res = solution(input);

        for (String s : res) {
            System.out.println(s);
        }
    }

    public static String[] solution(String[] s) {

        String[] answer = new String[s.length];

        int k = 0;
        for (String str : s) {
            int cnt = 0;
            while (str.contains("110")) {
                cnt++;
                str = str.replace("110", "");
            }

            int idx = 0;

            System.out.println(str);
            System.out.println(cnt);

            for (int i = 0; i < str.length(); i++) {
                if (cnt == 0) {
                    break;
                }
                if (str.length() - i < 3) {
                    if (str.toCharArray()[i] == '1') {
                        StringBuilder sb = new StringBuilder(str.substring(0, i));
                        sb.append("110");
                        sb.append(str.substring(i, str.length()));

                        str = sb.toString();
                    }
                    cnt--;

                } else {
                    if (str.substring(i, i + 3).equals("111")) {
                        StringBuilder sb = new StringBuilder(str.substring(0, i));
                        sb.append("110");
                        sb.append(str.substring(i, str.length()));

                        str = sb.toString();
                        cnt--;
                    } else {
                        StringBuilder sb = new StringBuilder(str.substring(0, i+3));
                        sb.append("110");
                        sb.append(str.substring(i, str.length()));

                        str = sb.toString();
                        cnt--;

                    }
                }
            }

            answer[k] = str;
            k++;
        }
        return answer;
    }
}

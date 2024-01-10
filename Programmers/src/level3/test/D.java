package src.level3.test;

import showMe.A;

import java.util.*;

public class D {

    public static void main(String[] args) {

        int[] res = solution(8, new int[]{1, 3, 7});

        Arrays.stream(res).forEach(System.out::println);
    }


    public static int[] solution(int e, int[] starts) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < starts.length; i++) {
            Map<Integer, Integer> divisorCntMap = new HashMap<>();
            int maxCount = 0;

            for (int j = starts[i]; j <= e; j++) {
                int divisorCount = getDivisorCount(j);
                if (maxCount < divisorCount) {
                    maxCount = divisorCount;
                }

                divisorCntMap.put(j, divisorCount);
            }
            List<Integer> maxCntKeys = getKeysByValue(divisorCntMap, maxCount);
            answer.add(maxCntKeys.get(0));
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static List<Integer> getKeysByValue(Map<Integer, Integer> map, int value) {
        List<Integer> res = new ArrayList<>();

        map.forEach((k, v) -> {
            if (v == value) {
                res.add(k);
            }
        });

        return res;
    }

    public static int getDivisorCount(int value) {
        int cnt = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                cnt++;
            }
        };

        return cnt;
    }
}

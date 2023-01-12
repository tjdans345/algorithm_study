package practice;


import java.util.Scanner;

public class P1 {

    /**
     * 평균 값 구하기
     * @param args args
     */
    public static void main(String[] args) {

        System.out.println("시험 과목 개수를 입력해주세요. ");
        Scanner scanner = new Scanner(System.in);

        int subjectCount = scanner.nextInt();
        int[] subjectScoreArray = new int[subjectCount];

        for(int i=0; i < subjectCount; i++) {
            System.out.println(i + "번 째 과목의 점수를 입력해주세요.");
            subjectScoreArray[i] = scanner.nextInt();
        }

        int sum = 0;
        int max = 0;

        for (int i=0; i < subjectCount; i++) {

            // 내장 라이브러리 사용 했을 때
//            max = Math.max(subjectScoreArray[i], max);
            max = (subjectScoreArray[i] > max) ? subjectScoreArray[i] : max;

            sum += subjectScoreArray[i];

        }
        System.out.println("최대 값 : " + max);
        System.out.println("총합 : " + sum);


        System.out.println("시험 평균은 " + sum * 100.0 / max / subjectCount );

    }
}

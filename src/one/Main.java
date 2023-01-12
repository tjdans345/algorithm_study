package one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("자릿 수를 입력해주세요");
        int numberLength = sc.nextInt();
        System.out.println(numberLength);

        System.out.println("자릿수 만큼의 수를 입력해주세요");
        String number = sc.next();
        System.out.println(number);

        char[] chaNumberArray = number.toCharArray();

        for (int i=0; i < chaNumberArray.length; i++ ) {
            // 0을 뺴줘서 아스키 코드를 사용해도 되지만
            // 보기 좋은 코드라고 생각하지 않는다.
            // 자바가 제공해주는 형변환 라이브러리 사용
            sum += Character.getNumericValue(chaNumberArray[i]);
        }

        System.out.println(sum);
    }

}
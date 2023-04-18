import java.sql.SQLOutput;

public class Solution2 {
    public static void main(String[] args) {
        // 자료형 다루기
        // 정수 자료형
        int i = 10; // i라는 변수는 int라는 자료형을 담을 수 있고, 그 i라는 변수에 10을 넣어주었다.
        // int i2 =9999999999; // int 타입은 일정 이상의 큰 숫자를 담을 수 없다.
        long i2 = 99999999999L; // 뒤에 L이 붙으면 Long 타입
        System.out.println(i2);  // shift + F10

        // 실수 자료형 (소숫점을 포함한)
        float f = 1.5f;  // 상대적으로 짧은 소숫점 표시
        System.out.println(f);
        float f2 = 1.555555555555555555555f;  // 일정 이상의 소숫점 표현이 안됨.(끊어서 저장 됨)
        double f3 = 1.5555555555555555555555;   // 상대적으로 긴 소숫점 표시 (default)
        System.out.println(f2);
        System.out.println(f3);
        // type별로 특징이 다 다름 -> python처럼 몇 가지의 타입을 돌려쓰는 느낌이 아니다.
    }
}

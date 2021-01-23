package lecture_20210117;

public class Lecture02 {
    // 타입 캐스팅
    public static void main(String[] args) {
        /*
        자바는 타입이 서로 일치하지 않느 경우에도 타입끼리 "서로 호환성이 있으면" 자동적으로 변환을 실시한다.
        예를들어 short 타입은 16비트의 정수이고, int 타입은 32bit의 정수이므로
        short 타입의 값을 int 타입의 값으로 취급해도 값이 변하는 문제는 발생하지 않는다.

        즉, 타입의 데이터 크기가 커지는 변환인 경우는 호환성이 보장되어 새로운 타입으로 자동 형 변환된다.
        이 변환을 프로모션(확장 변환)이라 한다.
         */

        short shortNum = 100;
        int intNum = shortNum; // 프로모션에 의한 자동 변환(short -> int)

        /*
        한편 int 타입의 값이 short 타입으로 나타낼 수 있는 값의 범위를 넘을 경우에는
        int 타입의 값은 short형으로 취급할 수 없기 때문에 호환성이 없다.

        즉, 타입의 데이터 크기가 작아지는 변환의 경우는 호환성이 없기때문에 자동적으로 변환할 수 없어 컴파일 에러가 된다.
        이러한 경우에는 타입을 "명시적으로 지정"함으로써 타입을 변환할 수 있다.
        이 변환을 캐스팅(축소 변환)이라 한다.

        단, 변환 후의 타입의 범위를 넘어가는 값을 축소 변환하면 오버플로우가 발생해 프로그램상의 에러가 발생할 수 있다.
         */

        int intNum3 = 1;
        short shortNum = intNum3; // 컴파일 에러

        int intNum2 = 32767;
        short shortNum2 = (short) intNum;

    }
}

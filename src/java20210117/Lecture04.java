package lecture_20210117;

public class Lecture04 {

    //연산자
    /*
    계산이나 비교를 실시할 때에는 연산자를 이용하고 이러한 연사자는 연산 대상의 값이나 변수의 수에따라 이름이 분류되어 있다.
     */

    /*
    산술 연산자Permalink
    산술 연산자는 수치 계산을 실시하기 위한 연산자다.

    ++ 와 -- 는 기술하는 위치에 따라 약간 동작이 다른데
    연산자를 왼쪽에 작성하면(전치 연산) "먼저 계산을 한 후" 그 결과를 사용한다.
    반대로 연산자를 오른쪽에 작성하면(후치 연산) "현재의 값이 사용되고나서" 그후에 계산을 한다.
     */
    public static void main(String[] args) {
        int numberA = 1;
        int numberB = 1;
        System.out.println(++numberA); // 2
        System.out.println(numberB++); // 1
        System.out.println(numberB); // 2

        /*
        비트 연산자
        비트 연산자는 숫자값의 비트 연산을 실시할 수 있는 연산자다.
         */

        // |(or), &(And)
        /*
        관계 연산자
        관계 연산자는 2개의 인수를 비교하는 연산자다.
         */

        // <, >, =, ==, <=, >=, !=
        boolean result = 1 > 2;
        System.out.println(result); // false

        /*
        논리 연산자
        논리 연산자는 참과 거짓을 판정하는 논리 연산을 실시하기 위한 연산자다.
         */
        boolean conditionA = true;
        boolean conditionB = false;
        System.out.println(conditionA || conditionB); // true

        // 3항 연산자자
        //2개의 식 중 어느 것을 이용할 것인지 판정하기 위한 연산자다.

        boolean result2 = 1 > 0 ? true : false;
        System.out.println(result2); // true
    }
}


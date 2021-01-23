package lecture_20210117;

public class Student {
    /*
        클래스를 정의 하는 방법
        자바에서는 어떤 프로그래밍이든 클래스 안에 속해있는데 클래스란 변수나 메서드를 모아둔 틀 또는 그릇과 같은 것이다.
        프로그램을 만들 때는 구조를 파악하기 쉽도록 프로그램을 분할하는데 그때 우선 클래스 단위로의 분할을 고려한다.

        예를 들면 학생의 점수를 관리하는 프로그램은 '학생' 이라는 개념을 클래스화 한다.
     */

    String name;
    int score;
    static final int MAX_SCORE = 100;

    /*
        클래스는 class 블록 내에 유지시킬 변수를 선언하여 만든다.
        클래스가 갖는 변수를 '필드' 라고 부른다. ex) name, score, MAX_SCORE(상수 필드)
     */

    /*
        객체 만드는 방법 (new 키워드 이해하기)
        필드와 메서드를 작성하면 클래스는 만들어진다.
        단, 클래스의 선언만으로는 아직 물건을 담을 틀만 존재하는 상태다.
        실제로 프로그램에서 사용하려면 이 틀을 이용해서 실제 물건을 만든 후에 이용할 필요가 있다.
        이 실제 물건을 '객체' 또는 '인스턴스'라고 한다.

        자바 언어의 특징중 new를 사용해 메모리를 할당하는 기능이 있다.
        힙(Heap) 영역에 저장할 공간을 할당해서 참조 값을 객체에게 반환하여 주는 것인데
        힙은 참조형 공간으로써 해제 하기전까지 할당된 메모리는 삭제되지 않는다.
     */

    /*
        생성자 정의 하는 방법
        실제 프로그램에서는 인스턴스를 생성하는 시점에 설정을 읽어들이거나 필드를 초기화하는 등 여러가지 처리를 하는 경우가 있다.
        그러한 때는 '생성자'를 선언하는데 '생성자'는 인스턴스를 '생성'할 때 호출되는 처리다.

        이러한 생성자는 두 가지 특징이 있다.

        1. 메서드명이 클래스명과 동일하다.
        2. 반환값의 선언이 존재하지 않는다.

     */
    public Student() {

    }

    public Student(String name) {
        // 인수와 필드의 이름이 동일하므로 name을 사용하면 필드가 아닌 인수쪽이 사용된다.
        // 따라서 필드를 사용하고 싶은 경우는 명시적으로 this를 붙인다.
        this.name = name;
    }

    /*
        위의 소스코드는 생성자에서 필드를 '초기화'하고 있는 예다.
        생성자에서도 일반 메서드와 동일하게 오버로딩이 가능하다.
        즉, 인수가 다른 생성자를 여러 개 정의할 수 있다.
     */
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
        /*
            Student(자료형) kim(참조변수);
            kim(참조변수) = new(인스턴스 생성, 메모리할당) Student()(생성자 호출 및 초기화);
         */

        /*
            위에 선언을 보면
            1. Student라는 타입, 자료형으로 kim 객체를 선언한다.
            2. Student 클래스의 생성자가 클래스를 초기화한다.
            3. new 연산자를 사용하여 Student()를 힙(heap) 영역에 할당하고 주소를 kim 변수에 저장한다.

            즉 new 연산자를 통해 Heap 영역에 데이터를 저장할 공간을 할당받고 그 공간의 참조값을 객체에게 반환함으로써
            클래스 타입의 인스턴스(객체)를 생성해주는 역할을 하는 것이다.
         */

        /*
            메서드에는 'main' 메서드라는 특별한 메서드가 있다.
            이 메서드는 자바 프로그램을 실행했을 때 호출되는 프로그램의 시작점인 메서드이며
            자바 프로그램에는 반드시 존재해야 한다.
         */

        // 생성자 예시
        Student student1 = new Student();
        Student student2 = new Student("Kim");
        Student student3 = new Student("Kim", 100);
    }

    /*
        메소드를 정의 하는 방법법
        메서드는 처리를 기술하는 블록이다.
        메서드는 다음의 형태로 클래스 안에 선언한다.

        <수식자> <반환값의 타입> <메서드의 이름> (<인수1의 타입><인수1의 이름>, <인수2의 타입><인수2의 이름>....)

        public String getName(String name, int age)
        메서드는 호출할 때 값을 건넬 수 있고 이 값을 '인수' 라고 부른다.
        인수는 몇 개라도 기술할 수 있으며 인수를 건네지 않는 것도 가능하다.

        메서드를 호출한 후 결괏값을 호출자에게 반환할 수 있고 이 값을 '반환값'이라고 한다.
        반환값이 없는 경우는 타입으로 'void'를 지정하고 void 이외의 타입을 지정한 경우,
        해당 메서드에 return문을 사용해서 타입이 일치하는 값을 반드시 반환할 필요가 있다.

    */

    public String getName(String name, int age) {
        return name;
    }

    public void test() {
        System.out.println("Hello World");
    }

    /*
        메서드 오버로딩
        하나의 클래스 안에서는 동일 명칭의 메서드를 복수 정의할 수 없다.
        단, 인수의 타입이나 인수의 수가 다르면 동일 명칭의 메서드를 정의할 수 있다.
        이러한 정의를 메서드의 '오버로딩' 이라고 부른다.
        다음의 소스코드에서는 인수에 int 타입이 지정된 경우는 위쪽의 메소드가 호출되고
        인수의 지정이 없는 경우는 아래쪽의 메소드가 호출된다.
     */

    void printScore(int score) {
        System.out.println(score);
    }

    void printScore() {
        printScore(MAX_SCORE);
    }

}
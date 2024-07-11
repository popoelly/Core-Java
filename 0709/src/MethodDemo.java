/*
    Method를 호출하는 방법 3가지
    1) Call(Pass) by Name
    2) Call(Pass) by Value
    3) Call(Pass) by Reference
 */

public class MethodDemo {
    public static void main(String[] args) {
        MethodDemo md=new MethodDemo();
        md.calcHap();
    }
   void calcHap(){
        // 괄호가 있으면 함수, 없으면 변수
        //  변수와 함수는 둘 다 소문자로 시작
        // 무취형 void. 반환하지 않으니까.
        // 메서드가 실행되고 나면 호출한 곳으로 값을 반환하지 않고, 단순히 작업을 수행하고 끝내는 경우에 사용
        // 메서드의 필수 3요소 ★ 1.이름 2.괄호 3.리턴타입 ★  3가지 중에 하나라도 없으면 메소드 XX 중괄호는 없어도 OK
       int hap = 0;
        for (int i = 0; i < 101; i++) {
            hap += i;
        }
        System.out.println("1부터 100까지의 합은 " + hap + "입니다.");
    }
}
//Naming Convention
/*
1. PascalCasing 첫글자가 대문자 : Class ,InterFace, Enum
2. camelCasing 첫글자가 소문자  : variable(변수) , method
3. Snake_Casing 이름에 언더바
4. Kebab-Casing
*/

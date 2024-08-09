## chapter 02
### 02-1 함수의 재귀적 호출의 이해
- 재귀함수 : 함수 내에서 자기 자신을 다시 호출하는 함수
- 팩토리얼 : n!
  - n! = n * (n-1) * n-2 * ... * 2 * 1
  - n! = n * (n-1)!
```java
public class RecursiveFactorial {

    private static int factorial(int n) {
        if(n == 1) return 1; //기저 사례(BASE CASE)
        else return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(9));
    }
}
```
- 결과 : ``362880``

### 02-3 하노이 타워


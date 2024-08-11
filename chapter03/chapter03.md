## chapter 03
### 03-1 추상 자료형 : Abstract Data Type
- 추상 자료형(ADT)
- 구체적인 기능의 완성과정을 언급하지 않고, 순수하게 기능이 무엇인지를 나열한 것

### 03-2 배열을 이용한 리스트의 구현
- 순차 리스트 : 배열을 기반으로 구현된 리스트
- 연결 리스트 : 메모리의 동적 할당을 기반으로 구현된 리스트
- 리스트 특성
  - 데이터를 나란히 저장
  - 중복된 데이터의 저장 허용
- 리스트의 ADT
  - init
    - java기반으로 작성하므로 생성자로 대체함
  - insert
    - 교재 : insert(List *plist, Data data); 
    - 위 코드는 C언어 기반이므로 plist 주소값이 필요하다고 생각된다.
    - java 기반이므로 (Object data); 로 변경하도록 하겠다.
  - first
    - pdata가 가리키는 메모리에 저장
    - 성공 시 true, 실패 시 false 반환
  - next
  - remove
  - count
  
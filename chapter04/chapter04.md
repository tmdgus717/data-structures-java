## chapter 04
### 04-1 연결 리스트의 개념적인 이해
```c
typedef struct _node
{
    int data;
    struct _node * next;
}Node
```
- 데이터를 저장할 장소
- 다른 변수를 가리키기 위한 장소

#### 연결리스트 삽입
- 연결 리스트에서 주요한 역할을 하는 포인터 변수들
- Node * head = NULL;
- Node * tail = NULL;
- Node * cur = NULL; -> 저장된 데이터의 조회에 사용되는 포인터 변수

### 04-2 단순 연결 리스트의 ADT와 구현
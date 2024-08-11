package chapter03;

import java.util.NoSuchElementException;

public class ArrayList<E> {
    Object arr[];
    int numOfData = 0; //저장된 데이터의 수
    int curPosition = -1; //가장 최근의 데이터 참조위치를 기록

    public ArrayList() {
        this.arr = new Object[10]; //java ArrayList 기본 10개
    }//ArrayList

    public ArrayList(int size){
        this.arr = new Object[size];
    }//ArrayList(int size)

    public void insert(E data) {
        if (numOfData >= arr.length){//저장할 공간이 없다면
            System.out.println("저장 공간 부족");
            return;
        }
        arr[numOfData] = data;
        numOfData++;
    }//insert

    public int count() {
        return numOfData;
    }//count

    public E first() {
        if (numOfData == 0){
            throw new NoSuchElementException();
        }
        curPosition = 0; //curPosition을 0으로 재설정함으로 데이터의 참조가 앞에서부터 다시 진행되도록 한다.
        return (E) arr[curPosition];
    }//first

    public E next() {
        if (curPosition >= numOfData - 1) { //더 이상 참조할 데이터가 없음
            throw new NoSuchElementException();
        }
        curPosition++;
        return (E) arr[curPosition];
    }//next

    public boolean hasNext() {
        if (curPosition >= numOfData - 1) return false;
        else return true;
    }//hasNext

    public E remove() {
        E removeData = (E) arr[curPosition];

        int lastIndex = numOfData - 1;
        for (int i = curPosition; i < lastIndex; i++) { //현재 위치부터 마지막 위치 전까지 돌면서
            arr[i] = arr[i+1]; //현재 위치에 다음 위치 값을 넣는다
        }

        numOfData--; //데이터의 수 감소
        curPosition--; //현재 위치를 이전으로 변경
        return removeData; //삭제된 데이터 반환
    }//remove
}

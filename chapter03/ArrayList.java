package chapter03;

public class ArrayList<E> {
    Object arr[];
    int numOfData; //저장된 데이터의 수
    int curPosition; //데이터 참조위치를 기록

    public ArrayList() {
        this.arr = new Object[10]; //java ArrayList 기본 10개
        this.numOfData = 0; //저장된 데이터의 수 = 0
        this.curPosition = -1; //아무 위치도 가리키지 않는다
    }//ArrayList

    public void insert(E data) {
        if (numOfData >= arr.length){//저장할 공간이 없다면
            System.out.println("저장 공간 부족");
            return;
        }
        this.arr[numOfData] = data;
        this.numOfData++;
    }//insert

    public int count() {
        return this.numOfData;
    }//count

    public boolean first() {
        if (numOfData == 0){
            return false;
        }
        curPosition = 0;
        return true;
    }
}

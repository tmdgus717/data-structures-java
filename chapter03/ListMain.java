package chapter03;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        
         //5개의 데이터를 저장
        arrayList.insert(11);
        arrayList.insert(11);
        arrayList.insert(22);
        arrayList.insert(22);
        arrayList.insert(33);

        //데이터의 수 출력
        System.out.println("현재 데이터의 수 : " + arrayList.count());

        //처음 데이터 조회
        System.out.println(arrayList.first());

        while (arrayList.hasNext()){
            System.out.println(arrayList.next());
        }
        System.out.println();

        //숫자 22를 탐색하여 모두 삭제
        if(arrayList.first() == 22){
            arrayList.remove();
        }

        while (arrayList.hasNext()){
            if (arrayList.next() == 22){
                arrayList.remove();
            }
        }
        
        //삭제 후 남은 데이터 전체 출력
        System.out.println("현재 데이터의 수 : " + arrayList.count());
        System.out.println(arrayList.first());

        while (arrayList.hasNext()){
            System.out.println(arrayList.next());
        }
    }
}

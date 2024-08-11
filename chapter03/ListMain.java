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


    }
}

package chapter03;

public class NameCardMain {
    public static void main(String[] args) {
        ArrayList<NameCard> arrayList = new ArrayList<>();

        arrayList.insert(new NameCard("Eddy", "010 - 1111 - 2222"));
        arrayList.insert(new NameCard("Sean", "010 - 3333 - 4444"));
        arrayList.insert(new NameCard("Soo", "010 - 5555 - 6666"));

        //Sean을 찾아서 정보를 출력한다
        String name = "Sean";
        String rName = "Eddy";
        String phone = "010 - 7777 - 8888";
        NameCard nameCard = arrayList.first();
        if (nameCard.nameCompare(name)){
            nameCard.showNameCardInfo();
        }
        while (arrayList.hasNext()){
            nameCard = arrayList.next();
            if (nameCard.nameCompare(name)){
                nameCard.showNameCardInfo();
            }
        }
        System.out.println();

        //이름을 탐색해서 전화 번호 정보를 변경
        nameCard = arrayList.first();
        if (nameCard.nameCompare(name)){
            nameCard.changePhoneNum(phone);
        }
        while (arrayList.hasNext()){
            nameCard = arrayList.next();
            if (nameCard.nameCompare(name)){
                nameCard.changePhoneNum(phone);
            }
        }

        //이름을 탐색해서 정보를 삭제
        nameCard = arrayList.first();
        if (nameCard.nameCompare(rName)){
            arrayList.remove();
        }
        while (arrayList.hasNext()){
            nameCard = arrayList.next();
            if (nameCard.nameCompare(rName)){
                arrayList.remove();
            }
        }

        //남아있는 사람의 전화번호 출력
        System.out.println("현재 데이터의 수 : " + arrayList.count());
        nameCard = arrayList.first();
        nameCard.showNameCardInfo();
        while (arrayList.hasNext()){
            nameCard = arrayList.next();
            nameCard.showNameCardInfo();
        }
    }
}

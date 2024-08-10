package chapter02;

public class HanoiTower {

    private static void hanoiTowerMove(int n, char a, char b, char c) {
        if (n == 1) System.out.println("원반 " + n + "을 " + a + "에서 " + c + "로 이동");
        else {
            hanoiTowerMove(n - 1, a, c, b);
            System.out.println("원반 " + n + "을 " + a + "에서 " + c + "로 이동");
            hanoiTowerMove(n - 1, b, a, c);
        }
    }//hanoiTowerMove

    public static void main(String[] args) {
        hanoiTowerMove(3,'A','B','C');
    }//main
}//HanoiTower

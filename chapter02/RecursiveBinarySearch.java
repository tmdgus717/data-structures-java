package chapter02;

public class RecursiveBinarySearch {

    private static int binarySearch(int[] arr, int firstIndex, int lastIndex, int target) {
        if (firstIndex > lastIndex) return -1;

        int mid = (firstIndex + lastIndex) / 2;
        if(arr[mid] == target) return mid;
        else if (arr[mid] < target) { // 5 < 7
            //타겟 값이 크면 mid값을 firstIndex로 변경
            return binarySearch(arr, mid + 1, lastIndex, target);
        }
        else {
            return binarySearch(arr, firstIndex, mid - 1, target);
        }
        /**
         * mid + 1, mid - 1
         * 중복 검사를 방지하고 탈출 조건을 만족시킨다
         * */
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        int target = 7;

        //성공
        int idx = binarySearch(arr, firstIndex, lastIndex, target);
        if(idx == -1) System.out.println("배열에 target값이 없습니다");
        else System.out.println("인덱스 : " + idx);

        //실패
        int target2 = 8;
        int idx2 = binarySearch(arr, firstIndex, lastIndex, target2);
        if(idx2 == -1) System.out.println("배열에 target값이 없습니다");
        else System.out.println("인덱스 : " + idx2);
    }
}

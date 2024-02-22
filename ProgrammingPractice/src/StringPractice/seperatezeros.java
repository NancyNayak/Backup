//package StringPractice;
//
//public class seperatezeros {
//    public static void main(String[] args) {
//        int[] arr = {0,0,0,1,0,1,1,1};
//        int temp;
//
//        int startIndex = 0;
//        int EndIndex = arr.length - 1;
//
//        int count=0;
//
//        while (startIndex < EndIndex) {
//
//            if (arr[startIndex] == 1 && arr[EndIndex] == 0) {
//                temp = arr[startIndex];
//                arr[startIndex] = arr[EndIndex];
//                arr[EndIndex] = temp;
//            } else if (arr[startIndex] == 0) {
//                startIndex++;
//            } else {
//                EndIndex--;
//            }
//            count++;
//        }
//        System.out.println(count);
//        for (int x : arr
//        ) {
//            System.out.print(x);
//
//        }
//    }
//}
//

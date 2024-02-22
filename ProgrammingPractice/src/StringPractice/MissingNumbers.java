package StringPractice;

public class MissingNumbers {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 7, 8,9,10};
        int sum =0, add = 0;

        for (int i = 0; i <=10; i++) {
            sum = sum + i;

        }
            for (int j = 0; j < arr.length; j++) {
                add = add + arr[j];


            }
            System.out.println(sum - add);

        }
    }
package StringPractice;

public class RemoveDuplicatesInArray {

    public static int[] distinct(int[] nums){
//        Write your logic here
int[] temp={};
int i=0;
        for( i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                   break;

                }
                System.out.println( nums[i]);
            }

        }


        return nums;
    }


    public static void main(String[] args) {
        RemoveDuplicatesInArray.distinct(new int[]{1, 2, 3, 1});
    }


}

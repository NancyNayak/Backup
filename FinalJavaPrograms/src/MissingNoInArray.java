public class MissingNoInArray {
    public static void main(String[] args) {
         int a[]={1,2,3,4,6,7,8,9,10};
         int sum=0;
         int add=0;
          for(int i=1;i<=10;i++){
              sum=sum+i;
          }
        for(int j=0;j<a.length;j++){
            add=add+a[j];
        }
        System.out.println(sum-add);

    }
}

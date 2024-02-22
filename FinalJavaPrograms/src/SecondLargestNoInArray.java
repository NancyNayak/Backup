public class SecondLargestNoInArray {
    public static void main(String[] args) {

        int a[]={12, 35, 1, 10, 34, 1 };
        int FirstMax=a[0];
        int SecondMax=0;
      for(int i=0;i<a.length;i++){
          if(a[i]>FirstMax){
              SecondMax=FirstMax;
              FirstMax=a[i];

          }
           if(a[i]>SecondMax&&a[i]<FirstMax){
              SecondMax=a[i];
          }

          }
        System.out.println(SecondMax);

      }

       }




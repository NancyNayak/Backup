package Practiceagain;

public class SecondMaxElementInArray {
    public static void main(String[] args) {


        int a[] = {1, 4, 5, 6, 8};
        int firstMax=a[0];
        int SecondMax=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>firstMax){
                SecondMax=firstMax;
                firstMax=a[i];


            }
            if(a[i]<SecondMax&&firstMax!=SecondMax){
                SecondMax=a[i];
            }

        }
        System.out.println(SecondMax);

    }
}
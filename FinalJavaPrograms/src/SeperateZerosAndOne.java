public class SeperateZerosAndOne {
    public static void main(String[] args) {
        int a[]={1,0,1,0,1,0,1,1,1,};
        int startindex= 0;int temp=0;
        int Endindex=a.length-1;
        while(startindex<Endindex){
            if(a[startindex]==1&&a[Endindex]==0){
                temp=a[startindex];
                a[startindex]=a[Endindex];
                a[Endindex]=temp;

            }
            if(a[startindex]==0){
                startindex++;
            }
            if(a[Endindex]==1){
                Endindex--;
            }

        }

        for (Integer c:a
        ) {
            System.out.println(c);

        }
    }




}

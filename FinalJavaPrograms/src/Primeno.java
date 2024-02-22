public class Primeno {
    public static void main(String[] args) {
        System.out.println(primeNo());

    }

    public static boolean primeNo() {
        int n = 5;
        if (n <= 1) {
            return false;
        }
        for (int i=2;i<n;i++){
            if(n%i==0){
                return  false;
            }

        }
              return  true;
    }

}

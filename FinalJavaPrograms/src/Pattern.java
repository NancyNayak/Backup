public class Pattern {
    public static void main(String[] args) {


        String s = "Nancy";
        //N
        //NA
        //NAN
        // NANC
        //  NANCY

        for (int i=0; i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j));

            }
            System.out.println();

        }

    }
}
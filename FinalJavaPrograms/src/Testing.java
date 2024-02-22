import java.util.Arrays;

public  class Testing {
    public static void main(String[] args) {

        String s1="Racen";
        String s2="care";
//        Boolean result=false;

     char ch1[]=   s1.toLowerCase().toCharArray();
        char ch2[]=   s2.toLowerCase().toCharArray();
        if(ch1.length==ch2.length) {
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            Boolean result = Arrays.equals(ch1, ch2);

            if (result) {
                System.out.println("anagram");
            } else {
                System.out.println("not anagram");
            }
        }









    }
}
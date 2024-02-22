public class countofAlphabetfromStringofIntegerAndCharacter {
    public static void main(String[] args) {
        String s = "ABCabc123";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>='A'&& s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
        }
        System.out.println(count);

    }

}




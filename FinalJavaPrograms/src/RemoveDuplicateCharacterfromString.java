import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacterfromString {
    public static void main(String[] args) {
//        1st approch
        String s = "aabbbccdda";
//        char ch[]=s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        for (Character c : set) {
            System.out.print(c);
        }


        //2nd approch
        StringBuilder sb = new StringBuilder();
//        String s = "aabbbccdda";
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            Boolean repeated = false;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb.append(ch[i]);
            }
        }
    }


}



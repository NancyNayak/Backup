import java.util.*;

public class StringProgram {
    public static boolean anagram() {
        String s1 = "silent";
        String s2 = "Listen";

        char a1[] = s1.toLowerCase().toCharArray();
        char a2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) {
            System.out.println("anargram");
        } else {
            System.out.println("Not anargram");

        }


        return true;
    }

    public static void repeatingLetter() {
        String s = "NancyNayakN";
        char[] ch = s.toCharArray();
        Map<Character, Integer> hs = new HashMap<>();
        for (Character c : ch) {
            if (hs.containsKey(c)) {
                hs.put(c, hs.get(c) + 1);
            } else {
                hs.put(c, 1);
            }
        }
        System.out.println(hs);
        Set<Character> keys = hs.keySet();
//        List<Integer> values = (List<Integer>) hs.values();
//        values.sort(Comparator.reverseOrder());

        int max = hs.values().stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
//        int max = values.get(0);

        hs.keySet().stream().forEach(System.out::println);
        for (Character c:keys
             ) {
            if(hs.get(c) == max){
                System.out.println(c + " - " + hs.get(c) );
            }
        }
    }

    public static void main(String[] args) {

//    anagram();
        repeatingLetter();


    }
}

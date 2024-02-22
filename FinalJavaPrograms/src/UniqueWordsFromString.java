public class UniqueWordsFromString {
    public static void main(String[] args) {
        String s="sapan prem mukesh sapan";
        int count=0;
        String[] words=s.split(" ");
        for(int i=0;i< words.length;i++){
            count=1;
            if(!words[i].equals("")){
                for (int j = i + 1; j < words.length; j++) {

                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = "";


                }
                }
                System.out.println(words[i]+":"+count);
            }


        }
    }
}

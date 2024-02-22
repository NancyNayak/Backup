import java.util.ArrayList;

public class CommonElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(6);
        list1.add(7);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(8);
        System.out.println(list1);
        System.out.println(list2);
        list2.retainAll(list1);
        System.out.println(list1);
        System.out.println(list2);

    }

}

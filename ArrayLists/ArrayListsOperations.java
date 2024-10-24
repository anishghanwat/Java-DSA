import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // add at an index
        list.add(2, 9);

        System.out.println(list);

        // get - O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove - O(n)
        list.remove(2);
        System.out.println(list);

        // set - O(n)
        list.set(2, 10);
        System.out.println(list);

        // contains - O(n)
        System.out.println(list.contains(9));
        System.out.println(list.contains(10));

        // size
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print reverse of an arraylist - O(n)
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print maximum - O(n)
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            // if (list.get(i) > max) {
            // max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);

        // swap
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);

        System.out.println(list);

        // sorting on arraylist
        // ascending order
        Collections.sort(list); // O(n log n)
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // multi dimensional ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> innerList1 = new ArrayList<>();
        ArrayList<Integer> innerList2 = new ArrayList<>();
        ArrayList<Integer> innerList3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            innerList1.add(i * 1);
            innerList2.add(i * 2);
            innerList3.add(i * 3);
        }

        mainList.add(innerList1);
        mainList.add(innerList2);
        mainList.add(innerList3);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
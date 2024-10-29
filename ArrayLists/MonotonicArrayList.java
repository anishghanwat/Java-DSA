import java.util.ArrayList;
//An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
//An Arraylist nums is monotone increasing if for all i<=j, nums.get(i)<=nums.get(j).
//An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
//Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
//O(n)
public class MonotonicArrayList {
    public static boolean monoArray(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            } else if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            }
        }
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);

        System.out.println(monoArray(list));
    }
}

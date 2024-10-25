import java.util.ArrayList;

public class PairSumA {
    // //Brute Force - O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;

    // 2 pointer Approach - O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            int sum = list.get(lp) + list.get(rp);
            // sum equals target
            if (sum == target) {
                return true;
            }
            // sum less than target
            if (sum < target) {
                lp++;
            }
            // sum greater than target
            if (sum > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum(list, target));
    }
}

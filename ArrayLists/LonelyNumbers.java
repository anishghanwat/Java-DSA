import java.util.ArrayList;
import java.util.Collections;

/*
You are given an integer ArrayList nums. A number x is considered lonely when it appears only once, 
and no adjacent numbers (i.e. x + 1 and x - 1) appear in the ArrayList.

Return all lonely numbers in nums. You may return the answer in any order.
 */
public class LonelyNumbers {
    public ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> lonely = new ArrayList<Integer>();

        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                lonely.add(nums.get(i));
            }
        }
        if (nums.size() == 1) {
            lonely.add(nums.get(0));
        }
        if (nums.size() > 1) {
            if (nums.get(0) + 1 < nums.get(1)) {
                lonely.add(nums.get(0));
            }
            if (nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
                lonely.add(nums.get(nums.size() - 1));
            }
        }
        return lonely;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);

        LonelyNumbers lonelyNumbers = new LonelyNumbers();
        ArrayList<Integer> result = lonelyNumbers.findLonely(nums);

        System.out.println(result);
    }
}

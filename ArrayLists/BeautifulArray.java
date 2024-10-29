import java.util.ArrayList;

/*
An ArrayList nums of size n is beautiful if:

nums is a permutation of the integers in the range [1, n].
For every 0 <= i < j < n, there is no index k with i < k < j where 2 * nums.get(k) == nums.get(i) + nums.get(j).
Given the integer n, return any beautiful ArrayList nums of size n.
There will be at least one valid answer for the given n.
 */
public class BeautifulArray {
    // public ArrayList<Integer> BeautifulArray(int n) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     ans.add(1);

    //     for (int i = 2; i <= n; i++) {
    //         ArrayList<Integer> temp = new ArrayList<>();
    //         for (Integer e : ans) {
    //             if (2 * e <= n) {
    //                 temp.add(2 * e);
    //             }
    //         }
    //         for (Integer e : ans) {
    //             if (2 * e - 1 <= n) {
    //                 temp.add(2 * e - 1);
    //             }
    //         }
    //         ans = temp;
    //     }
    //     return ans;
    // }

    public ArrayList<Integer> beautiful(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1, 1, res, n);
        return res;
    }

    private void divideConque(int start, int inc, ArrayList<Integer> res, int n) {
        if (start + inc > n) {
            res.add(start);
            return;
        }
        divideConque(start, 2 * inc, res, n);
        divideConque(start + inc, 2 * inc, res, n);
    }

    public static void main(String[] args) {
        int n = 4;

        BeautifulArray ba = new BeautifulArray();
        ArrayList<Integer> result = ba.beautiful(n);

        System.out.println(result);
    }
}

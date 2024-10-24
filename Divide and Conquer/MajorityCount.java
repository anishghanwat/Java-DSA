public class MajorityCount {
    // public static int majorityElement(int[] nums) {
    // int majorityCount = nums.length/2;

    // for(int i=0; i<nums.length; i++) {
    // int count = 0;
    // for(int j=0; j<nums.length; j++) {
    // if(nums[i] == nums[j]) {
    // count++;
    // }
    // }
    // if(count > majorityCount) {
    // return nums[i];
    // }
    // }
    // return -1;
    // }
    private static int countInRange(int nums[], int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    private static int majorityElementRec(int nums[], int si, int ei) {
        if (si == ei) {
            return nums[si];
        }
        int mid = (si + ei) / 2;
        int leftMajority = majorityElementRec(nums, si, mid);
        int rightMajority = majorityElementRec(nums, mid + 1, ei);

        if (leftMajority == rightMajority) {
            return leftMajority;
        }

        int leftCount = countInRange(nums, leftMajority, si, ei);
        int rightCount = countInRange(nums, rightMajority, si, ei);

        return leftCount > rightCount ? leftMajority : rightMajority;
    }

    public static int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums));
    }
}

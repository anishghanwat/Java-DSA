public class prefixarray {
    public static void subarrays(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        // calculate prefix
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                // Max of Subarray
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
    }

    public static void kadane(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subarray is: " + ms);
    }

    public static void main(String[] args) {
        int numbers[] = { -1, -2, -3, -4, -5 };
        subarrays(numbers);
        kadane(numbers);
    }

}

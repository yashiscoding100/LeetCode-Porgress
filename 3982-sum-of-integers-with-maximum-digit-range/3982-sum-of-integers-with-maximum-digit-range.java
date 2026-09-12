class Solution {
    public int maxDigitRange(int[] nums) {

        int maxRange = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int max = 0;
            int min = 9;

            while (num > 0) {
                int digit = num % 10;

                if (digit > max)
                    max = digit;

                if (digit < min)
                    min = digit;

                num = num / 10;
            }

            int range = max - min;

            if (range > maxRange) {
                maxRange = range;
            }
        }

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int max = 0;
            int min = 9;

            while (num > 0) {
                int digit = num % 10;

                if (digit > max)
                    max = digit;

                if (digit < min)
                    min = digit;

                num = num / 10;
            }

            int range = max - min;

            if (range == maxRange) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
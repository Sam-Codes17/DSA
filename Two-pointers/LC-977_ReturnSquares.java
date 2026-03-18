class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int idx = n - 1;
        int[] result = new int[n];

        while (l <= h) {
            if (nums[l] * nums[l] >= nums[h] * nums[h]) {
                result[idx] = nums[l] * nums[l];
                l++;
            } else {
                result[idx] = nums[h] * nums[h];
                h--;
            }
            idx--;
        }

        return result;
        
    }
}

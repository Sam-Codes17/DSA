class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int h = 1;
        int k = 1;
        int n = nums.length;

        while (h < n) {
            if (nums[h] == nums[h - 1]) {
                h++;
                continue;
            }
            nums[l + 1] = nums[h];
            k++;
            l++;
            h++;
        }
        return k;
    }
}

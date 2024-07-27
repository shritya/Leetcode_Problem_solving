class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(b[i]);
        }
        return k;
    }
}
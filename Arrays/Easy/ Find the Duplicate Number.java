class Solution {
    public  int findDuplicate(int[] nums) {
        sort(nums);
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                break;
            }
        }
        return nums[i];
    }
    public  void sort(int[] nums) {
        
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(i, correct,nums);
            }
            else
                i++;
        }
    }
    public  void swap(int i , int j,int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
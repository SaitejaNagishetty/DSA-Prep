//Approach 1
class Solution {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int ctr=0;
        for(int j = 0 ; j < nums.length - 1 ; j++)
        {
            int i = j;
            while(i < nums.length - 1 && nums[i]==nums[i+1] ){
                if(nums[i]==nums[nums.length-1])
                    return ctr+1;
                move(i+1, nums);
            }
            if(nums[i]!=nums[i+1])
                ctr++;
        }
        return ctr+1;
        
    }    
    public static void move(int i, int[] nums){
        for(;i < nums.length - 1; i++){
            nums[i]=nums[i+1];
        }
    }
}

//Approach 2
public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
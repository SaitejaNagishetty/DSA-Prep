class Solution {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(nums);

    }
    public static void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for(int i = 0;i<nums.length ; i++)
        {
            if(nums[i]==0)
                r++;
            else if(nums[i]==1)
                w++;
            else
                b++; 
        }
        int j = 0;
        while(r>0){
            nums[j]=0;
            j++;
            r--;
        }
        while(w>0){
            nums[j]=1;
            j++;
            w--;
        }
        while(b>0){
            nums[j]=2;
            j++;
            b--;
        }
    }

}
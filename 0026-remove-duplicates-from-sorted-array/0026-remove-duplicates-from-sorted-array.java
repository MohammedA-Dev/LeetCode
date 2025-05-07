class Solution {
    public int removeDuplicates(int[] nums) {
        int x = 1;
        int nextnum = 1;
        
        while(x<nums.length){
            if(nums[nextnum-1] != nums[x]){
                nums[nextnum] = nums[x];
                nextnum++;
            }
            x++;
        }

        return nextnum;
    }
}
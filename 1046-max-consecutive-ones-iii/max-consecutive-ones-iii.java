class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,right=0,zeroCount=0,max=0;
        while(right<nums.length){
            if(nums[right]==0)zeroCount++;
            while(zeroCount>k){
                if(nums[left]==0)zeroCount--;
                left++;
            }
            int curWindow=right-left+1;
            if(curWindow>max)max=curWindow;
            right++;
        }
        return max;
    }
}
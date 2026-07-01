class Solution {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int ans = -1;
        int i = 0;

        while(i<nums.length){
            int count = 1;
            while(i + 1 < nums.length && nums[i] == nums[i+1]){
                count++;
                i++;
            }
            if(nums[i] %2 == 0){
                if(count > max){
                    max = count;
                    ans = nums[i];
                }
            }
            i++;
        }
        return ans;
    }
}
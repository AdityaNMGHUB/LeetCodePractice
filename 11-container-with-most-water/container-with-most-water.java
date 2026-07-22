class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            if(height[left] <=height[right]){
                int newMax = height[left]*(right-left);
                max =(newMax>=max)? newMax:max;
                left++;
            }else{
                int newMax =height[right]*(right-left);
                max =(newMax>=max)? newMax:max;
                right--;
            }
        }
        return max;
    }
}
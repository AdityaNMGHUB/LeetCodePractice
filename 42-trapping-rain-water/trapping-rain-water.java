class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size == 0) return 0; 
        
        int[] right = new int[size];
        int[] left = new int[size];
        
        
        right[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        
        
        left[0] = height[0];
        for (int i = 1; i < size; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int min = Math.min(left[i], right[i]);
            sum += min - height[i];
        }
        return sum;
    }
}
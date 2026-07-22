class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] freq=new int[1001];
        for (int[] arr:nums) {
            for (int num:arr) {
                freq[num]++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int i=1;i<=1000;i++) {
            if (freq[i]==nums.length) {
                ans.add(i);
            }
        }
        return ans;
    }
}